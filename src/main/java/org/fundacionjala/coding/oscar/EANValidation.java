package org.fundacionjala.coding.oscar;

/**
 * Created by Administrator on 8/29/2017.
 */
public class EANValidation {

    private static final int MULTIPLE_THREE = 3;

    private static final int NUMBER_TEN = 10;

    /**
     * This method validate the number.
     *
     * @param stringNumber is the number in a string.
     * @return true if the checksum is equal at the last digit otherwise return false.
     */
    public boolean validate(String stringNumber) {
        int sum = 0;
        for (int index = 0; index < stringNumber.length() - 1; index++) {
            int number = Integer.parseInt(stringNumber.substring(index, index + 1));
            sum += index % 2 == 0 ? number : number * MULTIPLE_THREE;
        }
        return stringNumber.substring(stringNumber.length() - 1, stringNumber.length()).equals(validateChecksum(sum));
    }

    /**
     * This method verifies the checksum.
     *
     * @param sum is the sum of the numbers following the rule.
     * @return zero if is correct otherwise follow the formula.
     */
    public String validateChecksum(int sum) {
        return sum % NUMBER_TEN == 0 ? "0" : Integer.toString(NUMBER_TEN - (sum % NUMBER_TEN));
    }
}
