#
# このソースコードは blanco Frameworkによって自動生成されています。
#

#
# メッセージのサンプル。このクラスは単にサンプルです。実際の動作には利用されません。
#
class SampleMessage

    #
    # 文字列[メッセージのサンプル。その１。]
    #
    # No.1:
    #
    MESSAGE001 = 'メッセージのサンプル。その１。'

    #
    # キー値: KEY_MESSAGE001
    #
    # No.1:
    #
    KEY_MESSAGE001 = 'MESSAGE001'

    #
    # 文字列[メッセージ置換文字[{0}]が置換されます。]
    #
    # No.2:
    #
    MESSAGE002 = 'メッセージ置換文字[{0}]が置換されます。'

    #
    # キー値: KEY_MESSAGE002
    #
    # No.2:
    #
    KEY_MESSAGE002 = 'MESSAGE002'

    #
    # 文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]
    #
    # No.3:
    #
    MESSAGE003 = 'メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。'

    #
    # キー値: KEY_MESSAGE003
    #
    # No.3:
    #
    KEY_MESSAGE003 = 'MESSAGE003'

    #
    # 文字列[連続したメッセージ置換文字{0}{1}の例です。]
    #
    # No.4:
    #
    MESSAGE004 = '連続したメッセージ置換文字{0}{1}の例です。'

    #
    # キー値: KEY_MESSAGE004
    #
    # No.4:
    #
    KEY_MESSAGE004 = 'MESSAGE004'

    #
    # 文字列[{0}先頭から置換文字列がある例。]
    #
    # No.5:
    #
    MESSAGE005 = '{0}先頭から置換文字列がある例。'

    #
    # キー値: KEY_MESSAGE005
    #
    # No.5:
    #
    KEY_MESSAGE005 = 'MESSAGE005'

    #
    # 文字列[最後が置換文字列の例。{0}]
    #
    # No.6:
    #
    MESSAGE006 = '最後が置換文字列の例。{0}'

    #
    # キー値: KEY_MESSAGE006
    #
    # No.6:
    #
    KEY_MESSAGE006 = 'MESSAGE006'

    #
    # 文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]
    #
    # No.7:
    #
    MESSAGE007 = '何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}'

    #
    # キー値: KEY_MESSAGE007
    #
    # No.7:
    #
    KEY_MESSAGE007 = 'MESSAGE007'

    #
    # 文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]
    #
    # No.8:
    #
    MESSAGE008 = 'たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。'

    #
    # キー値: KEY_MESSAGE008
    #
    # No.8:
    #
    KEY_MESSAGE008 = 'MESSAGE008'

    #
    # 文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]
    #
    # No.9:
    #
    MESSAGE009 = '{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。'

    #
    # キー値: KEY_MESSAGE009
    #
    # No.9:
    #
    KEY_MESSAGE009 = 'MESSAGE009'

    #
    # 文字列[エスケープ処理の確認。ダブルクオーテーション&amp;quot;、シングルクオーテーション'、エンマーク\。]
    #
    # No.10:
    #
    MESSAGE010 = 'エスケープ処理の確認。ダブルクオーテーション"、シングルクオーテーション\'、エンマーク\\。'

    #
    # キー値: KEY_MESSAGE010
    #
    # No.10:
    #
    KEY_MESSAGE010 = 'MESSAGE010'

    #
    # 文字列[×]
    #
    # No.11:
    #
    MESSAGE011 = '×'

    #
    # キー値: KEY_MESSAGE011
    #
    # No.11:
    #
    KEY_MESSAGE011 = 'MESSAGE011'

    #
    # 文字列[改行[\n]の試験。]
    #
    # No.12:
    #
    MESSAGE012 = '改行[\n]の試験。'

    #
    # キー値: KEY_MESSAGE012
    #
    # No.12:
    #
    KEY_MESSAGE012 = 'MESSAGE012'

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE001]の文字列を取得します。
    #
    # No.1:
    # 文字列[メッセージのサンプル。その１。]
    #
    # return メッセージ文字列。
    #
    def getMessage001()
        return 'メッセージのサンプル。その１。'
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE002]の文字列を取得します。
    #
    # No.2:
    # 文字列[メッセージ置換文字[{0}]が置換されます。]
    #
    # param arg0 置換文字列{0}の値。
    # return メッセージ文字列。
    #
    def getMessage002(arg0)
        if arg0.nil?
            raise ArgumentError, "メソッド[getMessage002]のパラメータ[arg0]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end

        return 'メッセージ置換文字[' + arg0 + ']が置換されます。'
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE003]の文字列を取得します。
    #
    # No.3:
    # 文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]
    #
    # param arg0 置換文字列{0}の値。
    # param arg1 置換文字列{1}の値。
    # return メッセージ文字列。
    #
    def getMessage003(arg0, arg1)
        if arg0.nil?
            raise ArgumentError, "メソッド[getMessage003]のパラメータ[arg0]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg1.nil?
            raise ArgumentError, "メソッド[getMessage003]のパラメータ[arg1]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end

        return 'メッセージ置換文字[' + arg0 + ']に加え、もうひとつ[' + arg1 + ']が置換されます。'
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE004]の文字列を取得します。
    #
    # No.4:
    # 文字列[連続したメッセージ置換文字{0}{1}の例です。]
    #
    # param arg0 置換文字列{0}の値。
    # param arg1 置換文字列{1}の値。
    # return メッセージ文字列。
    #
    def getMessage004(arg0, arg1)
        if arg0.nil?
            raise ArgumentError, "メソッド[getMessage004]のパラメータ[arg0]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg1.nil?
            raise ArgumentError, "メソッド[getMessage004]のパラメータ[arg1]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end

        return '連続したメッセージ置換文字' + arg0 + arg1 + 'の例です。'
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE005]の文字列を取得します。
    #
    # No.5:
    # 文字列[{0}先頭から置換文字列がある例。]
    #
    # param arg0 置換文字列{0}の値。
    # return メッセージ文字列。
    #
    def getMessage005(arg0)
        if arg0.nil?
            raise ArgumentError, "メソッド[getMessage005]のパラメータ[arg0]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end

        return arg0 + '先頭から置換文字列がある例。'
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE006]の文字列を取得します。
    #
    # No.6:
    # 文字列[最後が置換文字列の例。{0}]
    #
    # param arg0 置換文字列{0}の値。
    # return メッセージ文字列。
    #
    def getMessage006(arg0)
        if arg0.nil?
            raise ArgumentError, "メソッド[getMessage006]のパラメータ[arg0]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end

        return '最後が置換文字列の例。' + arg0
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE007]の文字列を取得します。
    #
    # No.7:
    # 文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]
    #
    # param arg0 置換文字列{0}の値。
    # param arg1 置換文字列{1}の値。
    # param arg2 置換文字列{2}の値。
    # return メッセージ文字列。
    #
    def getMessage007(arg0, arg1, arg2)
        if arg0.nil?
            raise ArgumentError, "メソッド[getMessage007]のパラメータ[arg0]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg1.nil?
            raise ArgumentError, "メソッド[getMessage007]のパラメータ[arg1]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg2.nil?
            raise ArgumentError, "メソッド[getMessage007]のパラメータ[arg2]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end

        return '何度も現れる置換文字' + arg0 + arg1 + arg0 + arg1 + arg2 + arg1 + arg0
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE008]の文字列を取得します。
    #
    # No.8:
    # 文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]
    #
    # param arg0 置換文字列{0}の値。
    # param arg1 置換文字列{1}の値。
    # param arg2 置換文字列{2}の値。
    # param arg3 置換文字列{3}の値。
    # param arg4 置換文字列{4}の値。
    # param arg5 置換文字列{5}の値。
    # param arg6 置換文字列{6}の値。
    # param arg7 置換文字列{7}の値。
    # param arg8 置換文字列{8}の値。
    # param arg9 置換文字列{9}の値。
    # param arg10 置換文字列{10}の値。
    # param arg11 置換文字列{11}の値。
    # return メッセージ文字列。
    #
    def getMessage008(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11)
        if arg0.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg0]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg1.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg1]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg2.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg2]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg3.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg3]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg4.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg4]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg5.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg5]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg6.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg6]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg7.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg7]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg8.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg8]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg9.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg9]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg10.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg10]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg11.nil?
            raise ArgumentError, "メソッド[getMessage008]のパラメータ[arg11]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end

        return 'たくさんの置換文字。' + arg11 + arg10 + arg9 + arg8 + arg7 + arg6 + arg5 + arg4 + arg3 + arg2 + arg1 + arg0 + 'と12個。'
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE009]の文字列を取得します。
    #
    # No.9:
    # 文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]
    #
    # param arg0 置換文字列{0}の値。
    # param arg1 置換文字列{1}の値。
    # return メッセージ文字列。
    #
    def getMessage009(arg0, arg1)
        if arg0.nil?
            raise ArgumentError, "メソッド[getMessage009]のパラメータ[arg0]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end
        if arg1.nil?
            raise ArgumentError, "メソッド[getMessage009]のパラメータ[arg1]にnilが与えられました。しかし、このパラメータにnilを与えることはできません"
        end

        return arg0 + '番号が飛ぶと置換文字列は不正として判断されます。' + arg1 + '。この定義書は0オリジンです。'
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE010]の文字列を取得します。
    #
    # No.10:
    # 文字列[エスケープ処理の確認。ダブルクオーテーション&quot;、シングルクオーテーション'、エンマーク\。]
    #
    # return メッセージ文字列。
    #
    def getMessage010()
        return 'エスケープ処理の確認。ダブルクオーテーション"、シングルクオーテーション\'、エンマーク\\。'
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE011]の文字列を取得します。
    #
    # No.11:
    # 文字列[×]
    #
    # return メッセージ文字列。
    #
    def getMessage011()
        return '×'
    end

    #
    # メッセージ定義ID[Sample]、キー[MESSAGE012]の文字列を取得します。
    #
    # No.12:
    # 文字列[改行[\n]の試験。]
    #
    # return メッセージ文字列。
    #
    def getMessage012()
        return '改行[' + "\n" + ']の試験。'
    end
end
