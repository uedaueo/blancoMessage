/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.message.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * BlancoMessageが利用するリソースバンドルを蓄えます。
 *
 * リソースバンドル定義: [BlancoMessage]。<BR>
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 * 既知のロケール<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoMessageResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoMessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoMessage]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public BlancoMessageResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/message/resourcebundle/BlancoMessage");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoMessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoMessage]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public BlancoMessageResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/message/resourcebundle/BlancoMessage", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoMessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoMessage]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public BlancoMessageResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/message/resourcebundle/BlancoMessage", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * 内部的に保持しているリソースバンドルオブジェクトを取得します。
     *
     * @return 内部的に保持しているリソースバンドルオブジェクト。
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[BlancoMessage], key[METAFILE_DISPLAYNAME]
     *
     * [メッセージ定義書] (ja)<br>
     *
     * @return key[METAFILE_DISPLAYNAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMetafileDisplayname() {
        // 初期値として定義書の値を利用します。
        String strFormat = "メッセージ定義書";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METAFILE_DISPLAYNAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoMessage], key[XML2SOURCE_FILE.FIELD_NO]
     *
     * [No.{0}: ] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2SOURCE_FILE.FIELD_NO]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2sourceFileFieldNo(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "No.{0}: ";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2SOURCE_FILE.FIELD_NO");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoMessage], key[XML2SOURCE_FILE.DESCRIPTION]
     *
     * [説明:キー:[{0}]、文字列[{1}]] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2SOURCE_FILE.DESCRIPTION]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2sourceFileDescription(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "説明:キー:[{0}]、文字列[{1}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2SOURCE_FILE.DESCRIPTION");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoMessage], key[XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST]
     *
     * [false] (ja)<br>
     *
     * @return key[XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2sourceFileNoGenerateConstantIfFormatElementExist() {
        // 初期値として定義書の値を利用します。
        String strFormat = "false";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoMessage], key[XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST_MSG]
     *
     * [モード: メッセージに置換文字列がある場合には定数フィールドは生成しない。] (ja)<br>
     *
     * @return key[XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST_MSG]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2sourceFileNoGenerateConstantIfFormatElementExistMsg() {
        // 初期値として定義書の値を利用します。
        String strFormat = "モード: メッセージに置換文字列がある場合には定数フィールドは生成しない。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST_MSG");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }
}
