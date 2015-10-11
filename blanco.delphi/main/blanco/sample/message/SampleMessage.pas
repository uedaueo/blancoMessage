// このソースコードは blanco Frameworkによって自動生成されています。
unit SampleMessage;

interface
type
    // メッセージのサンプル。このクラスは単にサンプルです。実際の動作には利用されません。
    TSampleMessage = class(TObject)

    public

        // 文字列[メッセージのサンプル。その１。]
        const MESSAGE001: String;

        // キー値: KEY_MESSAGE001
        const KEY_MESSAGE001: String;

        // 文字列[メッセージ置換文字[{0}]が置換されます。]
        const MESSAGE002: String;

        // キー値: KEY_MESSAGE002
        const KEY_MESSAGE002: String;

        // 文字列[メッセージ置換文字[{0}]に加え、もうひとつ[{1}]が置換されます。]
        const MESSAGE003: String;

        // キー値: KEY_MESSAGE003
        const KEY_MESSAGE003: String;

        // 文字列[連続したメッセージ置換文字{0}{1}の例です。]
        const MESSAGE004: String;

        // キー値: KEY_MESSAGE004
        const KEY_MESSAGE004: String;

        // 文字列[{0}先頭から置換文字列がある例。]
        const MESSAGE005: String;

        // キー値: KEY_MESSAGE005
        const KEY_MESSAGE005: String;

        // 文字列[最後が置換文字列の例。{0}]
        const MESSAGE006: String;

        // キー値: KEY_MESSAGE006
        const KEY_MESSAGE006: String;

        // 文字列[何度も現れる置換文字{0}{1}{0}{1}{2}{1}{0}]
        const MESSAGE007: String;

        // キー値: KEY_MESSAGE007
        const KEY_MESSAGE007: String;

        // 文字列[たくさんの置換文字。{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}と12個。]
        const MESSAGE008: String;

        // キー値: KEY_MESSAGE008
        const KEY_MESSAGE008: String;

        // 文字列[{0}番号が飛ぶと置換文字列は不正として判断されます。{1}。この定義書は0オリジンです。]
        const MESSAGE009: String;

        // キー値: KEY_MESSAGE009
        const KEY_MESSAGE009: String;

        // 文字列[エスケープ処理の確認。ダブルクオーテーション&amp;quot;、シングルクオーテーション'、エンマーク\。]
        const MESSAGE010: String;

        // キー値: KEY_MESSAGE010
        const KEY_MESSAGE010: String;

        // 文字列[×]
        const MESSAGE011: String;

        // キー値: KEY_MESSAGE011
        const KEY_MESSAGE011: String;

        // 文字列[改行[\n]の試験。]
        const MESSAGE012: String;

        // キー値: KEY_MESSAGE012
        const KEY_MESSAGE012: String;

    public

        function getMessage001: String;

        function getMessage002(arg0: String): String;

        function getMessage003(arg0: String; arg1: String): String;

        function getMessage004(arg0: String; arg1: String): String;

        function getMessage005(arg0: String): String;

        function getMessage006(arg0: String): String;

        function getMessage007(arg0: String; arg1: String; arg2: String): String;

        function getMessage008(arg0: String; arg1: String; arg2: String; arg3: String; arg4: String; arg5: String; arg6: String; arg7: String; arg8: String; arg9: String; arg10: String; arg11: String): String;

        function getMessage009(arg0: String; arg1: String): String;

        function getMessage010: String;

        function getMessage011: String;

        function getMessage012: String;
    end;
implementation

    function TSampleMessage.getMessage001: String;
    begin
        result:= 'メッセージのサンプル。その１。';
        exit;
    end;

    function TSampleMessage.getMessage002(arg0: String): String;
    begin
        result:= 'メッセージ置換文字[' + arg0 + ']が置換されます。';
        exit;
    end;

    function TSampleMessage.getMessage003(arg0: String; arg1: String): String;
    begin
        result:= 'メッセージ置換文字[' + arg0 + ']に加え、もうひとつ[' + arg1 + ']が置換されます。';
        exit;
    end;

    function TSampleMessage.getMessage004(arg0: String; arg1: String): String;
    begin
        result:= '連続したメッセージ置換文字' + arg0 + arg1 + 'の例です。';
        exit;
    end;

    function TSampleMessage.getMessage005(arg0: String): String;
    begin
        result:= arg0 + '先頭から置換文字列がある例。';
        exit;
    end;

    function TSampleMessage.getMessage006(arg0: String): String;
    begin
        result:= '最後が置換文字列の例。' + arg0;
        exit;
    end;

    function TSampleMessage.getMessage007(arg0: String; arg1: String; arg2: String): String;
    begin
        result:= '何度も現れる置換文字' + arg0 + arg1 + arg0 + arg1 + arg2 + arg1 + arg0;
        exit;
    end;

    function TSampleMessage.getMessage008(arg0: String; arg1: String; arg2: String; arg3: String; arg4: String; arg5: String; arg6: String; arg7: String; arg8: String; arg9: String; arg10: String; arg11: String): String;
    begin
        result:= 'たくさんの置換文字。' + arg11 + arg10 + arg9 + arg8 + arg7 + arg6 + arg5 + arg4 + arg3 + arg2 + arg1 + arg0 + 'と12個。';
        exit;
    end;

    function TSampleMessage.getMessage009(arg0: String; arg1: String): String;
    begin
        result:= arg0 + '番号が飛ぶと置換文字列は不正として判断されます。' + arg1 + '。この定義書は0オリジンです。';
        exit;
    end;

    function TSampleMessage.getMessage010: String;
    begin
        result:= 'エスケープ処理の確認。ダブルクオーテーション"、シングルクオーテーション''、エンマーク\。';
        exit;
    end;

    function TSampleMessage.getMessage011: String;
    begin
        result:= '×';
        exit;
    end;

    function TSampleMessage.getMessage012: String;
    begin
        result:= '改行[\n]の試験。';
        exit;
    end;
end.

