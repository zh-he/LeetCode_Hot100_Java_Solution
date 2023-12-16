package Leetcode.TwoSum;

public class Twosums {
    public int[] twoSum(int[] nums, int target) {
        int[] targetNum = new int[2]; // 定义一个数组用来返回
        for(int i = 0; i < nums.length; i++){  // for循环遍历，外层用于找第一个数
            for(int j = i + 1; j <= nums.length - 1; j++){ // 内层用于找第二个数
                if(nums[i] + nums[j] == target){
                    targetNum[0] = i;
                    targetNum[1] = j;
                    break;
                }
            }
        }
        return targetNum;
    }
}
