# -*- coding: utf-8 -*-

class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        # return len([x for x in nums if x < target])
        return bisect.bisect_left(nums, target)