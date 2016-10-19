# coding=utf-8

class Solution(object):
    def fourSum(self, nums, target):
        nums.sort()
        def ksum(nums, k, target):
            i = 0
            if k == 2:
                j = len(nums) - 1
                while i < j:
                    tmp = nums[i] + nums[j]
                    if tmp == target:
                        yield (nums[i], nums[j])
                        i += 1
                    elif tmp > target:
                        j -= 1
                    else:
                        i += 1
            else:
                while i < len(nums)-k+1:
                    new_target = target - nums[i]
                    for sub in ksum(nums[i+1:], k-1, new_target):
                        yield (nums[i],) + sub
                    i += 1
        return [list(t) for t in set(ksum(nums, 4, target))]