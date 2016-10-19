package P018.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, 0, 4, target);
    }

    public static List<List<Integer>> kSum(int[] nums, int start, int k, int target) {
        if (k == 2) return twoSum(nums, start, target);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = start; i < nums.length - k + 1; i++) {
            List<List<Integer>> tmp = kSum(nums, i+1, k-1, target-nums[i]);
            for (List<Integer> list : tmp) {
                list.add(0, nums[i]);
            }
            result.addAll(tmp);
            int t = nums[i];
            while (i < nums.length-k+1 && nums[i] == t) {
                i++;
            }
            i--;
        }
        return result;
    }

    public static List<List<Integer>> twoSum(int[] nums, int start, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(nums[i]);
                tmp.add(nums[j]);
                result.add(tmp);
                int t = nums[i];
                while (i < j && nums[i] == t) {
                    i++;
                }
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
