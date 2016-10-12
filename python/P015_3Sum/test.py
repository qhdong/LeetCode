import unittest
from P015_3Sum.ThreeSum import Solution


class TestCase(unittest.TestCase):
    def test_ok(self):
        nums = [-1, 0, 1, 2, -1, -4]
        target = [[-1, -1, 2], [-1, 0, 1]]
        result = Solution.threeSum(nums)
        self.assertListEqual(target, result)
