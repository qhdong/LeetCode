# -*- coding: utf-8 -*-
class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        lo, hi = 0, len(nums) - 1
        while lo <= hi:
            mid = (lo + hi) >> 1
            if target == nums[mid]:
                return mid
            if nums[lo] <= nums[mid]:
                if nums[lo] <= target and target < nums[mid]:
                    hi = mid - 1
                else:
                    lo = mid + 1
            else:
                if nums[hi] >= target and target > nums[mid]:
                    lo = mid + 1
                else:
                    hi = mid - 1
        return -1