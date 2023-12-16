package Leetcode.TwoDivide;

public class TwoDivide {

    public  int divide(int dividend, int divisor) {
        //只有一种可能会溢出即dividend = Integer.MIN_VAULE,divisor = - 1;
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int res = 0;
        boolean flag = (dividend > 0) ^ (divisor >0); //用来判断最终结果，异或，不同为真，相同为假；
        // 这里将除数和被除数全部转为负数，防止溢出
        dividend = dividend > 0 ? -dividend:dividend;
        divisor = divisor > 0 ? -divisor : divisor;

        while(dividend <= divisor){         //负数相比较 ，负的更多，即更小，直接做加法会超时，
            int count = 1;                  //我们这里可以考虑使用【倍增乘法】来实现，所谓倍增乘法，简单理解就是每次用被除数减去[除数的最大的2x2^x2x]，这样可以极大地增加处理的速度。
            int temp = divisor;             //注意这里的int temp = divisor; 每一次temp都应该从divisor开始，dividend减去2的最大i次方的divisor；
            while(temp >= dividend - temp){ //这里不能用 2*divisor >= dividend,为了防止溢出
                temp += temp;
                count += count;             //count代表的是2的i次
            }
            dividend -= temp;
            res += count;
        }
        return flag ? -res : res;
    }

}
