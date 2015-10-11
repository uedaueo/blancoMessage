# -*- coding: cp932 -*-
"""このソースコードは blanco Frameworkによって自動生成されています。
"""
class Sample2Message:
    """メッセージのサンプル。このクラスは単にサンプルです。実際の動作には利用されません。
    """

    """文字列[メッセージのサンプル。その１。]

    No.1:
    """
    MESSAGE001 = '[MESSAGE001] メッセージのサンプル。その１。'

    """キー値: KEY_MESSAGE001

    No.1:
    """
    KEY_MESSAGE001 = 'MESSAGE001'

    """文字列[メッセージ置換文字[{0}]が置換されます。]

    No.2:
    """
    MESSAGE002 = '[MESSAGE002] メッセージ置換文字[{0}]が置換されます。'

    """キー値: KEY_MESSAGE002

    No.2:
    """
    KEY_MESSAGE002 = 'MESSAGE002'

    """文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]

    No.3:
    """
    MESSAGE003 = '[MESSAGE003] メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。'

    """キー値: KEY_MESSAGE003

    No.3:
    """
    KEY_MESSAGE003 = 'MESSAGE003'

    """文字列[連続したメッセージ置換文字{0}{1}の例です。]

    No.4:
    """
    MESSAGE004 = '[MESSAGE004] 連続したメッセージ置換文字{0}{1}の例です。'

    """キー値: KEY_MESSAGE004

    No.4:
    """
    KEY_MESSAGE004 = 'MESSAGE004'

    """文字列[{0}先頭から置換文字列がある例。]

    No.5:
    """
    MESSAGE005 = '[MESSAGE005] {0}先頭から置換文字列がある例。'

    """キー値: KEY_MESSAGE005

    No.5:
    """
    KEY_MESSAGE005 = 'MESSAGE005'

    """文字列[最後が置換文字列の例。{0}]

    No.6:
    """
    MESSAGE006 = '[MESSAGE006] 最後が置換文字列の例。{0}'

    """キー値: KEY_MESSAGE006

    No.6:
    """
    KEY_MESSAGE006 = 'MESSAGE006'

    """文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]

    No.7:
    """
    MESSAGE007 = '[MESSAGE007] 何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}'

    """キー値: KEY_MESSAGE007

    No.7:
    """
    KEY_MESSAGE007 = 'MESSAGE007'

    """文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]

    No.8:
    """
    MESSAGE008 = '[MESSAGE008] たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。'

    """キー値: KEY_MESSAGE008

    No.8:
    """
    KEY_MESSAGE008 = 'MESSAGE008'

    """文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]

    No.9:
    """
    MESSAGE009 = '[MESSAGE009] {0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。'

    """キー値: KEY_MESSAGE009

    No.9:
    """
    KEY_MESSAGE009 = 'MESSAGE009'

    """文字列[エスケープ処理の確認。ダブルクオーテーション&amp;quot;、シングルクオーテーション'、エンマーク\。]

    No.10:
    """
    MESSAGE010 = '[MESSAGE010] エスケープ処理の確認。ダブルクオーテーション"、シングルクオーテーション\'、エンマーク\\。'

    """キー値: KEY_MESSAGE010

    No.10:
    """
    KEY_MESSAGE010 = 'MESSAGE010'

    """文字列[×]

    No.11:
    """
    MESSAGE011 = '[MESSAGE011] ×'

    """キー値: KEY_MESSAGE011

    No.11:
    """
    KEY_MESSAGE011 = 'MESSAGE011'

    """文字列[改行[\n]の試験。]

    No.12:
    """
    MESSAGE012 = '[MESSAGE012] 改行[\n]の試験。'

    """キー値: KEY_MESSAGE012

    No.12:
    """
    KEY_MESSAGE012 = 'MESSAGE012'

    def getMessage001(self):
        """メッセージ定義ID[Sample2]、キー[MESSAGE001]の文字列を取得します。

        No.1:
        文字列[メッセージのサンプル。その１。]

        self -- このメソッドを含むクラス自身。
        return -- メッセージ文字列。
        """
        return '[MESSAGE001] メッセージのサンプル。その１。'
    #end

    def getMessage002(self, arg0):
        """メッセージ定義ID[Sample2]、キー[MESSAGE002]の文字列を取得します。

        No.2:
        文字列[メッセージ置換文字[{0}]が置換されます。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMessage002]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MESSAGE002] メッセージ置換文字[' + arg0 + ']が置換されます。'
    #end

    def getMessage003(self, arg0, arg1):
        """メッセージ定義ID[Sample2]、キー[MESSAGE003]の文字列を取得します。

        No.3:
        文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        arg1 -- 置換文字列{1}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMessage003]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg1 is None:
            raise ValueError, "メソッド[getMessage003]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MESSAGE003] メッセージ置換文字[' + arg0 + ']に加え、もうひとつ[' + arg1 + ']が置換されます。'
    #end

    def getMessage004(self, arg0, arg1):
        """メッセージ定義ID[Sample2]、キー[MESSAGE004]の文字列を取得します。

        No.4:
        文字列[連続したメッセージ置換文字{0}{1}の例です。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        arg1 -- 置換文字列{1}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMessage004]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg1 is None:
            raise ValueError, "メソッド[getMessage004]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MESSAGE004] 連続したメッセージ置換文字' + arg0 + arg1 + 'の例です。'
    #end

    def getMessage005(self, arg0):
        """メッセージ定義ID[Sample2]、キー[MESSAGE005]の文字列を取得します。

        No.5:
        文字列[{0}先頭から置換文字列がある例。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMessage005]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MESSAGE005] ' + arg0 + '先頭から置換文字列がある例。'
    #end

    def getMessage006(self, arg0):
        """メッセージ定義ID[Sample2]、キー[MESSAGE006]の文字列を取得します。

        No.6:
        文字列[最後が置換文字列の例。{0}]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMessage006]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MESSAGE006] 最後が置換文字列の例。' + arg0
    #end

    def getMessage007(self, arg0, arg1, arg2):
        """メッセージ定義ID[Sample2]、キー[MESSAGE007]の文字列を取得します。

        No.7:
        文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        arg1 -- 置換文字列{1}の値。
        arg2 -- 置換文字列{2}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMessage007]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg1 is None:
            raise ValueError, "メソッド[getMessage007]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg2 is None:
            raise ValueError, "メソッド[getMessage007]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MESSAGE007] 何度も現れる置換文字' + arg0 + arg1 + arg0 + arg1 + arg2 + arg1 + arg0
    #end

    def getMessage008(self, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11):
        """メッセージ定義ID[Sample2]、キー[MESSAGE008]の文字列を取得します。

        No.8:
        文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        arg1 -- 置換文字列{1}の値。
        arg2 -- 置換文字列{2}の値。
        arg3 -- 置換文字列{3}の値。
        arg4 -- 置換文字列{4}の値。
        arg5 -- 置換文字列{5}の値。
        arg6 -- 置換文字列{6}の値。
        arg7 -- 置換文字列{7}の値。
        arg8 -- 置換文字列{8}の値。
        arg9 -- 置換文字列{9}の値。
        arg10 -- 置換文字列{10}の値。
        arg11 -- 置換文字列{11}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg1 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg2 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg3 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg3]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg4 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg4]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg5 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg5]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg6 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg6]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg7 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg7]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg8 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg8]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg9 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg9]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg10 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg10]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg11 is None:
            raise ValueError, "メソッド[getMessage008]のパラメータ[arg11]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MESSAGE008] たくさんの置換文字。' + arg11 + arg10 + arg9 + arg8 + arg7 + arg6 + arg5 + arg4 + arg3 + arg2 + arg1 + arg0 + 'と12個。'
    #end

    def getMessage009(self, arg0, arg1):
        """メッセージ定義ID[Sample2]、キー[MESSAGE009]の文字列を取得します。

        No.9:
        文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        arg1 -- 置換文字列{1}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMessage009]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg1 is None:
            raise ValueError, "メソッド[getMessage009]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MESSAGE009] ' + arg0 + '番号が飛ぶと置換文字列は不正として判断されます。' + arg1 + '。この定義書は0オリジンです。'
    #end

    def getMessage010(self):
        """メッセージ定義ID[Sample2]、キー[MESSAGE010]の文字列を取得します。

        No.10:
        文字列[エスケープ処理の確認。ダブルクオーテーション&quot;、シングルクオーテーション'、エンマーク\。]

        self -- このメソッドを含むクラス自身。
        return -- メッセージ文字列。
        """
        return '[MESSAGE010] エスケープ処理の確認。ダブルクオーテーション"、シングルクオーテーション\'、エンマーク\\。'
    #end

    def getMessage011(self):
        """メッセージ定義ID[Sample2]、キー[MESSAGE011]の文字列を取得します。

        No.11:
        文字列[×]

        self -- このメソッドを含むクラス自身。
        return -- メッセージ文字列。
        """
        return '[MESSAGE011] ×'
    #end

    def getMessage012(self):
        """メッセージ定義ID[Sample2]、キー[MESSAGE012]の文字列を取得します。

        No.12:
        文字列[改行[\n]の試験。]

        self -- このメソッドを含むクラス自身。
        return -- メッセージ文字列。
        """
        return '[MESSAGE012] 改行[' + "\n" + ']の試験。'
    #end
#end
