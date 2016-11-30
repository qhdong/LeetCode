# -*- coding: utf-8 -*-
class Solution(object):
    def longestValidParentheses(self, s):
        """
        :type s: str
        :rtype: int
        """
        stack = [-1]
        ret = 0
        for i in range(len(s)):
            if s[i] == ')' and len(stack) > 1 and s[stack[-1]] == '(':
                stack.pop()
                ret = max(ret, i-stack[-1])
            else:
                stack.append(i)
        return ret