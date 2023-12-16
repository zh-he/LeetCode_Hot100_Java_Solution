package Leetcode.NextPermutation;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {

        nextPermutation(new int[]{1,2,3});
    }
    public static void nextPermutation(int[] nums) {
        // 从后向前遍历，一旦出现一个数大于前面的数，说明存在更大的数，记录该索引i
        // 下一个更大的数是，后面的数按从小到大排，将后面的数中第一个比i-1 大的数据与之交换
        if(nums.length == 0){
            return;
        }
        int len = nums.length;
        for(int i = len - 1; i >= 0; i--){
            if(i == 0){
                Arrays.sort(nums);  //如果数组里前面的数都大于后面的数说明整个数组的排序为最大
                return ;   //返回最小值；
            }else if(nums[i] > nums[i - 1]){ //说明存在更大的数，需要找的就是下一个数
                Arrays.sort(nums,i,len);  // i和之后的数都是最大排列，找比这个数排序大1的数的方法是
                for(int j = i ; j < len ; j++ ){  // 将i到len - 1的数按从小到大排，找到第一个大于i- 1 的数，与之交换
                    if(nums[j] > nums[i -1]){
                        int temp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }

                }
            }

        }
    }
}
////Arrays.sort(T[] a, int fromIndex, int toIndex); a表示对应数组，第一个参数表示起始索引，第二个参数表示最终索引，不包括是个开区间。
//T[] a: 这是要排序的数组。它可以是任何类型的数组，如 int[]、double[]、String[] 等。
//
//        int fromIndex: 这是要排序的子数组的起始索引（包含）。即排序将从这个索引开始。
//
//        int toIndex: 这是要排序的子数组的终止索引（不包含）。排序将在此索引之前的元素结束。
