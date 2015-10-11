' このソースコードは blanco Frameworkによって自動生成されています。
Imports System

Namespace blanco.sample.message
    ''' <summary>メッセージのサンプル。このクラスは単にサンプルです。実際の動作には利用されません。</summary>
    Public Class Sample2Message

        ''' <summary>文字列[メッセージのサンプル。その１。]</summary>
        ''' <remarks>
        ''' <newpara>No.1: </newpara>
        ''' </remarks>
        Public Const MESSAGE001 As String = "[MESSAGE001] メッセージのサンプル。その１。"

        ''' <summary>キー値: KEY_MESSAGE001</summary>
        ''' <remarks>
        ''' <newpara>No.1: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE001 As String = "MESSAGE001"

        ''' <summary>文字列[メッセージ置換文字[{0}]が置換されます。]</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' </remarks>
        Public Const MESSAGE002 As String = "[MESSAGE002] メッセージ置換文字[{0}]が置換されます。"

        ''' <summary>キー値: KEY_MESSAGE002</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE002 As String = "MESSAGE002"

        ''' <summary>文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' </remarks>
        Public Const MESSAGE003 As String = "[MESSAGE003] メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。"

        ''' <summary>キー値: KEY_MESSAGE003</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE003 As String = "MESSAGE003"

        ''' <summary>文字列[連続したメッセージ置換文字{0}{1}の例です。]</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' </remarks>
        Public Const MESSAGE004 As String = "[MESSAGE004] 連続したメッセージ置換文字{0}{1}の例です。"

        ''' <summary>キー値: KEY_MESSAGE004</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE004 As String = "MESSAGE004"

        ''' <summary>文字列[{0}先頭から置換文字列がある例。]</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' </remarks>
        Public Const MESSAGE005 As String = "[MESSAGE005] {0}先頭から置換文字列がある例。"

        ''' <summary>キー値: KEY_MESSAGE005</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE005 As String = "MESSAGE005"

        ''' <summary>文字列[最後が置換文字列の例。{0}]</summary>
        ''' <remarks>
        ''' <newpara>No.6: </newpara>
        ''' </remarks>
        Public Const MESSAGE006 As String = "[MESSAGE006] 最後が置換文字列の例。{0}"

        ''' <summary>キー値: KEY_MESSAGE006</summary>
        ''' <remarks>
        ''' <newpara>No.6: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE006 As String = "MESSAGE006"

        ''' <summary>文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]</summary>
        ''' <remarks>
        ''' <newpara>No.7: </newpara>
        ''' </remarks>
        Public Const MESSAGE007 As String = "[MESSAGE007] 何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}"

        ''' <summary>キー値: KEY_MESSAGE007</summary>
        ''' <remarks>
        ''' <newpara>No.7: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE007 As String = "MESSAGE007"

        ''' <summary>文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' </remarks>
        Public Const MESSAGE008 As String = "[MESSAGE008] たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。"

        ''' <summary>キー値: KEY_MESSAGE008</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE008 As String = "MESSAGE008"

        ''' <summary>文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]</summary>
        ''' <remarks>
        ''' <newpara>No.9: </newpara>
        ''' </remarks>
        Public Const MESSAGE009 As String = "[MESSAGE009] {0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。"

        ''' <summary>キー値: KEY_MESSAGE009</summary>
        ''' <remarks>
        ''' <newpara>No.9: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE009 As String = "MESSAGE009"

        ''' <summary>文字列[エスケープ処理の確認。ダブルクオーテーション&amp;quot;、シングルクオーテーション'、エンマーク\。]</summary>
        ''' <remarks>
        ''' <newpara>No.10: </newpara>
        ''' </remarks>
        Public Const MESSAGE010 As String = "[MESSAGE010] エスケープ処理の確認。ダブルクオーテーション""、シングルクオーテーション'、エンマーク\\。"

        ''' <summary>キー値: KEY_MESSAGE010</summary>
        ''' <remarks>
        ''' <newpara>No.10: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE010 As String = "MESSAGE010"

        ''' <summary>文字列[×]</summary>
        ''' <remarks>
        ''' <newpara>No.11: </newpara>
        ''' </remarks>
        Public Const MESSAGE011 As String = "[MESSAGE011] ×"

        ''' <summary>キー値: KEY_MESSAGE011</summary>
        ''' <remarks>
        ''' <newpara>No.11: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE011 As String = "MESSAGE011"

        ''' <summary>文字列[改行[\n]の試験。]</summary>
        ''' <remarks>
        ''' <newpara>No.12: </newpara>
        ''' </remarks>
        Public Const MESSAGE012 As String = "[MESSAGE012] 改行[\n]の試験。"

        ''' <summary>キー値: KEY_MESSAGE012</summary>
        ''' <remarks>
        ''' <newpara>No.12: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE012 As String = "MESSAGE012"

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE001]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.1: </newpara>
        ''' <newpara>文字列[メッセージのサンプル。その１。]</newpara>
        ''' </remarks>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage001() As String
            Return "[MESSAGE001] メッセージのサンプル。その１。"
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE002]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' <newpara>文字列[メッセージ置換文字[{0}]が置換されます。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage002(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage002]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MESSAGE002] メッセージ置換文字[" + arg0 + "]が置換されます。"
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE003]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' <newpara>文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <param name="arg1">置換文字列{1}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage003(arg0 As String, arg1 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage003]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage003]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MESSAGE003] メッセージ置換文字[" + arg0 + "]に加え、もうひとつ[" + arg1 + "]が置換されます。"
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE004]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' <newpara>文字列[連続したメッセージ置換文字{0}{1}の例です。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <param name="arg1">置換文字列{1}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage004(arg0 As String, arg1 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage004]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage004]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MESSAGE004] 連続したメッセージ置換文字" + arg0 + arg1 + "の例です。"
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE005]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' <newpara>文字列[{0}先頭から置換文字列がある例。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage005(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage005]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MESSAGE005] " + arg0 + "先頭から置換文字列がある例。"
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE006]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.6: </newpara>
        ''' <newpara>文字列[最後が置換文字列の例。{0}]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage006(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage006]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MESSAGE006] 最後が置換文字列の例。" + arg0
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE007]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.7: </newpara>
        ''' <newpara>文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <param name="arg1">置換文字列{1}の値。</param>
        ''' <param name="arg2">置換文字列{2}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage007(arg0 As String, arg1 As String, arg2 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage007]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage007]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg2 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage007]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MESSAGE007] 何度も現れる置換文字" + arg0 + arg1 + arg0 + arg1 + arg2 + arg1 + arg0
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE008]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' <newpara>文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <param name="arg1">置換文字列{1}の値。</param>
        ''' <param name="arg2">置換文字列{2}の値。</param>
        ''' <param name="arg3">置換文字列{3}の値。</param>
        ''' <param name="arg4">置換文字列{4}の値。</param>
        ''' <param name="arg5">置換文字列{5}の値。</param>
        ''' <param name="arg6">置換文字列{6}の値。</param>
        ''' <param name="arg7">置換文字列{7}の値。</param>
        ''' <param name="arg8">置換文字列{8}の値。</param>
        ''' <param name="arg9">置換文字列{9}の値。</param>
        ''' <param name="arg10">置換文字列{10}の値。</param>
        ''' <param name="arg11">置換文字列{11}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage008(arg0 As String, arg1 As String, arg2 As String, arg3 As String, arg4 As String, arg5 As String, arg6 As String, arg7 As String, arg8 As String, arg9 As String, arg10 As String, arg11 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg2 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg3 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg3]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg4 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg4]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg5 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg5]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg6 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg6]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg7 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg7]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg8 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg8]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg9 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg9]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg10 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg10]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg11 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage008]のパラメータ[arg11]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MESSAGE008] たくさんの置換文字。" + arg11 + arg10 + arg9 + arg8 + arg7 + arg6 + arg5 + arg4 + arg3 + arg2 + arg1 + arg0 + "と12個。"
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE009]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.9: </newpara>
        ''' <newpara>文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]</newpara>
        ''' </remarks>
        ''' <param name="arg0">置換文字列{0}の値。</param>
        ''' <param name="arg1">置換文字列{1}の値。</param>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage009(arg0 As String, arg1 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage009]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("メソッド[GetMessage009]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。")
            End If

            Return "[MESSAGE009] " + arg0 + "番号が飛ぶと置換文字列は不正として判断されます。" + arg1 + "。この定義書は0オリジンです。"
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE010]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.10: </newpara>
        ''' <newpara>文字列[エスケープ処理の確認。ダブルクオーテーション&quot;、シングルクオーテーション'、エンマーク\。]</newpara>
        ''' </remarks>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage010() As String
            Return "[MESSAGE010] エスケープ処理の確認。ダブルクオーテーション""、シングルクオーテーション'、エンマーク\\。"
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE011]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.11: </newpara>
        ''' <newpara>文字列[×]</newpara>
        ''' </remarks>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage011() As String
            Return "[MESSAGE011] ×"
        End Function

        ''' <summary>メッセージ定義ID[Sample2]、キー[MESSAGE012]の文字列を取得します。</summary>
        ''' <remarks>
        ''' <newpara>No.12: </newpara>
        ''' <newpara>文字列[改行[\n]の試験。]</newpara>
        ''' </remarks>
        ''' <returns>メッセージ文字列。</returns>
        Public Function GetMessage012() As String
            Return "[MESSAGE012] 改行[\n]の試験。"
        End Function
    End Class
End Namespace
