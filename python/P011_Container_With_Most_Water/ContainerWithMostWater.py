class Solution:
    @staticmethod
    def maxArea(height):
        if height is None or len(height) == 0:
            return 0
        i, j = 0, len(height) - 1
        area = 0
        while i < j:
            h = min(height[i], height[j])
            area = max(area, h * (j - i))
            while height[i] <= h and i < j:
                i += 1
            while height[j] <= h and i < j:
                j -= 1
        return area