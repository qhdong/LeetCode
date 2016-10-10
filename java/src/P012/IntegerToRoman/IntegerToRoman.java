package P012.IntegerToRoman;

/**
 * Given an integer, convert it to a roman numeral.

 Input is guaranteed to be within the range from 1 to 3999.

 */

public class IntegerToRoman {
    public static String intToRoman(int num) {
        if (num < 1 || num > 3999) return "";

        StringBuilder result = new StringBuilder();
        String[] roman = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int i = 0;
        while (num > 0) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(roman[i]);
            }
            i++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3999));
    }
}
