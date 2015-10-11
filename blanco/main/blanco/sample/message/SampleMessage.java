/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */
package blanco.sample.message;

/**
 * メッセージのサンプル。このクラスは単にサンプルです。実際の動作には利用されません。
 */
public class SampleMessage {
    /**
     * メッセージをプロパティファイル対応させるための内部的に利用するリソースバンドルクラス。
     */
    protected final SampleMessageResourceBundle fBundle = new SampleMessageResourceBundle();

    /**
     * 文字列[メッセージのサンプル。その１。]
     *
     * No.1:
     */
    public static final String MESSAGE001 = "メッセージのサンプル。その１。";

    /**
     * キー値: KEY_MESSAGE001
     *
     * No.1:
     */
    public static final String KEY_MESSAGE001 = "MESSAGE001";

    /**
     * 文字列[メッセージ置換文字[{0}]が置換されます。]
     *
     * No.2:
     */
    public static final String MESSAGE002 = "メッセージ置換文字[{0}]が置換されます。";

    /**
     * キー値: KEY_MESSAGE002
     *
     * No.2:
     */
    public static final String KEY_MESSAGE002 = "MESSAGE002";

    /**
     * 文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]
     *
     * No.3:
     */
    public static final String MESSAGE003 = "メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。";

    /**
     * キー値: KEY_MESSAGE003
     *
     * No.3:
     */
    public static final String KEY_MESSAGE003 = "MESSAGE003";

    /**
     * 文字列[連続したメッセージ置換文字{0}{1}の例です。]
     *
     * No.4:
     */
    public static final String MESSAGE004 = "連続したメッセージ置換文字{0}{1}の例です。";

    /**
     * キー値: KEY_MESSAGE004
     *
     * No.4:
     */
    public static final String KEY_MESSAGE004 = "MESSAGE004";

    /**
     * 文字列[{0}先頭から置換文字列がある例。]
     *
     * No.5:
     */
    public static final String MESSAGE005 = "{0}先頭から置換文字列がある例。";

    /**
     * キー値: KEY_MESSAGE005
     *
     * No.5:
     */
    public static final String KEY_MESSAGE005 = "MESSAGE005";

    /**
     * 文字列[最後が置換文字列の例。{0}]
     *
     * No.6:
     */
    public static final String MESSAGE006 = "最後が置換文字列の例。{0}";

    /**
     * キー値: KEY_MESSAGE006
     *
     * No.6:
     */
    public static final String KEY_MESSAGE006 = "MESSAGE006";

    /**
     * 文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]
     *
     * No.7:
     */
    public static final String MESSAGE007 = "何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}";

    /**
     * キー値: KEY_MESSAGE007
     *
     * No.7:
     */
    public static final String KEY_MESSAGE007 = "MESSAGE007";

    /**
     * 文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]
     *
     * No.8:
     */
    public static final String MESSAGE008 = "たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。";

    /**
     * キー値: KEY_MESSAGE008
     *
     * No.8:
     */
    public static final String KEY_MESSAGE008 = "MESSAGE008";

    /**
     * 文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]
     *
     * No.9:
     */
    public static final String MESSAGE009 = "{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。";

    /**
     * キー値: KEY_MESSAGE009
     *
     * No.9:
     */
    public static final String KEY_MESSAGE009 = "MESSAGE009";

    /**
     * 文字列[エスケープ処理の確認。ダブルクオーテーション&amp;quot;、シングルクオーテーション'、エンマーク\。]
     *
     * No.10:
     */
    public static final String MESSAGE010 = "エスケープ処理の確認。ダブルクオーテーション\"、シングルクオーテーション'、エンマーク\\。";

    /**
     * キー値: KEY_MESSAGE010
     *
     * No.10:
     */
    public static final String KEY_MESSAGE010 = "MESSAGE010";

    /**
     * 文字列[×]
     *
     * No.11:
     */
    public static final String MESSAGE011 = "×";

    /**
     * キー値: KEY_MESSAGE011
     *
     * No.11:
     */
    public static final String KEY_MESSAGE011 = "MESSAGE011";

    /**
     * 文字列[改行[\n]の試験。]
     *
     * No.12:
     */
    public static final String MESSAGE012 = "改行[\n]の試験。";

    /**
     * キー値: KEY_MESSAGE012
     *
     * No.12:
     */
    public static final String KEY_MESSAGE012 = "MESSAGE012";

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE001]の文字列を取得します。
     *
     * No.1:
     * 文字列[メッセージのサンプル。その１。]
     *
     * @return メッセージ文字列。
     */
    public String getMessage001() {
        return fBundle.getMessage001();
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE002]の文字列を取得します。
     *
     * No.2:
     * 文字列[メッセージ置換文字[{0}]が置換されます。]
     *
     * @param arg0 置換文字列{0}の値。
     * @return メッセージ文字列。
     */
    public String getMessage002(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMessage002]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return fBundle.getMessage002(arg0);
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE003]の文字列を取得します。
     *
     * No.3:
     * 文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]
     *
     * @param arg0 置換文字列{0}の値。
     * @param arg1 置換文字列{1}の値。
     * @return メッセージ文字列。
     */
    public String getMessage003(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMessage003]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("メソッド[getMessage003]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return fBundle.getMessage003(arg0, arg1);
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE004]の文字列を取得します。
     *
     * No.4:
     * 文字列[連続したメッセージ置換文字{0}{1}の例です。]
     *
     * @param arg0 置換文字列{0}の値。
     * @param arg1 置換文字列{1}の値。
     * @return メッセージ文字列。
     */
    public String getMessage004(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMessage004]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("メソッド[getMessage004]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return fBundle.getMessage004(arg0, arg1);
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE005]の文字列を取得します。
     *
     * No.5:
     * 文字列[{0}先頭から置換文字列がある例。]
     *
     * @param arg0 置換文字列{0}の値。
     * @return メッセージ文字列。
     */
    public String getMessage005(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMessage005]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return fBundle.getMessage005(arg0);
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE006]の文字列を取得します。
     *
     * No.6:
     * 文字列[最後が置換文字列の例。{0}]
     *
     * @param arg0 置換文字列{0}の値。
     * @return メッセージ文字列。
     */
    public String getMessage006(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMessage006]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return fBundle.getMessage006(arg0);
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE007]の文字列を取得します。
     *
     * No.7:
     * 文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]
     *
     * @param arg0 置換文字列{0}の値。
     * @param arg1 置換文字列{1}の値。
     * @param arg2 置換文字列{2}の値。
     * @return メッセージ文字列。
     */
    public String getMessage007(final String arg0, final String arg1, final String arg2) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMessage007]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("メソッド[getMessage007]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("メソッド[getMessage007]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return fBundle.getMessage007(arg0, arg1, arg2);
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE008]の文字列を取得します。
     *
     * No.8:
     * 文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]
     *
     * @param arg0 置換文字列{0}の値。
     * @param arg1 置換文字列{1}の値。
     * @param arg2 置換文字列{2}の値。
     * @param arg3 置換文字列{3}の値。
     * @param arg4 置換文字列{4}の値。
     * @param arg5 置換文字列{5}の値。
     * @param arg6 置換文字列{6}の値。
     * @param arg7 置換文字列{7}の値。
     * @param arg8 置換文字列{8}の値。
     * @param arg9 置換文字列{9}の値。
     * @param arg10 置換文字列{10}の値。
     * @param arg11 置換文字列{11}の値。
     * @return メッセージ文字列。
     */
    public String getMessage008(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4, final String arg5, final String arg6, final String arg7, final String arg8, final String arg9, final String arg10, final String arg11) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg3 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg3]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg4 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg4]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg5 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg5]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg6 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg6]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg7 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg7]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg8 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg8]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg9 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg9]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg10 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg10]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg11 == null) {
            throw new IllegalArgumentException("メソッド[getMessage008]のパラメータ[arg11]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return fBundle.getMessage008(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE009]の文字列を取得します。
     *
     * No.9:
     * 文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]
     *
     * @param arg0 置換文字列{0}の値。
     * @param arg1 置換文字列{1}の値。
     * @return メッセージ文字列。
     */
    public String getMessage009(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMessage009]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("メソッド[getMessage009]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return fBundle.getMessage009(arg0, arg1);
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE010]の文字列を取得します。
     *
     * No.10:
     * 文字列[エスケープ処理の確認。ダブルクオーテーション&quot;、シングルクオーテーション'、エンマーク\。]
     *
     * @return メッセージ文字列。
     */
    public String getMessage010() {
        return fBundle.getMessage010();
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE011]の文字列を取得します。
     *
     * No.11:
     * 文字列[×]
     *
     * @return メッセージ文字列。
     */
    public String getMessage011() {
        return fBundle.getMessage011();
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE012]の文字列を取得します。
     *
     * No.12:
     * 文字列[改行[\n]の試験。]
     *
     * @return メッセージ文字列。
     */
    public String getMessage012() {
        return fBundle.getMessage012();
    }
}
