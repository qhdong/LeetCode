# coding=utf-8

from functools import reduce

class Solution(object):
    @classmethod
    def longestCommonPrefix(self, strs):
        if not strs:
            return ''
        for i, letter_pair in enumerate(zip(*strs)):
            if len(set(letter_pair)) > 1:
                return strs[0][:i]
        else:
            return min(strs)