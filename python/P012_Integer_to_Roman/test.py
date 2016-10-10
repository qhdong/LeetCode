import unittest

from P012_Integer_to_Roman.IntegerToRoman import Solution


class TestCase(unittest.TestCase):
    def test_ok(self):
        self.assertEqual('MMMCMXCIX', Solution.intToRoman(3999))
