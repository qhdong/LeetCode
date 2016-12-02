# -*- coding: utf-8 -*-

class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        def first_gte(nums, target):
            lo, hi = 0, len(nums)
            while lo < hi:
                mid = (lo + hi) / 2
                if nums[mid] < target:
                    lo = mid + 1
                else:
                    hi = mid
            return lo

        start = first_gte(nums, target)
        if start == len(nums) or nums[start] != target:
            return [-1, -1]
        else:
            return [start, first_gte(nums, target + 1) - 1]