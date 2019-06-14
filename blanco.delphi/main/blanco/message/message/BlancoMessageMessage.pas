// このソースコードは blanco Frameworkによって自動生成されています。
unit BlancoMessageMessage;

interface
type
    // blancoMessageが内部的に利用するメッセージクラスです。
    TBlancoMessageMessage = class(TObject)

    public

        // 文字列[メッセージ定義ID[{0}]のパッケージ名が指定されていません。]
        const MBMSGI01: String;

        // キー値: KEY_MBMSGI01
        const KEY_MBMSGI01: String;

        // 文字列[サポートしない出力プログラミング言語処理系[{0}]が指定されました。]
        const MBMSGI02: String;

        // キー値: KEY_MBMSGI02
        const KEY_MBMSGI02: String;

        // 文字列[メッセージ定義ID[{0}]において、キー[{1}]が2回以上あらわれました。同じキーは2回以上指定することはできません。]
        const MBMSGI03: String;

        // キー値: KEY_MBMSGI03
        const KEY_MBMSGI03: String;

        // 文字列[メッセージ定義ID[{0}]において、キー[{1}]のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[{2}]とリソースバンドルとして判断した場合の置換文字列の個数[{3}]とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。]
        const MBMSGI04: String;

        // キー値: KEY_MBMSGI04
        const KEY_MBMSGI04: String;

        // 文字列[メタディレクトリ[{0}]が存在しません。]
        const MBMSGA01: String;

        // キー値: KEY_MBMSGA01
        const KEY_MBMSGA01: String;

    public

        function getMbmsgi01(arg0: String): String;

        function getMbmsgi02(arg0: String): String;

        function getMbmsgi03(arg0: String; arg1: String): String;

        function getMbmsgi04(arg0: String; arg1: String; arg2: String; arg3: String): String;

        function getMbmsga01(arg0: String): String;
    end;
implementation

    function TBlancoMessageMessage.getMbmsgi01(arg0: String): String;
    begin
        result:= '[MBMSGI01] メッセージ定義ID[' + arg0 + ']のパッケージ名が指定されていません。';
        exit;
    end;

    function TBlancoMessageMessage.getMbmsgi02(arg0: String): String;
    begin
        result:= '[MBMSGI02] サポートしない出力プログラミング言語処理系[' + arg0 + ']が指定されました。';
        exit;
    end;

    function TBlancoMessageMessage.getMbmsgi03(arg0: String; arg1: String): String;
    begin
        result:= '[MBMSGI03] メッセージ定義ID[' + arg0 + ']において、キー[' + arg1 + ']が2回以上あらわれました。同じキーは2回以上指定することはできません。';
        exit;
    end;

    function TBlancoMessageMessage.getMbmsgi04(arg0: String; arg1: String; arg2: String; arg3: String): String;
    begin
        result:= '[MBMSGI04] メッセージ定義ID[' + arg0 + ']において、キー[' + arg1 + ']のメッセージが不正です。メッセージ定義として判断した場合の置換文字列の個数[' + arg2 + ']とリソースバンドルとして判断した場合の置換文字列の個数[' + arg3 + ']とが異なります。置換文字列の番号は飛んでしまっていませんか？正しくフォーマット定義してください。';
        exit;
    end;

    function TBlancoMessageMessage.getMbmsga01(arg0: String): String;
    begin
        result:= '[MBMSGA01] メタディレクトリ[' + arg0 + ']が存在しません。';
        exit;
    end;
end.

