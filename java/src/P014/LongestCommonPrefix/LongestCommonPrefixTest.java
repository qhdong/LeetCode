package P014.LongestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.*;
import static P014.LongestCommonPrefix.LongestCommonPrefix.longestCommonPrefix;
public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefixTest() throws Exception {
        String[] strs = new String[] {
                "leetcode",
                "leetc",
                "leeds"
        };

        assertEquals("lee", longestCommonPrefix(strs));
    }

}