package P034.SearchforaRange;

public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int start = firstGTE(nums, target);
        if (start == nums.length || nums[start] != target) {
            return new int[] {-1, -1};
        }
        return new int[] {start, firstGTE(nums, target + 1) - 1};
    }

    private static int firstGTE(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + ((hi - lo) >>> 1);
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
