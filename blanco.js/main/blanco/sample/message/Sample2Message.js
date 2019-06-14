/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */

/**
 * デフォルトコンストラクタ
 * @fileoverview このソースコードは blanco Frameworkによって自動生成されています。
 * @class メッセージのサンプル。このクラスは単にサンプルです。実際の動作には利用されません。
 * @constructor
 */
function Sample2Message() {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: Sample2Message.Sample2Message のパラメータは[0]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }

}

/**
 * 文字列[メッセージのサンプル。その１。]
 * @type string
 * No.1:
 */
Sample2Message.MESSAGE001 = "[MESSAGE001] メッセージのサンプル。その１。";

/**
 * キー値: KEY_MESSAGE001
 * @type string
 * No.1:
 */
Sample2Message.KEY_MESSAGE001 = "MESSAGE001";

/**
 * 文字列[メッセージ置換文字[{0}]が置換されます。]
 * @type string
 * No.2:
 */
Sample2Message.MESSAGE002 = "[MESSAGE002] メッセージ置換文字[{0}]が置換されます。";

/**
 * キー値: KEY_MESSAGE002
 * @type string
 * No.2:
 */
Sample2Message.KEY_MESSAGE002 = "MESSAGE002";

/**
 * 文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]
 * @type string
 * No.3:
 */
Sample2Message.MESSAGE003 = "[MESSAGE003] メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。";

/**
 * キー値: KEY_MESSAGE003
 * @type string
 * No.3:
 */
Sample2Message.KEY_MESSAGE003 = "MESSAGE003";

/**
 * 文字列[連続したメッセージ置換文字{0}{1}の例です。]
 * @type string
 * No.4:
 */
Sample2Message.MESSAGE004 = "[MESSAGE004] 連続したメッセージ置換文字{0}{1}の例です。";

/**
 * キー値: KEY_MESSAGE004
 * @type string
 * No.4:
 */
Sample2Message.KEY_MESSAGE004 = "MESSAGE004";

/**
 * 文字列[{0}先頭から置換文字列がある例。]
 * @type string
 * No.5:
 */
Sample2Message.MESSAGE005 = "[MESSAGE005] {0}先頭から置換文字列がある例。";

/**
 * キー値: KEY_MESSAGE005
 * @type string
 * No.5:
 */
Sample2Message.KEY_MESSAGE005 = "MESSAGE005";

/**
 * 文字列[最後が置換文字列の例。{0}]
 * @type string
 * No.6:
 */
Sample2Message.MESSAGE006 = "[MESSAGE006] 最後が置換文字列の例。{0}";

/**
 * キー値: KEY_MESSAGE006
 * @type string
 * No.6:
 */
Sample2Message.KEY_MESSAGE006 = "MESSAGE006";

/**
 * 文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]
 * @type string
 * No.7:
 */
Sample2Message.MESSAGE007 = "[MESSAGE007] 何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}";

/**
 * キー値: KEY_MESSAGE007
 * @type string
 * No.7:
 */
Sample2Message.KEY_MESSAGE007 = "MESSAGE007";

/**
 * 文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]
 * @type string
 * No.8:
 */
Sample2Message.MESSAGE008 = "[MESSAGE008] たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。";

/**
 * キー値: KEY_MESSAGE008
 * @type string
 * No.8:
 */
Sample2Message.KEY_MESSAGE008 = "MESSAGE008";

/**
 * 文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]
 * @type string
 * No.9:
 */
Sample2Message.MESSAGE009 = "[MESSAGE009] {0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。";

/**
 * キー値: KEY_MESSAGE009
 * @type string
 * No.9:
 */
Sample2Message.KEY_MESSAGE009 = "MESSAGE009";

/**
 * 文字列[エスケープ処理の確認。ダブルクオーテーション&amp;quot;、シングルクオーテーション'、エンマーク\。]
 * @type string
 * No.10:
 */
Sample2Message.MESSAGE010 = "[MESSAGE010] エスケープ処理の確認。ダブルクオーテーション\"、シングルクオーテーション'、エンマーク\\。";

/**
 * キー値: KEY_MESSAGE010
 * @type string
 * No.10:
 */
Sample2Message.KEY_MESSAGE010 = "MESSAGE010";

/**
 * 文字列[×]
 * @type string
 * No.11:
 */
Sample2Message.MESSAGE011 = "[MESSAGE011] ×";

/**
 * キー値: KEY_MESSAGE011
 * @type string
 * No.11:
 */
Sample2Message.KEY_MESSAGE011 = "MESSAGE011";

/**
 * 文字列[改行[\n]の試験。]
 * @type string
 * No.12:
 */
Sample2Message.MESSAGE012 = "[MESSAGE012] 改行[\n]の試験。";

/**
 * キー値: KEY_MESSAGE012
 * @type string
 * No.12:
 */
Sample2Message.KEY_MESSAGE012 = "MESSAGE012";

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE001]の文字列を取得します。
 * @addon
 * @return メッセージ文字列。
 * @type string
 * No.1:
 * 文字列[メッセージのサンプル。その１。]
 */
Sample2Message.prototype.getMessage001 = function() {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage001 のパラメータは[0]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }

    return "[MESSAGE001] メッセージのサンプル。その１。";
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE002]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @return メッセージ文字列。
 * @type string
 * No.2:
 * 文字列[メッセージ置換文字[{0}]が置換されます。]
 */
Sample2Message.prototype.getMessage002 = function(/* string */ arg0) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage002 のパラメータは[1]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage002 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }

    return "[MESSAGE002] メッセージ置換文字[" + arg0 + "]が置換されます。";
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE003]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @param {string} arg1 置換文字列{1}の値。
 * @return メッセージ文字列。
 * @type string
 * No.3:
 * 文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]
 */
Sample2Message.prototype.getMessage003 = function(/* string */ arg0, /* string */ arg1) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 2) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage003 のパラメータは[2]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage003 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage003 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg1) + "]型が与えられました。");
    }

    return "[MESSAGE003] メッセージ置換文字[" + arg0 + "]に加え、もうひとつ[" + arg1 + "]が置換されます。";
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE004]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @param {string} arg1 置換文字列{1}の値。
 * @return メッセージ文字列。
 * @type string
 * No.4:
 * 文字列[連続したメッセージ置換文字{0}{1}の例です。]
 */
Sample2Message.prototype.getMessage004 = function(/* string */ arg0, /* string */ arg1) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 2) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage004 のパラメータは[2]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage004 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage004 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg1) + "]型が与えられました。");
    }

    return "[MESSAGE004] 連続したメッセージ置換文字" + arg0 + arg1 + "の例です。";
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE005]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @return メッセージ文字列。
 * @type string
 * No.5:
 * 文字列[{0}先頭から置換文字列がある例。]
 */
Sample2Message.prototype.getMessage005 = function(/* string */ arg0) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage005 のパラメータは[1]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage005 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }

    return "[MESSAGE005] " + arg0 + "先頭から置換文字列がある例。";
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE006]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @return メッセージ文字列。
 * @type string
 * No.6:
 * 文字列[最後が置換文字列の例。{0}]
 */
Sample2Message.prototype.getMessage006 = function(/* string */ arg0) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage006 のパラメータは[1]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage006 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }

    return "[MESSAGE006] 最後が置換文字列の例。" + arg0;
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE007]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @param {string} arg1 置換文字列{1}の値。
 * @param {string} arg2 置換文字列{2}の値。
 * @return メッセージ文字列。
 * @type string
 * No.7:
 * 文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]
 */
Sample2Message.prototype.getMessage007 = function(/* string */ arg0, /* string */ arg1, /* string */ arg2) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 3) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage007 のパラメータは[3]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage007 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage007 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg1) + "]型が与えられました。");
    }
    if (typeof(arg2) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage007 の3番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg2) + "]型が与えられました。");
    }

    return "[MESSAGE007] 何度も現れる置換文字" + arg0 + arg1 + arg0 + arg1 + arg2 + arg1 + arg0;
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE008]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @param {string} arg1 置換文字列{1}の値。
 * @param {string} arg2 置換文字列{2}の値。
 * @param {string} arg3 置換文字列{3}の値。
 * @param {string} arg4 置換文字列{4}の値。
 * @param {string} arg5 置換文字列{5}の値。
 * @param {string} arg6 置換文字列{6}の値。
 * @param {string} arg7 置換文字列{7}の値。
 * @param {string} arg8 置換文字列{8}の値。
 * @param {string} arg9 置換文字列{9}の値。
 * @param {string} arg10 置換文字列{10}の値。
 * @param {string} arg11 置換文字列{11}の値。
 * @return メッセージ文字列。
 * @type string
 * No.8:
 * 文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]
 */
Sample2Message.prototype.getMessage008 = function(/* string */ arg0, /* string */ arg1, /* string */ arg2, /* string */ arg3, /* string */ arg4, /* string */ arg5, /* string */ arg6, /* string */ arg7, /* string */ arg8, /* string */ arg9, /* string */ arg10, /* string */ arg11) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 12) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 のパラメータは[12]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg1) + "]型が与えられました。");
    }
    if (typeof(arg2) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の3番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg2) + "]型が与えられました。");
    }
    if (typeof(arg3) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の4番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg3) + "]型が与えられました。");
    }
    if (typeof(arg4) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の5番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg4) + "]型が与えられました。");
    }
    if (typeof(arg5) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の6番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg5) + "]型が与えられました。");
    }
    if (typeof(arg6) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の7番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg6) + "]型が与えられました。");
    }
    if (typeof(arg7) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の8番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg7) + "]型が与えられました。");
    }
    if (typeof(arg8) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の9番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg8) + "]型が与えられました。");
    }
    if (typeof(arg9) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の10番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg9) + "]型が与えられました。");
    }
    if (typeof(arg10) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の11番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg10) + "]型が与えられました。");
    }
    if (typeof(arg11) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage008 の12番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg11) + "]型が与えられました。");
    }

    return "[MESSAGE008] たくさんの置換文字。" + arg11 + arg10 + arg9 + arg8 + arg7 + arg6 + arg5 + arg4 + arg3 + arg2 + arg1 + arg0 + "と12個。";
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE009]の文字列を取得します。
 * @addon
 * @param {string} arg0 置換文字列{0}の値。
 * @param {string} arg1 置換文字列{1}の値。
 * @return メッセージ文字列。
 * @type string
 * No.9:
 * 文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]
 */
Sample2Message.prototype.getMessage009 = function(/* string */ arg0, /* string */ arg1) {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 2) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage009 のパラメータは[2]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage009 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg0) + "]型が与えられました。");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: Sample2Message.getMessage009 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[" + typeof(arg1) + "]型が与えられました。");
    }

    return "[MESSAGE009] " + arg0 + "番号が飛ぶと置換文字列は不正として判断されます。" + arg1 + "。この定義書は0オリジンです。";
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE010]の文字列を取得します。
 * @addon
 * @return メッセージ文字列。
 * @type string
 * No.10:
 * 文字列[エスケープ処理の確認。ダブルクオーテーション&quot;、シングルクオーテーション'、エンマーク\。]
 */
Sample2Message.prototype.getMessage010 = function() {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage010 のパラメータは[0]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }

    return "[MESSAGE010] エスケープ処理の確認。ダブルクオーテーション\"、シングルクオーテーション'、エンマーク\\。";
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE011]の文字列を取得します。
 * @addon
 * @return メッセージ文字列。
 * @type string
 * No.11:
 * 文字列[×]
 */
Sample2Message.prototype.getMessage011 = function() {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage011 のパラメータは[0]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }

    return "[MESSAGE011] ×";
};

/**
 * メッセージ定義ID[Sample2]、キー[MESSAGE012]の文字列を取得します。
 * @addon
 * @return メッセージ文字列。
 * @type string
 * No.12:
 * 文字列[改行[\n]の試験。]
 */
Sample2Message.prototype.getMessage012 = function() {
    /* パラメータの数、型チェックを行います。 */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: Sample2Message.getMessage012 のパラメータは[0]個である必要があります。しかし実際には[" + arguments.length +  "]個のパラメータを伴って呼び出されました。");
    }

    return "[MESSAGE012] 改行[\n]の試験。";
};
/* クラス[Sample2Message]宣言の終了。 */
