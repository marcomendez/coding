package org.fundacionjala.coding.abner;

import java.util.Arrays;

/**
 * Created by Administrator on 8/31/2017.
 */
public class SortInnerContent {

    /**
     * This function Sort Inner Content.
     *
     * @param cad this string not sort inner content.
     * @return this string is Sort Inner Content.
     */
    public String sortInnerContent(String cad) {
        String[] vector = cad.split(" ");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].length() > 1) {
                String[] betweenString = vector[i].substring(1, vector[i].length() - 1).split("");
                Arrays.sort(betweenString);
                vector[i] = vector[i].substring(0, 1)
                        .concat(new StringBuilder(String.join("", betweenString)).reverse().toString())
                        .concat(vector[i].substring(vector[i].length() - 1, vector[i].length()));
            }
        }
        return String.join(" ", vector);

    }
}
