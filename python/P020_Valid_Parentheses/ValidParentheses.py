# coding=utf-8

class Solution(object):
    def isValid(self, s):
        pdict = {')': '(', ']': '[', '}': '{'}
        stack = []
        for x in s:
            if x in pdict.values():
                stack.append(x)
            elif x in pdict.keys():
                if len(stack) == 0 or stack.pop() != pdict[x]:
                    return False
            else:
                return False
        return len(stack) == 0
