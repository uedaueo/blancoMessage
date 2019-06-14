// このソースコードは blanco Frameworkによって自動生成されています。
using System;

namespace blanco.message.message
{
    /// <summary>blancoMessageが内部的に利用するメッセージクラスです。</summary>
    public class BlancoMessageMessage
    {
        /// <summary>文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]</summary>
        /// <remarks>
        /// <newpara>No.2: </newpara>
        /// </remarks>
        public static readonly string MBMSGI01 = "[MBMSGI01] メッセージ定義ID[{0}]のパッケージ名が指定されていません。";

        /// <summary>キー値: KEY_MBMSGI01</summary>
        /// <remarks>
        /// <newpara>No.2: </newpara>
        /// </remarks>
        public static readonly string KEY_MBMSGI01 = "MBMSGI01";

        /// <summary>文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]</summary>
        /// <remarks>
        /// <newpara>No.3: </newpara>
        /// </remarks>
        public static readonly string MBMSGI02 = "[MBMSGI02] サポートしない出力プログラミング言語処理系[{0}]が指定されました。";

        /// <summary>キー値: KEY_MBMSGI02</summary>
        /// <remarks>
        /// <newpara>No.3: </newpara>
        /// </remarks>
        public static readonly string KEY_MBMSGI02 = "MBMSGI02";

        /// <summary>文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]</summary>
        /// <remarks>
        /// <newpara>No.4: </newpara>
        /// </remarks>
        public static readonly string MBMSGI03 = "[MBMSGI03] メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。";

        /// <summary>キー値: KEY_MBMSGI03</summary>
        /// <remarks>
        /// <newpara>No.4: </newpara>
        /// </remarks>
        public static readonly string KEY_MBMSGI03 = "MBMSGI03";

        /// <summary>文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]</summary>
        /// <remarks>
        /// <newpara>No.5: </newpara>
        /// </remarks>
        public static readonly string MBMSGI04 = "[MBMSGI04] メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。";

        /// <summary>キー値: KEY_MBMSGI04</summary>
        /// <remarks>
        /// <newpara>No.5: </newpara>
        /// </remarks>
        public static readonly string KEY_MBMSGI04 = "MBMSGI04";

        /// <summary>文字列[メタディレクトリ[{0}]が存在しません。]</summary>
        /// <remarks>
        /// <newpara>No.8: </newpara>
        /// </remarks>
        public static readonly string MBMSGA01 = "[MBMSGA01] メタディレクトリ[{0}]が存在しません。";

        /// <summary>キー値: KEY_MBMSGA01</summary>
        /// <remarks>
        /// <newpara>No.8: </newpara>
        /// </remarks>
        public static readonly string KEY_MBMSGA01 = "MBMSGA01";

        /// <summary>メッセージ定義ID[BlancoMessage]、キー[MBMSGI01]の文字列を取得します。</summary>
        /// <remarks>
        /// <newpara>No.2: </newpara>
        /// <newpara>文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]</newpara>
        /// </remarks>
        /// <param name="arg0">置換文字列{0}の値。</param>
        /// <returns>メッセージ文字列。</returns>
        public virtual string GetMbmsgi01(string arg0)
        {
            if (arg0 == null) {
                throw new ArgumentException("メソッド[GetMbmsgi01]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
            }

            return "[MBMSGI01] メッセージ定義ID[" + arg0 + "]のパッケージ名が指定されていません。";
        }

        /// <summary>メッセージ定義ID[BlancoMessage]、キー[MBMSGI02]の文字列を取得します。</summary>
        /// <remarks>
        /// <newpara>No.3: </newpara>
        /// <newpara>文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]</newpara>
        /// </remarks>
        /// <param name="arg0">置換文字列{0}の値。</param>
        /// <returns>メッセージ文字列。</returns>
        public virtual string GetMbmsgi02(string arg0)
        {
            if (arg0 == null) {
                throw new ArgumentException("メソッド[GetMbmsgi02]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
            }

            return "[MBMSGI02] サポートしない出力プログラミング言語処理系[" + arg0 + "]が指定されました。";
        }

        /// <summary>メッセージ定義ID[BlancoMessage]、キー[MBMSGI03]の文字列を取得します。</summary>
        /// <remarks>
        /// <newpara>No.4: </newpara>
        /// <newpara>文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]</newpara>
        /// </remarks>
        /// <param name="arg0">置換文字列{0}の値。</param>
        /// <param name="arg1">置換文字列{1}の値。</param>
        /// <returns>メッセージ文字列。</returns>
        public virtual string GetMbmsgi03(string arg0, string arg1)
        {
            if (arg0 == null) {
                throw new ArgumentException("メソッド[GetMbmsgi03]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
            }
            if (arg1 == null) {
                throw new ArgumentException("メソッド[GetMbmsgi03]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
            }

            return "[MBMSGI03] メッセージ定義ID[" + arg0 + "]において、キー[" + arg1 + "]が2回以上あらわれました。同じキーは2回以上指定することはできません。";
        }

        /// <summary>メッセージ定義ID[BlancoMessage]、キー[MBMSGI04]の文字列を取得します。</summary>
        /// <remarks>
        /// <newpara>No.5: </newpara>
        /// <newpara>文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]</newpara>
        /// </remarks>
        /// <param name="arg0">置換文字列{0}の値。</param>
        /// <param name="arg1">置換文字列{1}の値。</param>
        /// <param name="arg2">置換文字列{2}の値。</param>
        /// <param name="arg3">置換文字列{3}の値。</param>
        /// <returns>メッセージ文字列。</returns>
        public virtual string GetMbmsgi04(string arg0, string arg1, string arg2, string arg3)
        {
            if (arg0 == null) {
                throw new ArgumentException("メソッド[GetMbmsgi04]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
            }
            if (arg1 == null) {
                throw new ArgumentException("メソッド[GetMbmsgi04]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
            }
            if (arg2 == null) {
                throw new ArgumentException("メソッド[GetMbmsgi04]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
            }
            if (arg3 == null) {
                throw new ArgumentException("メソッド[GetMbmsgi04]のパラメータ[arg3]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
            }

            return "[MBMSGI04] メッセージ定義ID[" + arg0 + "]において、キー[" + arg1 + "]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[" + arg2 + "]とリソースバンドルとして判断した場合の置換文字列の個数[" + arg3 + "]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。";
        }

        /// <summary>メッセージ定義ID[BlancoMessage]、キー[MBMSGA01]の文字列を取得します。</summary>
        /// <remarks>
        /// <newpara>No.8: </newpara>
        /// <newpara>文字列[メタディレクトリ[{0}]が存在しません。]</newpara>
        /// </remarks>
        /// <param name="arg0">置換文字列{0}の値。</param>
        /// <returns>メッセージ文字列。</returns>
        public virtual string GetMbmsga01(string arg0)
        {
            if (arg0 == null) {
                throw new ArgumentException("メソッド[GetMbmsga01]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
            }

            return "[MBMSGA01] メタディレクトリ[" + arg0 + "]が存在しません。";
        }
    }
}
