# -*- coding: cp932 -*-
"""このソースコードは blanco Frameworkによって自動生成されています。
"""
class BlancoMessageMessage:
    """blancoMessageが内部的に利用するメッセージクラスです。
    """

    """文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]

    No.2:
    """
    MBMSGI01 = '[MBMSGI01] メッセージ定義ID[{0}]のパッケージ名が指定されていません。'

    """キー値: KEY_MBMSGI01

    No.2:
    """
    KEY_MBMSGI01 = 'MBMSGI01'

    """文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]

    No.3:
    """
    MBMSGI02 = '[MBMSGI02] サポートしない出力プログラミング言語処理系[{0}]が指定されました。'

    """キー値: KEY_MBMSGI02

    No.3:
    """
    KEY_MBMSGI02 = 'MBMSGI02'

    """文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]

    No.4:
    """
    MBMSGI03 = '[MBMSGI03] メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。'

    """キー値: KEY_MBMSGI03

    No.4:
    """
    KEY_MBMSGI03 = 'MBMSGI03'

    """文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]

    No.5:
    """
    MBMSGI04 = '[MBMSGI04] メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。'

    """キー値: KEY_MBMSGI04

    No.5:
    """
    KEY_MBMSGI04 = 'MBMSGI04'

    """文字列[メタディレクトリ[{0}]が存在しません。]

    No.8:
    """
    MBMSGA01 = '[MBMSGA01] メタディレクトリ[{0}]が存在しません。'

    """キー値: KEY_MBMSGA01

    No.8:
    """
    KEY_MBMSGA01 = 'MBMSGA01'

    def getMbmsgi01(self, arg0):
        """メッセージ定義ID[BlancoMessage]、キー[MBMSGI01]の文字列を取得します。

        No.2:
        文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMbmsgi01]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MBMSGI01] メッセージ定義ID[' + arg0 + ']のパッケージ名が指定されていません。'
    #end

    def getMbmsgi02(self, arg0):
        """メッセージ定義ID[BlancoMessage]、キー[MBMSGI02]の文字列を取得します。

        No.3:
        文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMbmsgi02]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MBMSGI02] サポートしない出力プログラミング言語処理系[' + arg0 + ']が指定されました。'
    #end

    def getMbmsgi03(self, arg0, arg1):
        """メッセージ定義ID[BlancoMessage]、キー[MBMSGI03]の文字列を取得します。

        No.4:
        文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        arg1 -- 置換文字列{1}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMbmsgi03]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg1 is None:
            raise ValueError, "メソッド[getMbmsgi03]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MBMSGI03] メッセージ定義ID[' + arg0 + ']において、キー[' + arg1 + ']が2回以上あらわれました。同じキーは2回以上指定することはできません。'
    #end

    def getMbmsgi04(self, arg0, arg1, arg2, arg3):
        """メッセージ定義ID[BlancoMessage]、キー[MBMSGI04]の文字列を取得します。

        No.5:
        文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        arg1 -- 置換文字列{1}の値。
        arg2 -- 置換文字列{2}の値。
        arg3 -- 置換文字列{3}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMbmsgi04]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg1 is None:
            raise ValueError, "メソッド[getMbmsgi04]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg2 is None:
            raise ValueError, "メソッド[getMbmsgi04]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end
        if arg3 is None:
            raise ValueError, "メソッド[getMbmsgi04]のパラメータ[arg3]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MBMSGI04] メッセージ定義ID[' + arg0 + ']において、キー[' + arg1 + ']のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[' + arg2 + ']とリソースバンドルとして判断した場合の置換文字列の個数[' + arg3 + ']とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。'
    #end

    def getMbmsga01(self, arg0):
        """メッセージ定義ID[BlancoMessage]、キー[MBMSGA01]の文字列を取得します。

        No.8:
        文字列[メタディレクトリ[{0}]が存在しません。]

        self -- このメソッドを含むクラス自身。
        arg0 -- 置換文字列{0}の値。
        return -- メッセージ文字列。
        """
        if arg0 is None:
            raise ValueError, "メソッド[getMbmsga01]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。"
        #end

        return '[MBMSGA01] メタディレクトリ[' + arg0 + ']が存在しません。'
    #end
#end
