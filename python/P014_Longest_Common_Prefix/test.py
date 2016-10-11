# coding=utf-8

import unittest
from P014_Longest_Common_Prefix.LongestCommonPrefix import Solution

class TestCase(unittest.TestCase):

    def test_ok(self):
        strs = ['leet', 'leetcode', 'leed']
        self.assertEqual('lee', Solution.longestCommonPrefix(strs))