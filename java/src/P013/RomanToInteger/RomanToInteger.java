package P013.RomanToInteger;

/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
 */

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> roman = new HashMap<Character, Integer>() {{
           put('I', 1);
           put('V', 5);
           put('X', 10);
           put('L', 50);
           put('C', 100);
           put('D', 500);
           put('M', 1000);
        }};


        int num = roman.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >= 0; i--) {
            int curr = roman.get(s.charAt(i));
            int right = roman.get(s.charAt(i+1));
            if (curr < right) num -= curr;
            else num += curr;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MMMCMXCIX"));
    }
}
