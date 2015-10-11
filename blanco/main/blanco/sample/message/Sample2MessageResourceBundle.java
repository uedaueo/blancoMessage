/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.sample.message;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * メッセージ定義[Sample2]が内部的に利用するリソースバンドルクラス。
 *
 * リソースバンドル定義: [Sample2Message]。<BR>
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 */
class Sample2MessageResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * Sample2MessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[Sample2Message]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public Sample2MessageResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/sample/message/Sample2Message");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * Sample2MessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[Sample2Message]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public Sample2MessageResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/sample/message/Sample2Message", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * Sample2MessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[Sample2Message]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public Sample2MessageResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/sample/message/Sample2Message", locale, loader);
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
     * bundle[Sample2Message], key[MESSAGE001]
     *
     * [メッセージのサンプル。その１。] (ja)<br>
     *
     * @return key[MESSAGE001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage001() {
        // 初期値として定義書の値を利用します。
        String strFormat = "メッセージのサンプル。その１。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE001");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[Sample2Message], key[MESSAGE002]
     *
     * [メッセージ置換文字[{0}]が置換されます。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[MESSAGE002]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage002(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "メッセージ置換文字[{0}]が置換されます。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE002");
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
     * bundle[Sample2Message], key[MESSAGE003]
     *
     * [メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[MESSAGE003]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage003(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE003");
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
     * bundle[Sample2Message], key[MESSAGE004]
     *
     * [連続したメッセージ置換文字{0}{1}の例です。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[MESSAGE004]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage004(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "連続したメッセージ置換文字{0}{1}の例です。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE004");
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
     * bundle[Sample2Message], key[MESSAGE005]
     *
     * [{0}先頭から置換文字列がある例。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[MESSAGE005]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage005(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}先頭から置換文字列がある例。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE005");
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
     * bundle[Sample2Message], key[MESSAGE006]
     *
     * [最後が置換文字列の例。{0}] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[MESSAGE006]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage006(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "最後が置換文字列の例。{0}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE006");
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
     * bundle[Sample2Message], key[MESSAGE007]
     *
     * [何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[MESSAGE007]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage007(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE007");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample2Message], key[MESSAGE008]
     *
     * [たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @param arg3 置換文字列{3}を置換する値。java.lang.String型を与えてください。
     * @param arg4 置換文字列{4}を置換する値。java.lang.String型を与えてください。
     * @param arg5 置換文字列{5}を置換する値。java.lang.String型を与えてください。
     * @param arg6 置換文字列{6}を置換する値。java.lang.String型を与えてください。
     * @param arg7 置換文字列{7}を置換する値。java.lang.String型を与えてください。
     * @param arg8 置換文字列{8}を置換する値。java.lang.String型を与えてください。
     * @param arg9 置換文字列{9}を置換する値。java.lang.String型を与えてください。
     * @param arg10 置換文字列{10}を置換する値。java.lang.String型を与えてください。
     * @param arg11 置換文字列{11}を置換する値。java.lang.String型を与えてください。
     * @return key[MESSAGE008]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage008(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4, final String arg5, final String arg6, final String arg7, final String arg8, final String arg9, final String arg10, final String arg11) {
        // 初期値として定義書の値を利用します。
        String strFormat = "たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE008");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample2Message], key[MESSAGE009]
     *
     * [{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[MESSAGE009]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage009(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE009");
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
     * bundle[Sample2Message], key[MESSAGE010]
     *
     * [エスケープ処理の確認。ダブルクオーテーション&quot;、シングルクオーテーション'、エンマーク\。] (ja)<br>
     *
     * @return key[MESSAGE010]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage010() {
        // 初期値として定義書の値を利用します。
        String strFormat = "エスケープ処理の確認。ダブルクオーテーション\"、シングルクオーテーション'、エンマーク\\。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE010");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[Sample2Message], key[MESSAGE011]
     *
     * [×] (ja)<br>
     *
     * @return key[MESSAGE011]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage011() {
        // 初期値として定義書の値を利用します。
        String strFormat = "×";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE011");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[Sample2Message], key[MESSAGE012]
     *
     * [改行[\n]の試験。] (ja)<br>
     *
     * @return key[MESSAGE012]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMessage012() {
        // 初期値として定義書の値を利用します。
        String strFormat = "改行[\n]の試験。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE012");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }
}
