/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.message;

import java.util.List;

/**
 * blancoMessageのメッセージを分割するためのユーティリティです。
 * 
 * @author ToshikiIga
 */
class BlancoMessageSplitUtil {
    /**
     * メッセージを置換文字列を元に分割します。
     * 
     * @param listSourceString
     *            入力となる文字列。処理の過程で内容が変わります。処理後には分割されています。
     * @return 何番まで置換文字列が存在したか。ひとつも無かった場合には -1が戻ります。
     */
    @SuppressWarnings("unchecked")
    public int split(final List listSourceString) {
        for (int number = 0;; number++) {
            final boolean isFound = splitByReplaceString(listSourceString,
                    number);
            if (isFound == false) {
                // 現在の処理番号-1を戻します。
                // １件も置換文字列が発見されていない場合には -1を戻します。
                return number - 1;
            }
        }
    }

    /**
     * 指定番号による置換文字列をもとに文字列を分割します。
     * 
     * 引数listSourceStringの入力文字列を、{0}, {1}という指定番号による置換文字列
     * が見つかった位置で分割し、listSourceStringに戻します。
     * 置換文字列はInteger型の数値としてlistSourceStringに格納されます。
     * 
     * 例えば、入力としてlistSourceString.index(0)に「置換文字列が{0}が存在します」 という文字列が格納されていた場合、<br>
     * listSourceString.index(0) = "置換文字列が"<br>
     * listSourceString.index(1) = new Integer(0)<br>
     * listSourceString.index(2) = "が存在します"<br>
     * のように分割されます。
     * 
     * @param listSourceString
     *            入力となる文字列。
     * @param replaceNumber
     *            置換文字列の番号。0オリジンで指定します。
     * @return 置換が発生したかどうかのフラグ。置換された場合にはtrueが、一度も置換されなかった場合には falseが戻ります。
     */
    @SuppressWarnings("unchecked")
    private boolean splitByReplaceString(final List listSourceString,
            final int replaceNumber) {
        boolean isFound = false;
        for (int index = 0; index < listSourceString.size(); index++) {
            final Object objLook = listSourceString.get(index);
            if (objLook instanceof Integer) {
                continue;
            }

            final String input = (String) listSourceString.get(index);

            // 置換の際に利用する文字列。
            final String replaceNumberString = "{" + replaceNumber + "}";

            final int search = input.indexOf(replaceNumberString);
            if (search >= 0) {
                listSourceString.remove(index);
                listSourceString.add(index, input.substring(0, search));
                listSourceString.add(index + 1, new Integer(replaceNumber));
                listSourceString.add(index + 2, input.substring(search
                        + replaceNumberString.length()));
                isFound = true;
            }
        }

        // 不要な長さ0の文字列をリストから除去します。
        removeUnnecessaryString(listSourceString);

        return isFound;
    }

    /**
     * 改行をもとに文字列を分割します。
     * 
     * 引数listSourceStringの入力文字列を改行(\n)が見つかった位置で分割し listSourceStringに戻します。
     * 
     * 例えば、入力としてlistSourceString.index(0)に「改行が\n存在します」 という文字列が格納されていた場合、<br>
     * listSourceString.index(0) = "改行が"<br>
     * listSourceString.index(1) = "\n"<br>
     * listSourceString.index(2) = "存在します"<br>
     * のように分割されます。
     * 
     * @param listSourceString
     *            入力となる文字列。
     */
    @SuppressWarnings("unchecked")
    public void splitByNewLineChar(final List listSourceString) {
        for (int index = 0; index < listSourceString.size(); index++) {
            final Object objLook = listSourceString.get(index);
            if (objLook instanceof Integer) {
                continue;
            }

            final String input = (String) listSourceString.get(index);

            // 置換の際に利用する文字列。
            final String newLine = "\n";

            if (newLine.equals(input)) {
                continue;
            }

            final int search = input.indexOf(newLine);
            if (search >= 0) {
                listSourceString.remove(index);
                listSourceString.add(index, input.substring(0, search));
                listSourceString.add(index + 1, newLine);
                listSourceString.add(index + 2, input.substring(search
                        + newLine.length()));
            }
        }

        // 不要な長さ0の文字列をリストから除去します。
        removeUnnecessaryString(listSourceString);
    }

    /**
     * 不要な長さ0の文字列をリストから除去します。
     * 
     * @param listSourceString
     */
    @SuppressWarnings("unchecked")
    private void removeUnnecessaryString(final List listSourceString) {
        for (int index = listSourceString.size() - 1; index >= 0; index--) {
            final Object objLook = listSourceString.get(index);
            if (objLook instanceof Integer) {
                continue;
            }

            final String input = (String) listSourceString.get(index);
            if (input.length() == 0) {
                listSourceString.remove(index);
            }
        }
    }
}
