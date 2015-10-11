/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */

/**
 * デフォルトコンストラクタ
 * @fileoverview このソースコードは blanco Frameworkによって自動生成されています。
 * @class blancoMessageが内部的に利用するメッセージクラスです。
 * @constructor
 */
function BlancoMessageMessage() {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.BlancoMessageMessage のパラメータは[0]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }

}

/**
 * 文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]
 * @type string
 * No.2:
 */
BlancoMessageMessage.MBMSGI01 = "[MBMSGI01] メッセージ定義ID[{0}]のパッケージ名が指定されていません。";

/**
 * キー値: KEY_MBMSGI01
 * @type string
 * No.2:
 */
BlancoMessageMessage.KEY_MBMSGI01 = "MBMSGI01";

/**
 * 文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]
 * @type string
 * No.3:
 */
BlancoMessageMessage.MBMSGI02 = "[MBMSGI02] サポートしない出力プログラミング言語処理系[{0}]が指定されました。";

/**
 * キー値: KEY_MBMSGI02
 * @type string
 * No.3:
 */
BlancoMessageMessage.KEY_MBMSGI02 = "MBMSGI02";

/**
 * 文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]
 * @type string
 * No.4:
 */
BlancoMessageMessage.MBMSGI03 = "[MBMSGI03] メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。";

/**
 * キー値: KEY_MBMSGI03
 * @type string
 * No.4:
 */
BlancoMessageMessage.KEY_MBMSGI03 = "MBMSGI03";

/**
 * 文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]
 * @type string
 * No.5:
 */
BlancoMessageMessage.MBMSGI04 = "[MBMSGI04] メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。";

/**
 * キー値: KEY_MBMSGI04
 * @type string
 * No.5:
 */
BlancoMessageMessage.KEY_MBMSGI04 = "MBMSGI04";

/**
 * 文字列[メタディレクトリ[{0}]が存在しません。]
 * @type string
 * No.8:
 */
BlancoMessageMessage.MBMSGA01 = "[MBMSGA01] メタディレクトリ[{0}]が存在しません。";

/**
 * キー値: KEY_MBMSGA01
 * @type string
 * No.8:
 */
BlancoMessageMessage.KEY_MBMSGA01 = "MBMSGA01";

/**
 * メッセージ定義ID[BlancoMessage]、キー[MBMSGI01]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @return メッセージ文字列。
 * @type string
 * No.2:
 * 文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]
 */
BlancoMessageMessage.prototype.getMbmsgi01 = function(/* string */ arg0) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi01 のパラメータは[1]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi01 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }

    return "[MBMSGI01] メッセージ定義ID[" + arg0 + "]のパッケージ名が指定されていません。";
};

/**
 * メッセージ定義ID[BlancoMessage]、キー[MBMSGI02]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @return メッセージ文字列。
 * @type string
 * No.3:
 * 文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]
 */
BlancoMessageMessage.prototype.getMbmsgi02 = function(/* string */ arg0) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi02 のパラメータは[1]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi02 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }

    return "[MBMSGI02] サポートしない出力プログラミング言語処理系[" + arg0 + "]が指定されました。";
};

/**
 * メッセージ定義ID[BlancoMessage]、キー[MBMSGI03]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @param {string} arg1 置換文字列{1}の値。
 * @return メッセージ文字列。
 * @type string
 * No.4:
 * 文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]
 */
BlancoMessageMessage.prototype.getMbmsgi03 = function(/* string */ arg0, /* string */ arg1) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 2) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi03 のパラメータは[2]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi03 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi03 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg1) + "]型が与えられました。");
    }

    return "[MBMSGI03] メッセージ定義ID[" + arg0 + "]において、キー[" + arg1 + "]が2回以上あらわれました。同じキーは2回以上指定することはできません。";
};

/**
 * メッセージ定義ID[BlancoMessage]、キー[MBMSGI04]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @param {string} arg1 置換文字列{1}の値。
 * @param {string} arg2 置換文字列{2}の値。
 * @param {string} arg3 置換文字列{3}の値。
 * @return メッセージ文字列。
 * @type string
 * No.5:
 * 文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]
 */
BlancoMessageMessage.prototype.getMbmsgi04 = function(/* string */ arg0, /* string */ arg1, /* string */ arg2, /* string */ arg3) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 4) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi04 のパラメータは[4]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi04 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi04 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg1) + "]型が与えられました。");
    }
    if (typeof(arg2) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi04 の3番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg2) + "]型が与えられました。");
    }
    if (typeof(arg3) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi04 の4番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg3) + "]型が与えられました。");
    }

    return "[MBMSGI04] メッセージ定義ID[" + arg0 + "]において、キー[" + arg1 + "]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[" + arg2 + "]とリソースバンドルとして判断した場合の置換文字列の個数[" + arg3 + "]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。";
};

/**
 * メッセージ定義ID[BlancoMessage]、キー[MBMSGA01]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @return メッセージ文字列。
 * @type string
 * No.8:
 * 文字列[メタディレクトリ[{0}]が存在しません。]
 */
BlancoMessageMessage.prototype.getMbmsga01 = function(/* string */ arg0) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsga01 のパラメータは[1]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsga01 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }

    return "[MBMSGA01] メタディレクトリ[" + arg0 + "]が存在しません。";
};
/* クラス[BlancoMessageMessage]宣言の終了。 */
