package blanco.message.task.valueobject;

/**
 * 処理クラス [BlancoMessageProcess]の入力バリューオブジェクトクラスです。
 */
public class BlancoMessageProcessInput {
    /**
     * verboseモードで動作させるかどうか。
     *
     * フィールド: [verbose]。
     * デフォルト: [false]。
     */
    private boolean fVerbose = false;

    /**
     * メタディレクトリ。xlsファイルの格納先または xmlファイルの格納先を指定します。
     *
     * フィールド: [metadir]。
     */
    private String fMetadir;

    /**
     * 出力先フォルダを指定します。無指定の場合にはカレント直下のblancoを用います。
     *
     * フィールド: [targetdir]。
     * デフォルト: [blanco]。
     */
    private String fTargetdir = "blanco";

    /**
     * テンポラリディレクトリを指定します。無指定の場合にはカレント直下のtmpを用います。
     *
     * フィールド: [tmpdir]。
     * デフォルト: [tmp]。
     */
    private String fTmpdir = "tmp";

    /**
     * 自動生成するソースファイルの文字エンコーディングを指定します。
     *
     * フィールド: [encoding]。
     */
    private String fEncoding;

    /**
     * ターゲットとなるプログラミング言語処理系名。java, cs, js, vb,php,ruby,pythonが選択可能。
     *
     * フィールド: [targetlang]。
     * デフォルト: [java]。
     */
    private String fTargetlang = "java";

    /**
     * 文字列をクラスの定数として出力するかどうか。
     *
     * フィールド: [constants]。
     * デフォルト: [false]。
     */
    private boolean fConstants = false;

    /**
     * Java JSF のメッセージを出力するかどうか。Java 言語のみ対応。
     *
     * フィールド: [isJavaJsf]。
     * デフォルト: [false]。
     */
    private boolean fIsJavaJsf = false;

    /**
     * Java Apache Struts のメッセージを出力するかどうか。Java 言語のみ対応。
     *
     * フィールド: [isJavaStruts]。
     * デフォルト: [false]。
     */
    private boolean fIsJavaStruts = false;

    /**
     * フィールド [verbose] の値を設定します。
     *
     * フィールドの説明: [verboseモードで動作させるかどうか。]。
     *
     * @param argVerbose フィールド[verbose]に設定する値。
     */
    public void setVerbose(final boolean argVerbose) {
        fVerbose = argVerbose;
    }

    /**
     * フィールド [verbose] の値を取得します。
     *
     * フィールドの説明: [verboseモードで動作させるかどうか。]。
     * デフォルト: [false]。
     *
     * @return フィールド[verbose]から取得した値。
     */
    public boolean getVerbose() {
        return fVerbose;
    }

    /**
     * フィールド [metadir] の値を設定します。
     *
     * フィールドの説明: [メタディレクトリ。xlsファイルの格納先または xmlファイルの格納先を指定します。]。
     *
     * @param argMetadir フィールド[metadir]に設定する値。
     */
    public void setMetadir(final String argMetadir) {
        fMetadir = argMetadir;
    }

    /**
     * フィールド [metadir] の値を取得します。
     *
     * フィールドの説明: [メタディレクトリ。xlsファイルの格納先または xmlファイルの格納先を指定します。]。
     *
     * @return フィールド[metadir]から取得した値。
     */
    public String getMetadir() {
        return fMetadir;
    }

    /**
     * フィールド [targetdir] の値を設定します。
     *
     * フィールドの説明: [出力先フォルダを指定します。無指定の場合にはカレント直下のblancoを用います。]。
     *
     * @param argTargetdir フィールド[targetdir]に設定する値。
     */
    public void setTargetdir(final String argTargetdir) {
        fTargetdir = argTargetdir;
    }

    /**
     * フィールド [targetdir] の値を取得します。
     *
     * フィールドの説明: [出力先フォルダを指定します。無指定の場合にはカレント直下のblancoを用います。]。
     * デフォルト: [blanco]。
     *
     * @return フィールド[targetdir]から取得した値。
     */
    public String getTargetdir() {
        return fTargetdir;
    }

    /**
     * フィールド [tmpdir] の値を設定します。
     *
     * フィールドの説明: [テンポラリディレクトリを指定します。無指定の場合にはカレント直下のtmpを用います。]。
     *
     * @param argTmpdir フィールド[tmpdir]に設定する値。
     */
    public void setTmpdir(final String argTmpdir) {
        fTmpdir = argTmpdir;
    }

    /**
     * フィールド [tmpdir] の値を取得します。
     *
     * フィールドの説明: [テンポラリディレクトリを指定します。無指定の場合にはカレント直下のtmpを用います。]。
     * デフォルト: [tmp]。
     *
     * @return フィールド[tmpdir]から取得した値。
     */
    public String getTmpdir() {
        return fTmpdir;
    }

    /**
     * フィールド [encoding] の値を設定します。
     *
     * フィールドの説明: [自動生成するソースファイルの文字エンコーディングを指定します。]。
     *
     * @param argEncoding フィールド[encoding]に設定する値。
     */
    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * フィールド [encoding] の値を取得します。
     *
     * フィールドの説明: [自動生成するソースファイルの文字エンコーディングを指定します。]。
     *
     * @return フィールド[encoding]から取得した値。
     */
    public String getEncoding() {
        return fEncoding;
    }

    /**
     * フィールド [targetlang] の値を設定します。
     *
     * フィールドの説明: [ターゲットとなるプログラミング言語処理系名。java, cs, js, vb,php,ruby,pythonが選択可能。]。
     *
     * @param argTargetlang フィールド[targetlang]に設定する値。
     */
    public void setTargetlang(final String argTargetlang) {
        fTargetlang = argTargetlang;
    }

    /**
     * フィールド [targetlang] の値を取得します。
     *
     * フィールドの説明: [ターゲットとなるプログラミング言語処理系名。java, cs, js, vb,php,ruby,pythonが選択可能。]。
     * デフォルト: [java]。
     *
     * @return フィールド[targetlang]から取得した値。
     */
    public String getTargetlang() {
        return fTargetlang;
    }

    /**
     * フィールド [constants] の値を設定します。
     *
     * フィールドの説明: [文字列をクラスの定数として出力するかどうか。]。
     *
     * @param argConstants フィールド[constants]に設定する値。
     */
    public void setConstants(final boolean argConstants) {
        fConstants = argConstants;
    }

    /**
     * フィールド [constants] の値を取得します。
     *
     * フィールドの説明: [文字列をクラスの定数として出力するかどうか。]。
     * デフォルト: [false]。
     *
     * @return フィールド[constants]から取得した値。
     */
    public boolean getConstants() {
        return fConstants;
    }

    /**
     * フィールド [isJavaJsf] の値を設定します。
     *
     * フィールドの説明: [Java JSF のメッセージを出力するかどうか。Java 言語のみ対応。]。
     *
     * @param argIsJavaJsf フィールド[isJavaJsf]に設定する値。
     */
    public void setIsJavaJsf(final boolean argIsJavaJsf) {
        fIsJavaJsf = argIsJavaJsf;
    }

    /**
     * フィールド [isJavaJsf] の値を取得します。
     *
     * フィールドの説明: [Java JSF のメッセージを出力するかどうか。Java 言語のみ対応。]。
     * デフォルト: [false]。
     *
     * @return フィールド[isJavaJsf]から取得した値。
     */
    public boolean getIsJavaJsf() {
        return fIsJavaJsf;
    }

    /**
     * フィールド [isJavaStruts] の値を設定します。
     *
     * フィールドの説明: [Java Apache Struts のメッセージを出力するかどうか。Java 言語のみ対応。]。
     *
     * @param argIsJavaStruts フィールド[isJavaStruts]に設定する値。
     */
    public void setIsJavaStruts(final boolean argIsJavaStruts) {
        fIsJavaStruts = argIsJavaStruts;
    }

    /**
     * フィールド [isJavaStruts] の値を取得します。
     *
     * フィールドの説明: [Java Apache Struts のメッセージを出力するかどうか。Java 言語のみ対応。]。
     * デフォルト: [false]。
     *
     * @return フィールド[isJavaStruts]から取得した値。
     */
    public boolean getIsJavaStruts() {
        return fIsJavaStruts;
    }

    /**
     * このバリューオブジェクトの文字列表現を取得します。
     *
     * <P>使用上の注意</P>
     * <UL>
     * <LI>オブジェクトのシャロー範囲のみ文字列化の処理対象となります。
     * <LI>オブジェクトが循環参照している場合には、このメソッドは使わないでください。
     * </UL>
     *
     * @return バリューオブジェクトの文字列表現。
     */
    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.message.task.valueobject.BlancoMessageProcessInput[");
        buf.append("verbose=" + fVerbose);
        buf.append(",metadir=" + fMetadir);
        buf.append(",targetdir=" + fTargetdir);
        buf.append(",tmpdir=" + fTmpdir);
        buf.append(",encoding=" + fEncoding);
        buf.append(",targetlang=" + fTargetlang);
        buf.append(",constants=" + fConstants);
        buf.append(",isJavaJsf=" + fIsJavaJsf);
        buf.append(",isJavaStruts=" + fIsJavaStruts);
        buf.append("]");
        return buf.toString();
    }

    /**
     * このバリューオブジェクトを指定のターゲットに複写します。
     *
     * <P>使用上の注意</P>
     * <UL>
     * <LI>オブジェクトのシャロー範囲のみ複写処理対象となります。
     * <LI>オブジェクトが循環参照している場合には、このメソッドは使わないでください。
     * </UL>
     *
     * @param target target value object.
     */
    public void copyTo(final BlancoMessageProcessInput target) {
        if (target == null) {
            throw new IllegalArgumentException("Bug: BlancoMessageProcessInput#copyTo(target): argument 'target' is null");
        }

        // No needs to copy parent class.

        // Name: fVerbose
        // Type: boolean
        target.fVerbose = this.fVerbose;
        // Name: fMetadir
        // Type: java.lang.String
        target.fMetadir = this.fMetadir;
        // Name: fTargetdir
        // Type: java.lang.String
        target.fTargetdir = this.fTargetdir;
        // Name: fTmpdir
        // Type: java.lang.String
        target.fTmpdir = this.fTmpdir;
        // Name: fEncoding
        // Type: java.lang.String
        target.fEncoding = this.fEncoding;
        // Name: fTargetlang
        // Type: java.lang.String
        target.fTargetlang = this.fTargetlang;
        // Name: fConstants
        // Type: boolean
        target.fConstants = this.fConstants;
        // Name: fIsJavaJsf
        // Type: boolean
        target.fIsJavaJsf = this.fIsJavaJsf;
        // Name: fIsJavaStruts
        // Type: boolean
        target.fIsJavaStruts = this.fIsJavaStruts;
    }
}
