# coding=utf-8

from functools import reduce

class Solution(object):
    @staticmethod
    def letterCombinations(digits):
        if not digits or len(digits) == 0:
            return []
        phone = {'0': '',
               '1': '',
               '2': 'abc',
               '3': 'def',
               '4': 'ghi',
               '5': 'jkl',
               '6': 'mno',
               '7': 'pqrs',
               '8': 'tuv',
               '9': 'wxyz'}
        return reduce(lambda acc, digit: [x + y for x in acc for y in phone[digit]], digits, [''])

