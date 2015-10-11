blancoMessageは 「メッセージ定義書」というExcel様式を記入するだけで 簡単に メッセージ文字列を処理するクラス・ソースコードが作成できるようにするためのツールです。
Java, C#.NET, JavaScript, VB.NET, PHP, Ruby のソースコード自動生成に対応しています。
メッセージ文字列を扱うプログラミングの際によくありがちなルーチンワーク的プログラミングを肩代わりすることができます。
加えて、blancoMessageを導入すると、設計書とソースコードが自動的に同期化されるという効果があります。

なお、Java言語のみがターゲットの場合には blancoResourceBundleという blancoMessageよりも高機能なメッセージ定義書処理系実装があります。
これは状況に応じて判断して使い分けるようにしてください。

[開発者]
 1.伊賀敏樹 (Tosiki Iga / いがぴょん): 開発および維持メンテ担当
 2.山本耕司 (Y-moto) : 仕様決定およびリリース判定担当

[ライセンス]
 1.blancoMessage は ライセンス として GNU Lesser General Public License を採用しています。

[依存するライブラリ]
blancoMessageは下記のライブラリを利用しています。
※各オープンソース・プロダクトの提供者に感謝します。
 1.JExcelApi - Java Excel API - A Java API to read, write and modify Excel spreadsheets
     http://jexcelapi.sourceforge.net/
     http://sourceforge.net/projects/jexcelapi/
     http://www.andykhan.com/jexcelapi/ 
   概要: JavaからExcelブック形式を読み書きするためのライブラリです。
   ライセンス: GNU Lesser General Public License
 2.blancoCg
   概要: ソースコード生成ライブラリ
   ライセンス: GNU Lesser General Public License
 3.その他の blanco Framework
   概要: このプロダクトは それ自身が blanco Frameworkにより自動生成されています。
         このプロダクトは 実行時に blanco Framework各種プロダクトに依存して動作します。
   ライセンス: GNU Lesser General Public License
