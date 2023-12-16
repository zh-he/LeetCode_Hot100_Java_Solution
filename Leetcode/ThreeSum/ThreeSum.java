package Leetcode.ThreeSum;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);//Arrays.sort(nums)会使得数组升序排序
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // 跳过重复元素
                int low = i + 1, high = nums.length - 1, sum = 0 - nums[i]; // 使用双指针，两重循环，减少了一重循环
                while (low < high) { //利用双指针，一个while减少了一重循环。
                    if (nums[low] + nums[high] == sum) {
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        //Arrays.asList()接收一个数组作为参数，并将其转换为一个固定大小的列表。
                        while (low < high && nums[low] == nums[low + 1]) low++; // 跳过重复元素
                        while (low < high && nums[high] == nums[high - 1]) high--; // 跳过重复元素
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < sum) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }


        }
        return res;
    }

}

