<?php
/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */
namespace blanco.message.message;

/*. require_module 'standard'; .*/;

/**
 * blancoMessageが内部的に利用するメッセージクラスです。
 */
class BlancoMessageMessage {
    /**
     * 文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]
     *
     * No.2:
     */
    const MBMSGI01 = '[MBMSGI01] メッセージ定義ID[{0}]のパッケージ名が指定されていません。';

    /**
     * キー値: KEY_MBMSGI01
     *
     * No.2:
     */
    const KEY_MBMSGI01 = 'MBMSGI01';

    /**
     * 文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]
     *
     * No.3:
     */
    const MBMSGI02 = '[MBMSGI02] サポートしない出力プログラミング言語処理系[{0}]が指定されました。';

    /**
     * キー値: KEY_MBMSGI02
     *
     * No.3:
     */
    const KEY_MBMSGI02 = 'MBMSGI02';

    /**
     * 文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]
     *
     * No.4:
     */
    const MBMSGI03 = '[MBMSGI03] メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。';

    /**
     * キー値: KEY_MBMSGI03
     *
     * No.4:
     */
    const KEY_MBMSGI03 = 'MBMSGI03';

    /**
     * 文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]
     *
     * No.5:
     */
    const MBMSGI04 = '[MBMSGI04] メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。';

    /**
     * キー値: KEY_MBMSGI04
     *
     * No.5:
     */
    const KEY_MBMSGI04 = 'MBMSGI04';

    /**
     * 文字列[メタディレクトリ[{0}]が存在しません。]
     *
     * No.8:
     */
    const MBMSGA01 = '[MBMSGA01] メタディレクトリ[{0}]が存在しません。';

    /**
     * キー値: KEY_MBMSGA01
     *
     * No.8:
     */
    const KEY_MBMSGA01 = 'MBMSGA01';

    /**
     * メッセージ定義ID[BlancoMessage]、キー[MBMSGI01]の文字列を取得します。
     *
     * No.2:
     * 文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMbmsgi01(/*.string.*/ $arg0) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 1) {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi01 のパラメータは[1]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi01 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMbmsgi01]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return '[MBMSGI01] メッセージ定義ID[' . $arg0 . ']のパッケージ名が指定されていません。';
    }

    /**
     * メッセージ定義ID[BlancoMessage]、キー[MBMSGI02]の文字列を取得します。
     *
     * No.3:
     * 文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMbmsgi02(/*.string.*/ $arg0) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 1) {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi02 のパラメータは[1]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi02 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMbmsgi02]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return '[MBMSGI02] サポートしない出力プログラミング言語処理系[' . $arg0 . ']が指定されました。';
    }

    /**
     * メッセージ定義ID[BlancoMessage]、キー[MBMSGI03]の文字列を取得します。
     *
     * No.4:
     * 文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @param string $arg1 置換文字列{1}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMbmsgi03(/*.string.*/ $arg0, /*.string.*/ $arg1) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 2) {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi03 のパラメータは[2]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi03 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi03 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg1) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMbmsgi03]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg1 === null) {
            throw new \Exception('メソッド[getMbmsgi03]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return '[MBMSGI03] メッセージ定義ID[' . $arg0 . ']において、キー[' . $arg1 . ']が2回以上あらわれました。同じキーは2回以上指定することはできません。';
    }

    /**
     * メッセージ定義ID[BlancoMessage]、キー[MBMSGI04]の文字列を取得します。
     *
     * No.5:
     * 文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @param string $arg1 置換文字列{1}の値。
     * @param string $arg2 置換文字列{2}の値。
     * @param string $arg3 置換文字列{3}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMbmsgi04(/*.string.*/ $arg0, /*.string.*/ $arg1, /*.string.*/ $arg2, /*.string.*/ $arg3) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 4) {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi04 のパラメータは[4]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi04 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi04 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg1) . ']型が与えられました。');
        }
        if (gettype($arg2) !== 'string' && gettype($arg2) !== 'NULL') {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi04 の3番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg2) . ']型が与えられました。');
        }
        if (gettype($arg3) !== 'string' && gettype($arg3) !== 'NULL') {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi04 の4番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg3) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMbmsgi04]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg1 === null) {
            throw new \Exception('メソッド[getMbmsgi04]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg2 === null) {
            throw new \Exception('メソッド[getMbmsgi04]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg3 === null) {
            throw new \Exception('メソッド[getMbmsgi04]のパラメータ[arg3]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return '[MBMSGI04] メッセージ定義ID[' . $arg0 . ']において、キー[' . $arg1 . ']のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[' . $arg2 . ']とリソースバンドルとして判断した場合の置換文字列の個数[' . $arg3 . ']とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。';
    }

    /**
     * メッセージ定義ID[BlancoMessage]、キー[MBMSGA01]の文字列を取得します。
     *
     * No.8:
     * 文字列[メタディレクトリ[{0}]が存在しません。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMbmsga01(/*.string.*/ $arg0) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 1) {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsga01 のパラメータは[1]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: BlancoMessageMessage.getMbmsga01 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMbmsga01]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return '[MBMSGA01] メタディレクトリ[' . $arg0 . ']が存在しません。';
    }
}
?>
