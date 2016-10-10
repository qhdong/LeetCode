package P013.RomanToInteger;

import org.junit.Test;

import static org.junit.Assert.*;
import static P012.IntegerToRoman.IntegerToRoman.intToRoman;
import static P013.RomanToInteger.RomanToInteger.romanToInt;

public class RomanToIntegerTest {
    @Test
    public void romanToIntTest() throws Exception {
        for (int i = 1; i <= 3999; i++) {
            assertEquals(i, romanToInt(intToRoman(i)));
        }
    }

}