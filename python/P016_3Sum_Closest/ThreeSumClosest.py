# coding=utf-8
from itertools import combinations

class Solution:
    @staticmethod
    def threeSumClosest(nums, target):
        return min([(abs(target - sum(x)), sum(x)) for x in combinations(nums, 3)], key=lambda x: x[0])[1]

if __name__ == '__main__':
    nums = [-1, 2, 1, -4]
    target = 1
    print(Solution.threeSumClosest(nums, target))