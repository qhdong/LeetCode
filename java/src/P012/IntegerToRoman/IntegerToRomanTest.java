package P012.IntegerToRoman;

import org.junit.Test;

import static P012.IntegerToRoman.IntegerToRoman.intToRoman;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void intToRomanTest() throws Exception {
        assertEquals("MMMCMXCIX", intToRoman(3999));
    }

}