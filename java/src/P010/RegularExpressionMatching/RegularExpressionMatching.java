package P010.RegularExpressionMatching;

/*
Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true
 */

import java.util.Arrays;

public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }

        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;

        for (int j = 1; j < p.length(); j++) {
            if (p.charAt(j) == '*') {
                dp[0][j+1] = dp[0][j-1];
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                // 完全匹配，或者匹配字符为 .
                if (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.') {
                    dp[i+1][j+1] = dp[i][j];
                } else if (p.charAt(j) == '*') {
                    // *之前的字符跟s现在的字符一样，或者是.，例如a*或者.*
                    if (p.charAt(j-1) == s.charAt(i) || p.charAt(j-1) == '.') {
                        dp[i+1][j+1] = dp[i+1][j-1] || dp[i][j+1];
                    // b*，这种情况下，*相当于0，所以要使用之前的状态
                    } else {
                        dp[i+1][j+1] = dp[i+1][j-1];
                    }
                } else {
                    dp[i+1][j+1] = false;
                }
            }

        }

        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        isMatch("aab", "c*a*.");
    }
}
