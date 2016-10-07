package P010.RegularExpressionMatching;

import org.junit.Test;

import static P010.RegularExpressionMatching.RegularExpressionMatching.*;
import static org.junit.Assert.*;

public class RegularExpressionMatchingTest {
    @Test
    public void isMatchTest() throws Exception {
        assertFalse(isMatch("aa", "a"));
        assertTrue(isMatch("aa", "aa"));
        assertFalse(isMatch("aaa", "aa"));
        assertTrue(isMatch("aa", "a*"));
        assertTrue(isMatch("aa", ".*"));
        assertTrue(isMatch("ab", ".*"));
        assertTrue(isMatch("aab", "c*a*b"));
        assertTrue(isMatch("aab", "c*a*."));
    }

}