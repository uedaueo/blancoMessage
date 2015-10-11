/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */
package blanco.message.message;

/**
 * blancoMessageが内部的に利用するメッセージクラスです。
 */
public class BlancoMessageMessage {
    /**
     * メッセージをプロパティファイル対応させるための内部的に利用するリソースバンドルクラス。
     */
    protected final BlancoMessageMessageResourceBundle fBundle = new BlancoMessageMessageResourceBundle();

    /**
     * 文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]
     *
     * No.2:
     */
    public static final String MBMSGI01 = "[MBMSGI01] メッセージ定義ID[{0}]のパッケージ名が指定されていません。";

    /**
     * キー値: KEY_MBMSGI01
     *
     * No.2:
     */
    public static final String KEY_MBMSGI01 = "MBMSGI01";

    /**
     * 文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]
     *
     * No.3:
     */
    public static final String MBMSGI02 = "[MBMSGI02] サポートしない出力プログラミング言語処理系[{0}]が指定されました。";

    /**
     * キー値: KEY_MBMSGI02
     *
     * No.3:
     */
    public static final String KEY_MBMSGI02 = "MBMSGI02";

    /**
     * 文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]
     *
     * No.4:
     */
    public static final String MBMSGI03 = "[MBMSGI03] メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。";

    /**
     * キー値: KEY_MBMSGI03
     *
     * No.4:
     */
    public static final String KEY_MBMSGI03 = "MBMSGI03";

    /**
     * 文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]
     *
     * No.5:
     */
    public static final String MBMSGI04 = "[MBMSGI04] メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。";

    /**
     * キー値: KEY_MBMSGI04
     *
     * No.5:
     */
    public static final String KEY_MBMSGI04 = "MBMSGI04";

    /**
     * 文字列[メタディレクトリ[{0}]が存在しません。]
     *
     * No.8:
     */
    public static final String MBMSGA01 = "[MBMSGA01] メタディレクトリ[{0}]が存在しません。";

    /**
     * キー値: KEY_MBMSGA01
     *
     * No.8:
     */
    public static final String KEY_MBMSGA01 = "MBMSGA01";

    /**
     * メッセージ定義ID[BlancoMessage]、キー[MBMSGI01]の文字列を取得します。
     *
     * No.2:
     * 文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]
     *
     * @param arg0 置換文字列{0}の値。
     * @return メッセージ文字列。
     */
    public String getMbmsgi01(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMbmsgi01]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return "[MBMSGI01] " + fBundle.getMbmsgi01(arg0);
    }

    /**
     * メッセージ定義ID[BlancoMessage]、キー[MBMSGI02]の文字列を取得します。
     *
     * No.3:
     * 文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]
     *
     * @param arg0 置換文字列{0}の値。
     * @return メッセージ文字列。
     */
    public String getMbmsgi02(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMbmsgi02]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return "[MBMSGI02] " + fBundle.getMbmsgi02(arg0);
    }

    /**
     * メッセージ定義ID[BlancoMessage]、キー[MBMSGI03]の文字列を取得します。
     *
     * No.4:
     * 文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]
     *
     * @param arg0 置換文字列{0}の値。
     * @param arg1 置換文字列{1}の値。
     * @return メッセージ文字列。
     */
    public String getMbmsgi03(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMbmsgi03]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("メソッド[getMbmsgi03]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return "[MBMSGI03] " + fBundle.getMbmsgi03(arg0, arg1);
    }

    /**
     * メッセージ定義ID[BlancoMessage]、キー[MBMSGI04]の文字列を取得します。
     *
     * No.5:
     * 文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]
     *
     * @param arg0 置換文字列{0}の値。
     * @param arg1 置換文字列{1}の値。
     * @param arg2 置換文字列{2}の値。
     * @param arg3 置換文字列{3}の値。
     * @return メッセージ文字列。
     */
    public String getMbmsgi04(final String arg0, final String arg1, final String arg2, final String arg3) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMbmsgi04]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("メソッド[getMbmsgi04]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("メソッド[getMbmsgi04]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg3 == null) {
            throw new IllegalArgumentException("メソッド[getMbmsgi04]のパラメータ[arg3]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return "[MBMSGI04] " + fBundle.getMbmsgi04(arg0, arg1, arg2, arg3);
    }

    /**
     * メッセージ定義ID[BlancoMessage]、キー[MBMSGA01]の文字列を取得します。
     *
     * No.8:
     * 文字列[メタディレクトリ[{0}]が存在しません。]
     *
     * @param arg0 置換文字列{0}の値。
     * @return メッセージ文字列。
     */
    public String getMbmsga01(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMbmsga01]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return "[MBMSGA01] " + fBundle.getMbmsga01(arg0);
    }
}
