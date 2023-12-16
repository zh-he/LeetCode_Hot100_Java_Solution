package Leetcode.lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();//将字符串转为字符数组
        //双指针+哈希set(不包含重复元素）+ 滑动窗口
        Set<Character> set = new HashSet<>();
        int maxLength = 0; //
        int i = 0,j = 0; //双指针
        while (j < s.length()){
            if(!set.contains(arr[j])){
                set.add(arr[j]);//如果不包含，移动右指针
                maxLength = Math.max(maxLength,j - i);
                j++;
            }else {
                set.remove(arr[i]); // 如果包括，去除掉左指针对应元素
                i++;
            }
        }
        return maxLength;
    }
}
