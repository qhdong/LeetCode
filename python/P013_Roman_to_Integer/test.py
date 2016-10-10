import unittest

from P012_Integer_to_Roman.IntegerToRoman import Solution as IntegerToRoman
from P013_Roman_to_Integer.RomanToInteger import Solution as RomanToInteger


class TestCase(unittest.TestCase):

    def test_ok(self):
        for i in range(1, 4000):
            self.assertEqual(i, RomanToInteger.romanToInt(IntegerToRoman.intToRoman(i)))