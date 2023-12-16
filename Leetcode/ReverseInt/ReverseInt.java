package Leetcode.ReverseInt;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    public static int reverse(int x) {
        int res = 0;
         // 正负数不用分开
            int remainder = 0;
            while(x != 0){
                remainder = x % 10;
                x = x / 10;
                if(res > Integer.MAX_VALUE / 10 || res  == Integer.MAX_VALUE / 10 && remainder > 7){
                    return 0;
                }
                if(res < Integer.MIN_VALUE / 10 || res == Integer.MIN_VALUE/10 && remainder < -8){
                    return 0;
                } // 这里需要知道java中Integer.MIN_VALUE（-2147483648）-2^31 ,Integer.MAX_VALUE = 2^31-1=2147483647,2^31-1;
                res = res * 10 + remainder; // 需要检查溢出，
            }



        return res;
    }
}
