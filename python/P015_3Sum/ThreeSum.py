# coding=utf-8

class Solution:
    @staticmethod
    def threeSum(nums):
        result = []
        if not nums or len(nums) < 3:
            return result

        nums.sort()
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            j, k, target = i+1, len(nums)-1, 0-nums[i]
            while j < k:
                temp = nums[j] + nums[k]
                if temp == target:
                    result.append([nums[i], nums[j], nums[k]])
                    while j < k and nums[j] == nums[j+1]:
                        j += 1
                    while j < k and nums[k] == nums[k-1]:
                        k -= 1
                    j, k = j+1, k-1
                elif temp > target:
                    k -= 1
                else:
                    j += 1
        return result

