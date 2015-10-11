/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.message.valueobject;

/**
 * BlancoMessageのなかで利用されるValueObjectです。
 */
public class BlancoMessageFieldStructure {
    /**
     * 項目番号
     *
     * フィールド: [no]。
     */
    private String fNo;

    /**
     * キーをあらわします。
     *
     * フィールド: [name]。
     */
    private String fName;

    /**
     * メッセージ・レベル。
     *
     * フィールド: [level]。
     */
    private String fLevel;

    /**
     * メッセージ文字列をあらわします。
     *
     * フィールド: [message]。
     */
    private String fMessage;

    /**
     * フィールド [no] の値を設定します。
     *
     * フィールドの説明: [項目番号]。
     *
     * @param argNo フィールド[no]に設定する値。
     */
    public void setNo(final String argNo) {
        fNo = argNo;
    }

    /**
     * フィールド [no] の値を取得します。
     *
     * フィールドの説明: [項目番号]。
     *
     * @return フィールド[no]から取得した値。
     */
    public String getNo() {
        return fNo;
    }

    /**
     * フィールド [name] の値を設定します。
     *
     * フィールドの説明: [キーをあらわします。]。
     *
     * @param argName フィールド[name]に設定する値。
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * フィールド [name] の値を取得します。
     *
     * フィールドの説明: [キーをあらわします。]。
     *
     * @return フィールド[name]から取得した値。
     */
    public String getName() {
        return fName;
    }

    /**
     * フィールド [level] の値を設定します。
     *
     * フィールドの説明: [メッセージ・レベル。]。
     *
     * @param argLevel フィールド[level]に設定する値。
     */
    public void setLevel(final String argLevel) {
        fLevel = argLevel;
    }

    /**
     * フィールド [level] の値を取得します。
     *
     * フィールドの説明: [メッセージ・レベル。]。
     *
     * @return フィールド[level]から取得した値。
     */
    public String getLevel() {
        return fLevel;
    }

    /**
     * フィールド [message] の値を設定します。
     *
     * フィールドの説明: [メッセージ文字列をあらわします。]。
     *
     * @param argMessage フィールド[message]に設定する値。
     */
    public void setMessage(final String argMessage) {
        fMessage = argMessage;
    }

    /**
     * フィールド [message] の値を取得します。
     *
     * フィールドの説明: [メッセージ文字列をあらわします。]。
     *
     * @return フィールド[message]から取得した値。
     */
    public String getMessage() {
        return fMessage;
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
        buf.append("blanco.message.valueobject.BlancoMessageFieldStructure[");
        buf.append("no=" + fNo);
        buf.append(",name=" + fName);
        buf.append(",level=" + fLevel);
        buf.append(",message=" + fMessage);
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
    public void copyTo(final BlancoMessageFieldStructure target) {
        if (target == null) {
            throw new IllegalArgumentException("Bug: BlancoMessageFieldStructure#copyTo(target): argument 'target' is null");
        }

        // No needs to copy parent class.

        // Name: fNo
        // Type: java.lang.String
        target.fNo = this.fNo;
        // Name: fName
        // Type: java.lang.String
        target.fName = this.fName;
        // Name: fLevel
        // Type: java.lang.String
        target.fLevel = this.fLevel;
        // Name: fMessage
        // Type: java.lang.String
        target.fMessage = this.fMessage;
    }
}
