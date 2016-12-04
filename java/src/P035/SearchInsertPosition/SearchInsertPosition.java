package P035.SearchInsertPosition;

/**
 * Created by aaron on 16-12-4.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >>> 1);
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }
}
