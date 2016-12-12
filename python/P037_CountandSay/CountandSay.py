# -*- coding: utf-8 -*-
from itertools import groupby
class Solution(object):
    @staticmethod
    def countAndSay(n):
        say = '1'
        for _ in range(n-1):
            next = ''
            for item in [list(g) for k, g in groupby(say)]:
                next += str(len(item)) + str(item[0])
            say = next
        return say


if __name__ == '__main__':
    for i in range(1, 10):
        print(Solution.countAndSay(i))