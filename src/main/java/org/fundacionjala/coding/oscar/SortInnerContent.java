package org.fundacionjala.coding.oscar;

import java.util.Arrays;


/**
 * Created by Oz64 on 30/08/2017.
 */

public class SortInnerContent {

    private static final int LIMIT = 3;
    private static final String DELIMITER = " ";

    /**
     * This method order the inner content of the words of the string descendent.
     *
     * @param content is the string with several words.
     * @return change the content of the string words.
     */
    public String sortInnerContent(String content) {
        String[] arrayString = content.split(DELIMITER);
        for (int index = 0; index < arrayString.length; index++) {
            arrayString[index] = arrayString[index].length() > LIMIT ? sort(arrayString[index]) : arrayString[index];
        }
        return String.join(DELIMITER, arrayString);
    }

    /**
     * This method change the content of one word.
     *
     * @param word is the word for change the content.
     * @return the word with sort descending.
     */
    public String sort(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters, 1, letters.length - 1);
        StringBuilder sb = new StringBuilder(String.valueOf(letters, 1, letters.length - 2))
                .reverse();
        return String.format("%c%s%c", letters[0], sb.toString(), letters[letters.length - 1]);
    }
}
