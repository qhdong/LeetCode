# coding=utf-8


class Solution(object):
    @staticmethod
    def romanToInt(s):
        """
        Given a roman numeral, convert it to an integer.

        Input is guaranteed to be within the range from 1 to 3999.
        """
        if s is None or len(s) == 0:
            return 0

        roman = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000,
        }

        s = list(map(lambda x: roman[x], s))
        pairs = list(zip(s[:-1], s[1:]))
        num = 0
        for curr, right in pairs:
            if curr >= right:
                num += curr
            else:
                num -= curr

        return num + s[-1]


if __name__ == '__main__':
    print(Solution.romanToInt('MMMCMXCIX'))