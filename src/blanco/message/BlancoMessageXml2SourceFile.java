/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.message;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.BlancoCgSupportedLang;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.util.BlancoCgLineUtil;
import blanco.cg.util.BlancoCgSourceUtil;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoNameAdjuster;
import blanco.commons.util.BlancoStringUtil;
import blanco.message.message.BlancoMessageMessage;
import blanco.message.resourcebundle.BlancoMessageResourceBundle;
import blanco.message.valueobject.BlancoMessageFieldStructure;
import blanco.message.valueobject.BlancoMessageStructure;
import blanco.resourcebundle.BlancoResourceBundleUtil;
import blanco.resourcebundle.BlancoResourceBundleXml2JavaClass;
import blanco.resourcebundle.BlancoResourceBundleXml2Properties;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleResourceStringStructure;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleStructure;

/**
 * 「メッセージ定義書」Excel様式からメッセージを処理するクラス・ソースコードを生成。
 * 
 * このクラスは、中間XMLファイルからソースコードを自動生成する機能を担います。
 * 
 * @author IGA Tosiki
 */
public class BlancoMessageXml2SourceFile {
    private final BlancoMessageMessage fMsg = new BlancoMessageMessage();

    /**
     * このプロダクトのリソースバンドルへのアクセスオブジェクト。
     */
    private final BlancoMessageResourceBundle fBundle = new BlancoMessageResourceBundle();

    /**
     * 出力対象となるプログラミング言語。
     */
    private int fTargetLang = BlancoCgSupportedLang.NOT_DEFINED;

    /**
     * 文字列を定数としてクラスに出力するかどうか。
     */
    private boolean fIsGenerateConstants = false;

    /**
     * 内部的に利用するblancoCg用ファクトリ。
     */
    private BlancoCgObjectFactory fCgFactory = null;

    /**
     * 内部的に利用するblancoCg用ソースファイル情報。
     */
    private BlancoCgSourceFile fCgSourceFile = null;

    /**
     * 内部的に利用するblancoCg用クラス情報。
     */
    private BlancoCgClass fCgClass = null;

    /**
     * 自動生成するソースファイルの文字エンコーディング。
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    private boolean fIsJavaJsf = false;

    public void setIsJavaJsf(final boolean arg) {
        fIsJavaJsf = arg;
    }

    private boolean fIsJavaStruts = false;

    public void setIsJavaStruts(final boolean arg) {
        fIsJavaStruts = arg;
    }

    /**
     * 中間XMLファイルからソースコードを自動生成します。
     * 
     * @param argMetaXmlSourceFile
     *            メタ情報が含まれているXMLファイル。
     * @param argTargetLang
     *            出力対象プログラミング言語。
     * @param argDirectoryTarget
     *            ソースコード生成先ディレクトリ (/mainを除く部分を指定します)。
     * @param argIsGenerateConstants
     *            文字列定数をクラスに出力するかどうかのフラグ。
     * @throws IOException
     *             入出力例外が発生した場合。
     */
    public void process(final File argMetaXmlSourceFile, final String argTargetLang,
            final boolean argIsGenerateConstants, final File argDirectoryTarget) throws IOException {

        fTargetLang = new BlancoCgSupportedLang().convertToInt(argTargetLang);
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        case BlancoCgSupportedLang.CS:
        case BlancoCgSupportedLang.JS:
        case BlancoCgSupportedLang.VB:
        case BlancoCgSupportedLang.PHP:
        case BlancoCgSupportedLang.RUBY:
        case BlancoCgSupportedLang.PYTHON:
        case BlancoCgSupportedLang.DELPHI:
            break;
        default:
            throw new IllegalArgumentException(fMsg.getMbmsgi02(argTargetLang));
        }

        fIsGenerateConstants = argIsGenerateConstants;

        final BlancoMessageStructure[] structures = new BlancoMessageXmlParser().parse(argMetaXmlSourceFile);

        for (int index = 0; index < structures.length; index++) {
            // メタ情報の解析結果をもとにソースコード自動生成を実行します。
            structure2Source(structures[index], argDirectoryTarget);

            if (fTargetLang == BlancoCgSupportedLang.JAVA) {
                expandResourceBundleForJava(structures[index], argDirectoryTarget);
            }
        }
    }

    /**
     * 指定のシートの記述内容を展開します。
     * 
     * @param argStructure
     *            タスクの構造。
     * @param argDirectoryTarget
     *            出力先ディレクトリ
     */
    public void structure2Source(final BlancoMessageStructure argStructure, final File argDirectoryTarget) {
        // 従来と互換性を持たせるため、/mainサブフォルダに出力します。
        final File fileBlancoMain = new File(argDirectoryTarget.getAbsolutePath() + "/main");

        fCgFactory = BlancoCgObjectFactory.getInstance();
        fCgSourceFile = fCgFactory.createSourceFile(argStructure.getPackage(),
                "このソースコードは blanco Frameworkによって自動生成されています。");
        fCgSourceFile.setEncoding(fEncoding);
        switch (fTargetLang) {
        case BlancoCgSupportedLang.DELPHI:
            // Delphi言語では、Unit名との名前衝突を避けるため、慣例に従いクラス名に強制的にTをつけます。
            fCgSourceFile.setName(argStructure.getName() + BlancoStringUtil.null2Blank(argStructure.getSuffix()));
            fCgClass = fCgFactory.createClass("T" + BlancoNameAdjuster.toClassName(argStructure.getName())
                    + BlancoStringUtil.null2Blank(argStructure.getSuffix()),
                    BlancoStringUtil.null2Blank(argStructure.getDescription()));
            break;
        default:
            fCgClass = fCgFactory.createClass(
                    BlancoNameAdjuster.toClassName(argStructure.getName())
                            + BlancoStringUtil.null2Blank(argStructure.getSuffix()),
                    BlancoStringUtil.null2Blank(argStructure.getDescription()));
            break;
        }
        fCgSourceFile.getClassList().add(fCgClass);

        if (fTargetLang == BlancoCgSupportedLang.JAVA) {
            // Javaの場合にはリソースバンドルを利用。
            final BlancoCgField field = new BlancoCgField();
            field.setName("fBundle");
            field.setType(fCgFactory.createType(argStructure.getPackage() + "."
                    + BlancoNameAdjuster.toClassName(argStructure.getName()) + argStructure.getSuffix()
                    + "ResourceBundle"));
            field.setDescription("メッセージをプロパティファイル対応させるための内部的に利用するリソースバンドルクラス。");
            field.setDefault("new " + BlancoNameAdjuster.toClassName(argStructure.getName()) + argStructure.getSuffix()
                    + "ResourceBundle()");
            field.setFinal(true);
            field.setAccess("protected");
            fCgClass.getFieldList().add(field);
        }

        if (fIsGenerateConstants) {
            expandFieldMessage(argStructure);
        }

        expandMethodGetMessage(argStructure);

        if (fIsJavaJsf) {
            expandMethodGetFacesMessage(argStructure);
        }
        if (fIsJavaStruts) {
            expandMethodGetStrutsMessage(argStructure);
            expandStrutsMessageBundle(argStructure, fileBlancoMain);
        }

        BlancoCgTransformerFactory.getSourceTransformer(fTargetLang).transform(fCgSourceFile, fileBlancoMain);
    }

    /**
     * 定数フィールドを展開します。
     * 
     * @param argProcessStructure
     *            メタファイルから収集できた処理構造データ。
     */
    @SuppressWarnings("unchecked")
    private void expandFieldMessage(final BlancoMessageStructure argProcessStructure) {

        for (int indexField = 0; indexField < argProcessStructure.getFieldList().size(); indexField++) {
            final BlancoMessageFieldStructure fieldLook = argProcessStructure.getFieldList().get(indexField);

            final String fieldName = fieldLook.getName().toUpperCase();

            // 「メッセージに置換文字列がある場合には定数フィールドは生成しない」という仕様を実現するかどうかのフラグへの対応。
            if ("true".equals(fBundle.getXml2sourceFileNoGenerateConstantIfFormatElementExist())) {
                final List listSplitMessage = new ArrayList();
                listSplitMessage.add(fieldLook.getMessage());
                final int maxReplaceNumber = new BlancoMessageSplitUtil().split(listSplitMessage);
                if (maxReplaceNumber >= 0) {
                    // 置換文字列が存在するので定数フィールドは生成しません。
                    continue;
                }
            }

            {
                // 定数化されたメッセージ。
                final BlancoCgField cgField = fCgFactory.createField(fieldName, getTypeString(), "文字列["
                        + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getMessage()) + "]");
                fCgClass.getFieldList().add(cgField);
                cgField.setAccess("public");
                cgField.setStatic(true);
                cgField.setFinal(true);
                cgField.setDefault(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                        + BlancoCgSourceUtil.escapeStringAsSource(fTargetLang,
                                (argProcessStructure.getIdEmbedding() ? "[" + fieldLook.getName() + "] " : "")
                                        + fieldLook.getMessage())
                        + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));

                if (fieldLook.getNo() != null) {
                    cgField.getLangDoc().getDescriptionList().add(fBundle.getXml2sourceFileFieldNo(fieldLook.getNo()));
                }
            }

            {
                // 定数化されたメッセージ ID。
                final BlancoCgField cgField = fCgFactory.createField("KEY_" + fieldName, getTypeString(), "キー値: "
                        + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, "KEY_" + fieldLook.getName()));
                fCgClass.getFieldList().add(cgField);
                cgField.setAccess("public");
                cgField.setStatic(true);
                cgField.setFinal(true);
                cgField.setDefault(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                        + BlancoCgSourceUtil.escapeStringAsSource(fTargetLang, fieldLook.getName())
                        + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));

                if (fieldLook.getNo() != null) {
                    cgField.getLangDoc().getDescriptionList().add(fBundle.getXml2sourceFileFieldNo(fieldLook.getNo()));
                }
            }
        }
    }

    /**
     * getメッセージ メソッドを展開します。
     * 
     * @param argProcessStructure
     *            メタファイルから収集できた処理構造データ。
     */
    @SuppressWarnings("unchecked")
    private void expandMethodGetMessage(final BlancoMessageStructure argProcessStructure) {

        for (int indexField = 0; indexField < argProcessStructure.getFieldList().size(); indexField++) {
            final BlancoMessageFieldStructure fieldLook = (BlancoMessageFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            final List listSplitMessage = new ArrayList();
            listSplitMessage.add((argProcessStructure.getIdEmbedding() ? "[" + fieldLook.getName() + "] " : "")
                    + fieldLook.getMessage());
            final int maxReplaceNumber = new BlancoMessageSplitUtil().split(listSplitMessage);

            final int blancoResourceBundleFormatCount = BlancoResourceBundleUtil.getFormatsByArgumentIndex(
                    fieldLook.getMessage(), false).length;

            if (maxReplaceNumber + 1 != blancoResourceBundleFormatCount) {
                throw new IllegalArgumentException(fMsg.getMbmsgi04(argProcessStructure.getName(), fieldLook.getName(),
                        Integer.toString(maxReplaceNumber + 1), Integer.toString(blancoResourceBundleFormatCount)));
            }

            switch (fTargetLang) {
            case BlancoCgSupportedLang.RUBY:
            case BlancoCgSupportedLang.PYTHON:
                new BlancoMessageSplitUtil().splitByNewLineChar(listSplitMessage);
                break;
            }
            final String methodName = "get" + BlancoNameAdjuster.toClassName(fieldLook.getName());

            final BlancoCgMethod cgMethod = fCgFactory.createMethod(getMethodName(methodName), "メッセージ定義ID["
                    + argProcessStructure.getName() + "]、キー[" + fieldLook.getName() + "]の文字列を取得します。");
            fCgClass.getMethodList().add(cgMethod);

            // System.out.println("置換文字列数:" + maxReplaceNumber);
            for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                cgMethod.getParameterList().add(
                        fCgFactory.createParameter("arg" + indexArg, getTypeString(), "置換文字列{" + indexArg + "}の値。",
                                true));
            }

            if (fieldLook.getNo() != null) {
                cgMethod.getLangDoc().getDescriptionList().add(fBundle.getXml2sourceFileFieldNo(fieldLook.getNo()));
            }
            cgMethod.getLangDoc().getDescriptionList()
                    .add("文字列[" + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getMessage()) + "]");

            cgMethod.setReturn(fCgFactory.createReturn(getTypeString(), "メッセージ文字列。"));

            final List lineList = cgMethod.getLineList();

            StringBuffer bufLine = new StringBuffer();

            switch (fTargetLang) {
            case BlancoCgSupportedLang.JAVA:
                if (true) {
                    final StringBuffer buf = new StringBuffer();
                    if (argProcessStructure.getIdEmbedding()) {
                        // ID埋め込み
                        buf.append(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang) + "[" + fieldLook.getName()
                                + "] " + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang) + " + ");
                    }
                    buf.append("fBundle.get" + BlancoNameAdjuster.toClassName(fieldLook.getName()) + "(");
                    for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                        if (indexArg != 0) {
                            buf.append(", ");
                        }
                        buf.append("arg" + indexArg);
                    }
                    buf.append(")");
                    bufLine.append(buf.toString());
                }
                break;
            case BlancoCgSupportedLang.RUBY:
            case BlancoCgSupportedLang.PYTHON:
                bufLine.append(getReturnStringRuby(listSplitMessage));
                break;
            default:
                bufLine.append(getReturnString(listSplitMessage));
                break;
            }

            switch (fTargetLang) {
            case BlancoCgSupportedLang.DELPHI:
                // Delphiにはreturn文がありません。
                lineList.add("result:= " + bufLine.toString() + BlancoCgLineUtil.getTerminator(fTargetLang));
                lineList.add("exit" + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            default:
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, bufLine.toString())
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            }
        }
    }

    /**
     * Java 言語専用の JSF メッセージ生成メソッド。
     * 
     * @param argProcessStructure
     */
    private void expandMethodGetFacesMessage(final BlancoMessageStructure argProcessStructure) {

        for (int indexField = 0; indexField < argProcessStructure.getFieldList().size(); indexField++) {
            final BlancoMessageFieldStructure fieldLook = (BlancoMessageFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            if (fTargetLang != BlancoCgSupportedLang.JAVA) {
                // Java 以外サポートしません。
                return;
            }

            final String methodName = "getFaces" + BlancoNameAdjuster.toClassName(fieldLook.getName());
            final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                    getMethodName(methodName),
                    "メッセージ: [" + fieldLook.getMessage() + "]");
            fCgClass.getMethodList().add(cgMethod);
            cgMethod.getLangDoc().getDescriptionList().add("<h3>情報</h3><ul>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>メッセージ定義ID: "
                            + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, argProcessStructure.getName())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>キー: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getName())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>レベル: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getLevel())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>メッセージ: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getMessage())
                            + "</li>");
            cgMethod.getLangDoc().getDescriptionList().add("</ul>");

            final List<String> listSplitMessage = new ArrayList<String>();
            listSplitMessage.add((argProcessStructure.getIdEmbedding() ? "[" + fieldLook.getName() + "] " : "")
                    + fieldLook.getMessage());
            final int maxReplaceNumber = new BlancoMessageSplitUtil().split(listSplitMessage);
            for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                cgMethod.getParameterList().add(
                        fCgFactory.createParameter("arg" + indexArg, getTypeString(), "置換文字列{" + indexArg + "}の値。",
                                true));
            }

            cgMethod.setReturn(fCgFactory.createReturn("javax.faces.application.FacesMessage", "JSF Faces メッセージ。"));

            final StringBuffer callParam = new StringBuffer();
            for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                if (indexArg != 0)
                    callParam.append(", ");
                callParam.append("arg" + indexArg);
            }

            String levelFaces = "INFO";
            if (fieldLook.getLevel() == null || fieldLook.getLevel().trim().length() == 0) {
                // 何もしません。
                levelFaces = "INFO";
            } else if (fieldLook.getLevel().equals("FATAL")) {
                levelFaces = "FATAL";
            } else if (fieldLook.getLevel().equals("ERROR")) {
                levelFaces = "ERROR";
            } else if (fieldLook.getLevel().equals("WARN")) {
                levelFaces = "WARN";
            } else if (fieldLook.getLevel().equals("INFO")) {
                levelFaces = "INFO";
            } else {
                // 仕方が無いので INFO 扱いとします。
                levelFaces = "INFO";
            }

            cgMethod.getLineList().add(
                    "return new FacesMessage(FacesMessage.SEVERITY_" + levelFaces + ", get"
                            + BlancoNameAdjuster.toClassName(fieldLook.getName()) + "(" + callParam + "), null);");
        }
    }

    /**
     * Java 言語専用の Apache Struts メッセージ生成メソッド。
     * 
     * struts-config.xml に <message-resources parameter="resources.ほげほげ"/>
     * を追加すること。
     * 
     * @param argProcessStructure
     */
    private void expandMethodGetStrutsMessage(final BlancoMessageStructure argProcessStructure) {

        for (int indexField = 0; indexField < argProcessStructure.getFieldList().size(); indexField++) {
            final BlancoMessageFieldStructure fieldLook = (BlancoMessageFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            if (fTargetLang != BlancoCgSupportedLang.JAVA) {
                // Java 以外サポートしません。
                return;
            }

            final String methodName = "addStruts" + BlancoNameAdjuster.toClassName(fieldLook.getName());
            final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                    getMethodName(methodName),
                    "メッセージ: [" + fieldLook.getMessage() + "]");
            fCgClass.getMethodList().add(cgMethod);
            cgMethod.getLangDoc().getDescriptionList().add("<h3>情報</h3><ul>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>メッセージ定義ID: "
                            + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, argProcessStructure.getName())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>キー: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getName())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>レベル: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getLevel())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>メッセージ: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getMessage())
                            + "</li>");
            cgMethod.getLangDoc().getDescriptionList().add("</ul>");

            cgMethod.getParameterList().add(
                    fCgFactory.createParameter("actionMessages", "org.apache.struts.action.ActionMessages",
                            "Apache Struts Messages"));

            final List<String> listSplitMessage = new ArrayList<String>();
            listSplitMessage.add((argProcessStructure.getIdEmbedding() ? "[" + fieldLook.getName() + "] " : "")
                    + fieldLook.getMessage());
            final int maxReplaceNumber = new BlancoMessageSplitUtil().split(listSplitMessage);
            for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                cgMethod.getParameterList().add(
                        fCgFactory.createParameter("arg" + indexArg, getTypeString(), "置換文字列{" + indexArg + "}の値。",
                                true));
            }

            fCgSourceFile.getImportList().add("org.apache.struts.action.ActionMessage");

            final int STRUTS_MAX_ARG = 2; // 3 個を超えたら String 配列化します。(Struts 的には 4 個まで定義あり)
            final StringBuffer callParam = new StringBuffer();
            if (maxReplaceNumber > STRUTS_MAX_ARG) {
                // Apache Struts Message のコンストラクター引数上限対応
                callParam.append(", new String[] {");
            } else if (maxReplaceNumber >= 0) {
                // ポイント: ひとつもない場合は -1 です。
                callParam.append(", ");
            }
            for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                if (indexArg != 0)
                    callParam.append(", ");

                callParam.append("arg" + indexArg);
            }
            if (maxReplaceNumber > STRUTS_MAX_ARG) {
                callParam.append("}");
            }

            String levelCustomMessage = "INFO";
            if (fieldLook.getLevel() == null || fieldLook.getLevel().trim().length() == 0) {
                levelCustomMessage = "INFO";
            } else if (fieldLook.getLevel().equals("FATAL")) {
                levelCustomMessage = "FATAL";
            } else if (fieldLook.getLevel().equals("ERROR")) {
                levelCustomMessage = "ERROR";
            } else if (fieldLook.getLevel().equals("WARN")) {
                levelCustomMessage = "WARN";
            } else if (fieldLook.getLevel().equals("INFO")) {
                levelCustomMessage = "INFO";
            } else {
                // 仕方が無いので INFO 扱いとします。
                levelCustomMessage = "INFO";
            }

            cgMethod.getLineList().add(
                    "actionMessages.add(\"" + levelCustomMessage + "\", new ActionMessage(\""
                            + argProcessStructure.getPackage() + "." + fieldLook.getName() + "\"" + callParam + "));");
        }
    }

    private void expandStrutsMessageBundle(final BlancoMessageStructure argProcessStructure, final File fileBlancoMain) {
        final BlancoResourceBundleBundleStructure bundleStructure = new BlancoResourceBundleBundleStructure();
        bundleStructure.setPackage(argProcessStructure.getPackage());
        bundleStructure.setName(argProcessStructure.getName());
        bundleStructure.setDescription(argProcessStructure.getDescription());

        for (int indexField = 0; indexField < argProcessStructure.getFieldList().size(); indexField++) {
            final BlancoMessageFieldStructure fieldLook = (BlancoMessageFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            if (fTargetLang != BlancoCgSupportedLang.JAVA) {
                // Java 以外サポートしません。
                return;
            }

            final BlancoResourceBundleBundleItemStructure item = new BlancoResourceBundleBundleItemStructure();
            bundleStructure.getItemList().add(item);
            item.setKey(bundleStructure.getPackage() + "." + fieldLook.getName());
            BlancoResourceBundleBundleResourceStringStructure res = new BlancoResourceBundleBundleResourceStringStructure();
            res.setResourceString(fieldLook.getMessage());
            item.getResourceStringList().add(res);
        }

        final BlancoResourceBundleXml2Properties xml2Properties = new BlancoResourceBundleXml2Properties();
        xml2Properties.setPropertieswithdirectory(false);
        xml2Properties.structure2Properties(bundleStructure, null, fileBlancoMain);
    }

    /**
     * プログラミング言語処理系に合った String 型の名称を取得します。
     * 
     * 型の読み替え。
     * 
     * @return
     */
    private final String getTypeString() {
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        default:
            return "java.lang.String";
        case BlancoCgSupportedLang.CS:
            return "string";
        case BlancoCgSupportedLang.JS:
        case BlancoCgSupportedLang.PHP:
            return "string";
        case BlancoCgSupportedLang.VB:
        case BlancoCgSupportedLang.DELPHI:
            return "String";
        }
    }

    /**
     * プログラミング言語処理系に合った メソッドの名前変形をおこないます。
     * 
     * メソッド名の読み替え。
     * 
     * @return
     */
    private final String getMethodName(final String argMethodName) {
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        default:
            return argMethodName;
        case BlancoCgSupportedLang.CS:
        case BlancoCgSupportedLang.VB:
            return BlancoNameAdjuster.toUpperCaseTitle(argMethodName);
        case BlancoCgSupportedLang.JS:
            return argMethodName;
        }
    }

    /**
     * 
     * メッセージ文字列を生成する式を取得
     * 
     * @param listSplitMessage
     *            埋め込み文字列で分割されたメッセージのリスト
     * @return
     */
    @SuppressWarnings("unchecked")
    private StringBuffer getReturnString(final List listSplitMessage) {
        StringBuffer bufLine = new StringBuffer();
        boolean isPastString = false;
        for (int index = 0; index < listSplitMessage.size(); index++) {
            final Object objLook = listSplitMessage.get(index);
            if (objLook instanceof Integer) {
                // 置換文字列。
                final Integer intLook = (Integer) objLook;
                if (isPastString) {
                    bufLine.append(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));
                }
                isPastString = false;
                if (index != 0) {
                    bufLine.append(" " + BlancoCgLineUtil.getStringConcatenationOperator(fTargetLang) + " ");
                }
                if (fTargetLang == BlancoCgSupportedLang.PHP) {
                    bufLine.append("$");
                }
                bufLine.append("arg" + intLook.intValue());
            } else {
                if (isPastString == false) {
                    if (index != 0) {
                        bufLine.append(" " + BlancoCgLineUtil.getStringConcatenationOperator(fTargetLang) + " ");
                    }
                    bufLine.append(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));
                }
                isPastString = true;

                final String strLook = (String) objLook;
                bufLine.append(BlancoCgSourceUtil.escapeStringAsSource(fTargetLang, strLook));
            }
        }

        if (isPastString) {
            bufLine.append(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));
        }

        return bufLine;
    }

    /**
     * 
     * Ruby風言語において、メッセージ文字列を生成する式を取得
     * 
     * 改行文字を個別の文字列リテラルとして取り扱いたい場合に 使用します。
     * 
     * @param listSplitMessage
     *            埋め込み文字列で分割されたメッセージのリスト
     * @return
     */
    @SuppressWarnings("unchecked")
    private StringBuffer getReturnStringRuby(final List listSplitMessage) {
        StringBuffer bufLine = new StringBuffer();
        for (int index = 0; index < listSplitMessage.size(); index++) {
            final Object objLook = listSplitMessage.get(index);
            if (index != 0) {
                bufLine.append(" " + BlancoCgLineUtil.getStringConcatenationOperator(fTargetLang) + " ");
            }
            if (objLook instanceof Integer) {
                // 置換文字の場合。
                final Integer intLook = (Integer) objLook;

                if (fTargetLang == BlancoCgSupportedLang.PHP) {
                    bufLine.append("$");
                }
                bufLine.append("arg" + intLook.intValue());
            } else {
                // 文字列リテラルの場合。
                final String strLook = (String) objLook;

                // 改行文字のみの場合、文字列リテラルは\"で囲みます
                StringBuffer literalEnclosure = new StringBuffer();
                if ("\n".equals(strLook)) {
                    literalEnclosure.append("\"");
                } else {
                    literalEnclosure.append(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));
                }

                bufLine.append(literalEnclosure);
                bufLine.append(BlancoCgSourceUtil.escapeStringAsSource(fTargetLang, strLook));
                bufLine.append(literalEnclosure);
            }
        }

        return bufLine;
    }

    /**
     * Javaの場合にリソースバンドルクラスを生成します。
     * 
     * @param argStructure
     * @param argDirectoryTarget
     */
    private void expandResourceBundleForJava(final BlancoMessageStructure argStructure, final File argDirectoryTarget) {
        final BlancoResourceBundleBundleStructure bundleStructure = new BlancoResourceBundleBundleStructure();
        bundleStructure.setName(BlancoNameAdjuster.toClassName(argStructure.getName()) + argStructure.getSuffix());
        bundleStructure.setPackage(argStructure.getPackage());
        // クラスをパッケージアクセスに制限します。
        bundleStructure.setAccess("");
        bundleStructure.setSuffix("ResourceBundle");
        bundleStructure.setDescription("メッセージ定義[" + argStructure.getName() + "]が内部的に利用するリソースバンドルクラス。");

        // TODO デフォルトロケールを利用することにしています。
        final Locale defalutLocale = Locale.getDefault();

        for (int index = 0; index < argStructure.getFieldList().size(); index++) {
            final BlancoMessageFieldStructure fieldStructure = (BlancoMessageFieldStructure) argStructure
                    .getFieldList().get(index);
            final BlancoResourceBundleBundleItemStructure item = new BlancoResourceBundleBundleItemStructure();
            item.setKey(fieldStructure.getName());
            final BlancoResourceBundleBundleResourceStringStructure resourceString = new BlancoResourceBundleBundleResourceStringStructure();
            resourceString.setResourceString(BlancoStringUtil.null2Blank(fieldStructure.getMessage()));
            resourceString.setLocale(defalutLocale.getLanguage());
            item.getResourceStringList().add(resourceString);
            bundleStructure.getItemList().add(item);
        }

        final BlancoResourceBundleXml2JavaClass xml2java = new BlancoResourceBundleXml2JavaClass();
        xml2java.setEncoding(fEncoding);
        xml2java.structure2Source(bundleStructure, argDirectoryTarget);
    }
}
