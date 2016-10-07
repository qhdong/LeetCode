class Solution(object):
    @staticmethod
    def isMatch(s, p):
        """
        :type s: str
        :type p: str
        :rtype: bool
        """
        dp = [[False] * (len(p)+1) for _ in range(len(s)+1)]
        dp[0][0] = True
        for j in range(1, len(p)):
            if p[j] == '*':
                dp[0][j+1] = dp[0][j-1]

        for i in range(len(s)):
            for j in range(len(p)):
                if p[j] == s[i] or p[j] == '.':
                    dp[i+1][j+1] = dp[i][j]
                elif p[j] == '*':
                    if p[j-1] == s[i] or p[j-1] == '.':
                        dp[i+1][j+1] = dp[i][j+1] or dp[i+1][j-1]
                    else:
                        dp[i+1][j+1] = dp[i+1][j-1]
                else:
                    dp[i+1][j+1] = False

        return dp[len(s)][len(p)]


a = Solution()
print(a.isMatch('aa', 'aab'))