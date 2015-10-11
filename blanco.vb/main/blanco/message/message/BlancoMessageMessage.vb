' このソースコードは blanco Frameworkによって自動生成されています。
Imports System

Namespace blanco.message.message
    ''' <summary>blancoMessageが内部的に利用するメッセージクラスです。</summary>
    Public Class BlancoMessageMessage

        ''' <summary>文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' </remarks>
        Public Const MBMSGI01 As String = "[MBMSGI01] メッセージ定義ID[{0}]のパッケージ名が指定されていません。"

        ''' <summary>キー値: KEY_MBMSGI01</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' </remarks>
        Public Const KEY_MBMSGI01 As String = "MBMSGI01"

        ''' <summary>文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' </remarks>
        Public Const MBMSGI02 As String = "[MBMSGI02] サポートしない出力プログラミング言語処理系[{0}]が指定されました。"

        ''' <summary>キー値: KEY_MBMSGI02</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' </remarks>
        Public Const KEY_MBMSGI02 As String = "MBMSGI02"

        ''' <summary>文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' </remarks>
        Public Const MBMSGI03 As String = "[MBMSGI03] メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。"

        ''' <summary>キー値: KEY_MBMSGI03</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' </remarks>
        Public Const KEY_MBMSGI03 As String = "MBMSGI03"

        ''' <summary>文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' </remarks>
        Public Const MBMSGI04 As String = "[MBMSGI04] メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。"

        ''' <summary>キー値: KEY_MBMSGI04</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' </remarks>
        Public Const KEY_MBMSGI04 As String = "MBMSGI04"

        ''' <summary>文字列[メタディレクトリ[{0}]が存在しません。]</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' </remarks>
        Public Const MBMSGA01 As String = "[MBMSGA01] メタディレクトリ[{0}]が存在しません。"

        ''' <summary>キー値: KEY_MBMSGA01</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' </remarks>
        Public Const KEY_MBMSGA01 As String = "MBMSGA01"

        ''' <summary>メッセージ定義ID[BlancoMessage]、キー[MBMSGI01]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' <newpara>文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMbmsgi01(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMbmsgi01]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MBMSGI01] メッセージ定義ID[" + arg0 + "]のパッケージ名が指定されていません。"
        End Function

        ''' <summary>メッセージ定義ID[BlancoMessage]、キー[MBMSGI02]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' <newpara>文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMbmsgi02(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMbmsgi02]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MBMSGI02] サポートしない出力プログラミング言語処理系[" + arg0 + "]が指定されました。"
        End Function

        ''' <summary>メッセージ定義ID[BlancoMessage]、キー[MBMSGI03]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' <newpara>文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <param name="arg1">置換文字列{1}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMbmsgi03(arg0 As String, arg1 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMbmsgi03]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMbmsgi03]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MBMSGI03] メッセージ定義ID[" + arg0 + "]において、キー[" + arg1 + "]が2回以上あらわれました。同じキーは2回以上指定することはできません。"
        End Function

        ''' <summary>メッセージ定義ID[BlancoMessage]、キー[MBMSGI04]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' <newpara>文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <param name="arg1">置換文字列{1}の値。</param>
        ''' <param name="arg2">置換文字列{2}の値。</param>
        ''' <param name="arg3">置換文字列{3}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMbmsgi04(arg0 As String, arg1 As String, arg2 As String, arg3 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMbmsgi04]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMbmsgi04]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg2 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMbmsgi04]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg3 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMbmsgi04]のパラメータ[arg3]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MBMSGI04] メッセージ定義ID[" + arg0 + "]において、キー[" + arg1 + "]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[" + arg2 + "]とリソースバンドルとして判断した場合の置換文字列の個数[" + arg3 + "]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。"
        End Function

        ''' <summary>メッセージ定義ID[BlancoMessage]、キー[MBMSGA01]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' <newpara>文字列[メタディレクトリ[{0}]が存在しません。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMbmsga01(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMbmsga01]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MBMSGA01] メタディレクトリ[" + arg0 + "]が存在しません。"
        End Function
    End Class
End Namespace
