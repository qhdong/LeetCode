# coding=utf-8


class Solution(object):
    @staticmethod
    def intToRoman(num):
        """
        Given an integer, convert it to a roman numeral.

        Input is guaranteed to be within the range from 1 to 3999.
        """
        if num < 1 or num > 3999:
            return ''
        roman = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        values = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        result = ''
        i = 0
        while num > 0:
            while num >= values[i]:
                num -= values[i]
                result += roman[i]
            i += 1
        return result
