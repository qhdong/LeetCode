# coding=utf-8

import unittest
from P016_3Sum_Closest.ThreeSumClosest import Solution

class TestCase(unittest.TestCase):
    def test_ok(self):
        nums = [-1, 2, 1, -4]
        target = 1
        self.assertEqual(2, Solution.threeSumClosest(nums, target))