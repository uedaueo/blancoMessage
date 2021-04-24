package blanco.message.task;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import blanco.message.task.valueobject.BlancoMessageProcessInput;

/**
 * Apache Antタスク [BlancoMessage]のクラス。
 *
 * メッセージ定義書からメッセージクラスを自動生成するためのAntTaskです。<br>
 * このクラスでは、Apache Antタスクで一般的に必要なチェックなどのコーディングを肩代わりします。
 * 実際の処理は パッケージ[blanco.message.task]にBlancoMessageBatchProcessクラスを作成して記述してください。<br>
 * <br>
 * Antタスクへの組み込み例<br>
 * <pre>
 * &lt;taskdef name=&quot;blancomessage&quot; classname=&quot;blanco.message.task.BlancoMessageTask">
 *     &lt;classpath&gt;
 *         &lt;fileset dir=&quot;lib&quot; includes=&quot;*.jar&quot; /&gt;
 *         &lt;fileset dir=&quot;lib.ant&quot; includes=&quot;*.jar&quot; /&gt;
 *     &lt;/classpath&gt;
 * &lt;/taskdef&gt;
 * </pre>
 */
public class BlancoMessageTask extends Task {
    /**
     * メッセージ定義書からメッセージクラスを自動生成するためのAntTaskです。
     */
    protected BlancoMessageProcessInput fInput = new BlancoMessageProcessInput();

    /**
     * フィールド [metadir] に値がセットされたかどうか。
     */
    protected boolean fIsFieldMetadirProcessed = false;

    /**
     * フィールド [targetdir] に値がセットされたかどうか。
     */
    protected boolean fIsFieldTargetdirProcessed = false;

    /**
     * フィールド [tmpdir] に値がセットされたかどうか。
     */
    protected boolean fIsFieldTmpdirProcessed = false;

    /**
     * フィールド [encoding] に値がセットされたかどうか。
     */
    protected boolean fIsFieldEncodingProcessed = false;

    /**
     * フィールド [targetlang] に値がセットされたかどうか。
     */
    protected boolean fIsFieldTargetlangProcessed = false;

    /**
     * フィールド [constants] に値がセットされたかどうか。
     */
    protected boolean fIsFieldConstantsProcessed = false;

    /**
     * フィールド [isJavaJsf] に値がセットされたかどうか。
     */
    protected boolean fIsFieldIsJavaJsfProcessed = false;

    /**
     * フィールド [isJavaStruts] に値がセットされたかどうか。
     */
    protected boolean fIsFieldIsJavaStrutsProcessed = false;

    /**
     * フィールド [lineSeparator] に値がセットされたかどうか。
     */
    protected boolean fIsFieldLineSeparatorProcessed = false;

    /**
     * verboseモードで動作させるかどうか。
     *
     * @param arg verboseモードで動作させるかどうか。
     */
    public void setVerbose(final boolean arg) {
        fInput.setVerbose(arg);
    }

    /**
     * verboseモードで動作させるかどうか。
     *
     * @return verboseモードで動作させるかどうか。
     */
    public boolean getVerbose() {
        return fInput.getVerbose();
    }

    /**
     * Antタスクの[metadir]アトリビュートのセッターメソッド。
     *
     * 項目番号: 1<br>
     * メタディレクトリ。xlsファイルの格納先または xmlファイルの格納先を指定します。<br>
     *
     * @param arg セットしたい値
     */
    public void setMetadir(final String arg) {
        fInput.setMetadir(arg);
        fIsFieldMetadirProcessed = true;
    }

    /**
     * Antタスクの[metadir]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 1<br>
     * メタディレクトリ。xlsファイルの格納先または xmlファイルの格納先を指定します。<br>
     * 必須アトリビュートです。Apache Antタスク上で必ず値が指定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getMetadir() {
        return fInput.getMetadir();
    }

    /**
     * Antタスクの[targetdir]アトリビュートのセッターメソッド。
     *
     * 項目番号: 2<br>
     * 出力先フォルダを指定します。無指定の場合にはカレント直下のblancoを用います。<br>
     *
     * @param arg セットしたい値
     */
    public void setTargetdir(final String arg) {
        fInput.setTargetdir(arg);
        fIsFieldTargetdirProcessed = true;
    }

    /**
     * Antタスクの[targetdir]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 2<br>
     * 出力先フォルダを指定します。無指定の場合にはカレント直下のblancoを用います。<br>
     * デフォルト値[blanco]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getTargetdir() {
        return fInput.getTargetdir();
    }

    /**
     * Antタスクの[tmpdir]アトリビュートのセッターメソッド。
     *
     * 項目番号: 3<br>
     * テンポラリディレクトリを指定します。無指定の場合にはカレント直下のtmpを用います。<br>
     *
     * @param arg セットしたい値
     */
    public void setTmpdir(final String arg) {
        fInput.setTmpdir(arg);
        fIsFieldTmpdirProcessed = true;
    }

    /**
     * Antタスクの[tmpdir]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 3<br>
     * テンポラリディレクトリを指定します。無指定の場合にはカレント直下のtmpを用います。<br>
     * デフォルト値[tmp]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getTmpdir() {
        return fInput.getTmpdir();
    }

    /**
     * Antタスクの[encoding]アトリビュートのセッターメソッド。
     *
     * 項目番号: 4<br>
     * 自動生成するソースファイルの文字エンコーディングを指定します。<br>
     *
     * @param arg セットしたい値
     */
    public void setEncoding(final String arg) {
        fInput.setEncoding(arg);
        fIsFieldEncodingProcessed = true;
    }

    /**
     * Antタスクの[encoding]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 4<br>
     * 自動生成するソースファイルの文字エンコーディングを指定します。<br>
     *
     * @return このフィールドの値
     */
    public String getEncoding() {
        return fInput.getEncoding();
    }

    /**
     * Antタスクの[targetlang]アトリビュートのセッターメソッド。
     *
     * 項目番号: 5<br>
     * ターゲットとなるプログラミング言語処理系名。java, cs, js, vb,php,ruby,pythonが選択可能。<br>
     *
     * @param arg セットしたい値
     */
    public void setTargetlang(final String arg) {
        fInput.setTargetlang(arg);
        fIsFieldTargetlangProcessed = true;
    }

    /**
     * Antタスクの[targetlang]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 5<br>
     * ターゲットとなるプログラミング言語処理系名。java, cs, js, vb,php,ruby,pythonが選択可能。<br>
     * デフォルト値[java]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getTargetlang() {
        return fInput.getTargetlang();
    }

    /**
     * Antタスクの[constants]アトリビュートのセッターメソッド。
     *
     * 項目番号: 6<br>
     * 文字列をクラスの定数として出力するかどうか。<br>
     *
     * @param arg セットしたい値
     */
    public void setConstants(final boolean arg) {
        fInput.setConstants(arg);
        fIsFieldConstantsProcessed = true;
    }

    /**
     * Antタスクの[constants]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 6<br>
     * 文字列をクラスの定数として出力するかどうか。<br>
     * デフォルト値[false]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public boolean getConstants() {
        return fInput.getConstants();
    }

    /**
     * Antタスクの[isJavaJsf]アトリビュートのセッターメソッド。
     *
     * 項目番号: 7<br>
     * Java JSF のメッセージを出力するかどうか。Java 言語のみ対応。<br>
     *
     * @param arg セットしたい値
     */
    public void setIsJavaJsf(final boolean arg) {
        fInput.setIsJavaJsf(arg);
        fIsFieldIsJavaJsfProcessed = true;
    }

    /**
     * Antタスクの[isJavaJsf]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 7<br>
     * Java JSF のメッセージを出力するかどうか。Java 言語のみ対応。<br>
     * デフォルト値[false]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public boolean getIsJavaJsf() {
        return fInput.getIsJavaJsf();
    }

    /**
     * Antタスクの[isJavaStruts]アトリビュートのセッターメソッド。
     *
     * 項目番号: 8<br>
     * Java Apache Struts のメッセージを出力するかどうか。Java 言語のみ対応。<br>
     *
     * @param arg セットしたい値
     */
    public void setIsJavaStruts(final boolean arg) {
        fInput.setIsJavaStruts(arg);
        fIsFieldIsJavaStrutsProcessed = true;
    }

    /**
     * Antタスクの[isJavaStruts]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 8<br>
     * Java Apache Struts のメッセージを出力するかどうか。Java 言語のみ対応。<br>
     * デフォルト値[false]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public boolean getIsJavaStruts() {
        return fInput.getIsJavaStruts();
    }

    /**
     * Antタスクの[lineSeparator]アトリビュートのセッターメソッド。
     *
     * 項目番号: 5<br>
     * 自動生成するソースコードの改行コードを、LF, CR, CRLFで指定します。<br>
     *
     * @param arg セットしたい値
     */
    public void setLineSeparator(final String arg) {
        fInput.setLineSeparator(arg);
        fIsFieldLineSeparatorProcessed = true;
    }

    /**
     * Antタスクの[lineSeparator]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 5<br>
     * 自動生成するソースコードの改行コードを、LF, CR, CRLFで指定します。<br>
     * デフォルト値[LF]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getLineSeparator() {
        return fInput.getLineSeparator();
    }

    /**
     * Antタスクのメイン処理。Apache Antから このメソッドが呼び出されます。
     *
     * @throws BuildException タスクとしての例外が発生した場合。
     */
    @Override
    public final void execute() throws BuildException {
        System.out.println("BlancoMessageTask begin.");

        // 項目番号[1]、アトリビュート[metadir]は必須入力です。入力チェックを行います。
        if (fIsFieldMetadirProcessed == false) {
            throw new BuildException("必須アトリビュート[metadir]が設定されていません。処理を中断します。");
        }

        if (getVerbose()) {
            System.out.println("- verbose:[true]");
            System.out.println("- metadir:[" + getMetadir() + "]");
            System.out.println("- targetdir:[" + getTargetdir() + "]");
            System.out.println("- tmpdir:[" + getTmpdir() + "]");
            System.out.println("- encoding:[" + getEncoding() + "]");
            System.out.println("- targetlang:[" + getTargetlang() + "]");
            System.out.println("- constants:[" + getConstants() + "]");
            System.out.println("- isJavaJsf:[" + getIsJavaJsf() + "]");
            System.out.println("- isJavaStruts:[" + getIsJavaStruts() + "]");
            System.out.println("- lineSeparator:[" + getLineSeparator() + "]");
        }

        try {
            // 実際のAntタスクの主処理を実行します。
            // この箇所でコンパイルエラーが発生する場合、BlancoMessageProcessインタフェースを実装して blanco.message.taskパッケージに BlancoMessageProcessImplクラスを作成することにより解決できる場合があります。
            final BlancoMessageProcess proc = new BlancoMessageProcessImpl();
            if (proc.execute(fInput) != BlancoMessageBatchProcess.END_SUCCESS) {
                throw new BuildException("タスクは異常終了しました。");
            }
        } catch (IllegalArgumentException e) {
            if (getVerbose()) {
                e.printStackTrace();
            }
            throw new BuildException(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new BuildException("タスクを処理中に例外が発生しました。処理を中断します。" + e.toString());
        } catch (Error e) {
            e.printStackTrace();
            throw new BuildException("タスクを処理中にエラーが発生しました。処理を中断します。" + e.toString());
        }
    }
}
