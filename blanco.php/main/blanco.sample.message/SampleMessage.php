<?php
/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */
namespace blanco.sample.message;

/*. require_module 'standard'; .*/;

/**
 * メッセージのサンプル。このクラスは単にサンプルです。実際の動作には利用されません。
 */
class SampleMessage {
    /**
     * 文字列[メッセージのサンプル。その１。]
     *
     * No.1:
     */
    const MESSAGE001 = 'メッセージのサンプル。その１。';

    /**
     * キー値: KEY_MESSAGE001
     *
     * No.1:
     */
    const KEY_MESSAGE001 = 'MESSAGE001';

    /**
     * 文字列[メッセージ置換文字[{0}]が置換されます。]
     *
     * No.2:
     */
    const MESSAGE002 = 'メッセージ置換文字[{0}]が置換されます。';

    /**
     * キー値: KEY_MESSAGE002
     *
     * No.2:
     */
    const KEY_MESSAGE002 = 'MESSAGE002';

    /**
     * 文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]
     *
     * No.3:
     */
    const MESSAGE003 = 'メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。';

    /**
     * キー値: KEY_MESSAGE003
     *
     * No.3:
     */
    const KEY_MESSAGE003 = 'MESSAGE003';

    /**
     * 文字列[連続したメッセージ置換文字{0}{1}の例です。]
     *
     * No.4:
     */
    const MESSAGE004 = '連続したメッセージ置換文字{0}{1}の例です。';

    /**
     * キー値: KEY_MESSAGE004
     *
     * No.4:
     */
    const KEY_MESSAGE004 = 'MESSAGE004';

    /**
     * 文字列[{0}先頭から置換文字列がある例。]
     *
     * No.5:
     */
    const MESSAGE005 = '{0}先頭から置換文字列がある例。';

    /**
     * キー値: KEY_MESSAGE005
     *
     * No.5:
     */
    const KEY_MESSAGE005 = 'MESSAGE005';

    /**
     * 文字列[最後が置換文字列の例。{0}]
     *
     * No.6:
     */
    const MESSAGE006 = '最後が置換文字列の例。{0}';

    /**
     * キー値: KEY_MESSAGE006
     *
     * No.6:
     */
    const KEY_MESSAGE006 = 'MESSAGE006';

    /**
     * 文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]
     *
     * No.7:
     */
    const MESSAGE007 = '何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}';

    /**
     * キー値: KEY_MESSAGE007
     *
     * No.7:
     */
    const KEY_MESSAGE007 = 'MESSAGE007';

    /**
     * 文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]
     *
     * No.8:
     */
    const MESSAGE008 = 'たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。';

    /**
     * キー値: KEY_MESSAGE008
     *
     * No.8:
     */
    const KEY_MESSAGE008 = 'MESSAGE008';

    /**
     * 文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]
     *
     * No.9:
     */
    const MESSAGE009 = '{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。';

    /**
     * キー値: KEY_MESSAGE009
     *
     * No.9:
     */
    const KEY_MESSAGE009 = 'MESSAGE009';

    /**
     * 文字列[エスケープ処理の確認。ダブルクオーテーション&amp;quot;、シングルクオーテーション'、エンマーク\。]
     *
     * No.10:
     */
    const MESSAGE010 = 'エスケープ処理の確認。ダブルクオーテーション"、シングルクオーテーション\'、エンマーク\\。';

    /**
     * キー値: KEY_MESSAGE010
     *
     * No.10:
     */
    const KEY_MESSAGE010 = 'MESSAGE010';

    /**
     * 文字列[×]
     *
     * No.11:
     */
    const MESSAGE011 = '×';

    /**
     * キー値: KEY_MESSAGE011
     *
     * No.11:
     */
    const KEY_MESSAGE011 = 'MESSAGE011';

    /**
     * 文字列[改行[\n]の試験。]
     *
     * No.12:
     */
    const MESSAGE012 = '改行[\n]の試験。';

    /**
     * キー値: KEY_MESSAGE012
     *
     * No.12:
     */
    const KEY_MESSAGE012 = 'MESSAGE012';

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE001]の文字列を取得します。
     *
     * No.1:
     * 文字列[メッセージのサンプル。その１。]
     *
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage001() {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 0) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage001 のパラメータは[0]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }

        return 'メッセージのサンプル。その１。';
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE002]の文字列を取得します。
     *
     * No.2:
     * 文字列[メッセージ置換文字[{0}]が置換されます。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage002(/*.string.*/ $arg0) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 1) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage002 のパラメータは[1]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage002 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMessage002]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return 'メッセージ置換文字[' . $arg0 . ']が置換されます。';
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE003]の文字列を取得します。
     *
     * No.3:
     * 文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @param string $arg1 置換文字列{1}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage003(/*.string.*/ $arg0, /*.string.*/ $arg1) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 2) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage003 のパラメータは[2]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage003 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage003 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg1) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMessage003]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg1 === null) {
            throw new \Exception('メソッド[getMessage003]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return 'メッセージ置換文字[' . $arg0 . ']に加え、もうひとつ[' . $arg1 . ']が置換されます。';
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE004]の文字列を取得します。
     *
     * No.4:
     * 文字列[連続したメッセージ置換文字{0}{1}の例です。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @param string $arg1 置換文字列{1}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage004(/*.string.*/ $arg0, /*.string.*/ $arg1) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 2) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage004 のパラメータは[2]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage004 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage004 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg1) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMessage004]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg1 === null) {
            throw new \Exception('メソッド[getMessage004]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return '連続したメッセージ置換文字' . $arg0 . $arg1 . 'の例です。';
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE005]の文字列を取得します。
     *
     * No.5:
     * 文字列[{0}先頭から置換文字列がある例。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage005(/*.string.*/ $arg0) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 1) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage005 のパラメータは[1]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage005 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMessage005]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return $arg0 . '先頭から置換文字列がある例。';
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE006]の文字列を取得します。
     *
     * No.6:
     * 文字列[最後が置換文字列の例。{0}]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage006(/*.string.*/ $arg0) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 1) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage006 のパラメータは[1]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage006 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMessage006]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return '最後が置換文字列の例。' . $arg0;
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE007]の文字列を取得します。
     *
     * No.7:
     * 文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @param string $arg1 置換文字列{1}の値。
     * @param string $arg2 置換文字列{2}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage007(/*.string.*/ $arg0, /*.string.*/ $arg1, /*.string.*/ $arg2) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 3) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage007 のパラメータは[3]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage007 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage007 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg1) . ']型が与えられました。');
        }
        if (gettype($arg2) !== 'string' && gettype($arg2) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage007 の3番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg2) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMessage007]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg1 === null) {
            throw new \Exception('メソッド[getMessage007]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg2 === null) {
            throw new \Exception('メソッド[getMessage007]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return '何度も現れる置換文字' . $arg0 . $arg1 . $arg0 . $arg1 . $arg2 . $arg1 . $arg0;
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE008]の文字列を取得します。
     *
     * No.8:
     * 文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @param string $arg1 置換文字列{1}の値。
     * @param string $arg2 置換文字列{2}の値。
     * @param string $arg3 置換文字列{3}の値。
     * @param string $arg4 置換文字列{4}の値。
     * @param string $arg5 置換文字列{5}の値。
     * @param string $arg6 置換文字列{6}の値。
     * @param string $arg7 置換文字列{7}の値。
     * @param string $arg8 置換文字列{8}の値。
     * @param string $arg9 置換文字列{9}の値。
     * @param string $arg10 置換文字列{10}の値。
     * @param string $arg11 置換文字列{11}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage008(/*.string.*/ $arg0, /*.string.*/ $arg1, /*.string.*/ $arg2, /*.string.*/ $arg3, /*.string.*/ $arg4, /*.string.*/ $arg5, /*.string.*/ $arg6, /*.string.*/ $arg7, /*.string.*/ $arg8, /*.string.*/ $arg9, /*.string.*/ $arg10, /*.string.*/ $arg11) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 12) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 のパラメータは[12]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg1) . ']型が与えられました。');
        }
        if (gettype($arg2) !== 'string' && gettype($arg2) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の3番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg2) . ']型が与えられました。');
        }
        if (gettype($arg3) !== 'string' && gettype($arg3) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の4番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg3) . ']型が与えられました。');
        }
        if (gettype($arg4) !== 'string' && gettype($arg4) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の5番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg4) . ']型が与えられました。');
        }
        if (gettype($arg5) !== 'string' && gettype($arg5) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の6番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg5) . ']型が与えられました。');
        }
        if (gettype($arg6) !== 'string' && gettype($arg6) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の7番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg6) . ']型が与えられました。');
        }
        if (gettype($arg7) !== 'string' && gettype($arg7) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の8番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg7) . ']型が与えられました。');
        }
        if (gettype($arg8) !== 'string' && gettype($arg8) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の9番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg8) . ']型が与えられました。');
        }
        if (gettype($arg9) !== 'string' && gettype($arg9) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の10番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg9) . ']型が与えられました。');
        }
        if (gettype($arg10) !== 'string' && gettype($arg10) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の11番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg10) . ']型が与えられました。');
        }
        if (gettype($arg11) !== 'string' && gettype($arg11) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage008 の12番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg11) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg1 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg2 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg2]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg3 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg3]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg4 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg4]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg5 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg5]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg6 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg6]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg7 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg7]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg8 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg8]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg9 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg9]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg10 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg10]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg11 === null) {
            throw new \Exception('メソッド[getMessage008]のパラメータ[arg11]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return 'たくさんの置換文字。' . $arg11 . $arg10 . $arg9 . $arg8 . $arg7 . $arg6 . $arg5 . $arg4 . $arg3 . $arg2 . $arg1 . $arg0 . 'と12個。';
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE009]の文字列を取得します。
     *
     * No.9:
     * 文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]
     *
     * @param string $arg0 置換文字列{0}の値。
     * @param string $arg1 置換文字列{1}の値。
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage009(/*.string.*/ $arg0, /*.string.*/ $arg1) {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 2) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage009 のパラメータは[2]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage009 の1番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg0) . ']型が与えられました。');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage009 の2番目のパラメータは[string]型でなくてはなりません。しかし実際には[' . gettype($arg1) . ']型が与えられました。');
        }

        if ($arg0 === null) {
            throw new \Exception('メソッド[getMessage009]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }
        if ($arg1 === null) {
            throw new \Exception('メソッド[getMessage009]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。');
        }

        return $arg0 . '番号が飛ぶと置換文字列は不正として判断されます。' . $arg1 . '。この定義書は0オリジンです。';
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE010]の文字列を取得します。
     *
     * No.10:
     * 文字列[エスケープ処理の確認。ダブルクオーテーション&quot;、シングルクオーテーション'、エンマーク\。]
     *
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage010() {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 0) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage010 のパラメータは[0]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }

        return 'エスケープ処理の確認。ダブルクオーテーション"、シングルクオーテーション\'、エンマーク\\。';
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE011]の文字列を取得します。
     *
     * No.11:
     * 文字列[×]
     *
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage011() {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 0) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage011 のパラメータは[0]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }

        return '×';
    }

    /**
     * メッセージ定義ID[Sample]、キー[MESSAGE012]の文字列を取得します。
     *
     * No.12:
     * 文字列[改行[\n]の試験。]
     *
     * @return string メッセージ文字列。
     */
    public /*.string.*/ function getMessage012() {
        /* パラメータの数、型チェックを行います。 */
        if (func_num_args() !== 0) {
            throw new \Exception('[ArgumentException]: SampleMessage.getMessage012 のパラメータは[0]個である必要があります。しかし実際には[' . func_num_args() .  ']個のパラメータを伴って呼び出されました。');
        }

        return '改行[\n]の試験。';
    }
}
?>
