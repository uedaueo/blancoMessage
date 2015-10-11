/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.message.task;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;

import blanco.message.BlancoMessageConstants;
import blanco.message.BlancoMessageMeta2Xml;
import blanco.message.BlancoMessageXml2SourceFile;
import blanco.message.message.BlancoMessageMessage;
import blanco.message.resourcebundle.BlancoMessageResourceBundle;
import blanco.message.task.valueobject.BlancoMessageProcessInput;

public class BlancoMessageProcessImpl implements BlancoMessageProcess {
    /**
     * メッセージ。
     */
    private final BlancoMessageMessage fMsg = new BlancoMessageMessage();

    /**
     * このプロダクトのリソースバンドルへのアクセスオブジェクト。
     */
    private final BlancoMessageResourceBundle fBundle = new BlancoMessageResourceBundle();

    public int execute(BlancoMessageProcessInput input) throws IOException,
            IllegalArgumentException {
        System.out.println("- " + BlancoMessageConstants.PRODUCT_NAME + " ("
                + BlancoMessageConstants.VERSION + ")");

        try {
            final File fileMetadir = new File(input.getMetadir());
            if (fileMetadir.exists() == false) {
                throw new IllegalArgumentException(fMsg.getMbmsga01(input
                        .getMetadir()));
            }

            if ("true".equals(fBundle
                    .getXml2sourceFileNoGenerateConstantIfFormatElementExist())) {
                System.out
                        .println(fBundle
                                .getXml2sourceFileNoGenerateConstantIfFormatElementExistMsg());
            }

            // テンポラリディレクトリを作成。
            new File(input.getTmpdir()
                    + BlancoMessageConstants.TARGET_SUBDIRECTORY).mkdirs();

            // 指定されたメタディレクトリを処理します。
            new BlancoMessageMeta2Xml().processDirectory(fileMetadir, input
                    .getTmpdir()
                    + BlancoMessageConstants.TARGET_SUBDIRECTORY);

            // XML化された中間ファイルからソースコードを生成
            final File[] fileMeta2 = new File(input.getTmpdir()
                    + BlancoMessageConstants.TARGET_SUBDIRECTORY).listFiles();
            for (int index = 0; index < fileMeta2.length; index++) {
                if (fileMeta2[index].getName().endsWith(".xml") == false) {
                    continue;
                }

                final BlancoMessageXml2SourceFile xml2source = new BlancoMessageXml2SourceFile();
                xml2source.setEncoding(input.getEncoding());
                xml2source.setIsJavaJsf(input.getIsJavaJsf());
                xml2source.setIsJavaStruts(input.getIsJavaStruts());
                xml2source.process(fileMeta2[index], input.getTargetlang(),
                        input.getConstants(), new File(input.getTargetdir()));
            }

            return BlancoMessageBatchProcess.END_SUCCESS;
        } catch (TransformerException ex) {
            throw new IOException("XML変換の過程で例外が発生しました: " + ex.toString());
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean progress(final String argProgressMessage) {
        System.out.println(argProgressMessage);
        return false;
    }
}
