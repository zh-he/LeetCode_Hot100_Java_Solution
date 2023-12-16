package Leetcode.FourNum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FourNum {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums); //sort之后，整个数组按从小到大排，那么第一个数不变，后面几个数和第一个数之和要满足target的也一定不变
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i < nums.length - 3; i++){   // 4数之和用三数之和的思路做，外层也要去重
            if(i > 0 && nums[i] == nums[i - 1]) continue; // 去重
            for(int j = i + 1; j < nums.length - 2; j++){
                if(j > i + 1 && nums[j] == nums[j -1]) continue; // 去重
                int low = j + 1;
                int high = nums.length - 1;
               while (low < high){
                   int sum = target - nums[i] - nums[j];
                   long sum1 = (long)nums[i] + nums[j] + nums[low] + nums[high];  //使用Long，防止溢出
                   if(sum1 == target){  // 考虑溢出
                       res.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                       low++;
                       high--;
                       while (low < high && nums[low] == nums[low - 1]){
                           low++;
                       }
                       while (low < high && nums[high] == nums[high + 1]){
                           high--;
                       }
                   }else if(nums[i] + nums[j] + nums[low] + nums[high] < target){
                       low++;
                   }else {
                       high--;
                   }

               }
            }
        }
        return res;
    }
}
