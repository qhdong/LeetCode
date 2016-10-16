# coding=utf-8

import unittest
from P017_Letter_Combinations_of_a_Phone_Number.LetterCombinationsofaPhoneNumber import Solution

class TestCase(unittest.TestCase):
    def test_ok(self):
        digits = '23'
        output = ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
        self.assertListEqual(Solution.letterCombinations(digits), output)