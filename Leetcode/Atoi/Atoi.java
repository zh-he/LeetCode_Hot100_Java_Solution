package Leetcode.Atoi;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi(" "));
    }
    public static int myAtoi(String s) {
        if(s == null || s.length() == 0){  //考虑字符串为空的情况
            return  0;
        }
        char[] arr = s.toCharArray();
        int index = 0, num = 0, sign = 1; //index是索引，num是总的结果，sign是符号位
        int len = s.length();
        while ( index < len &&  arr[index] == ' ') { // 去除前导空格 ,需要先判断 index  < len 才能判断arr[index],防止数组越界
            index++;
        }
        if (index == len) {
            return num;
        }
        if (arr[index] == '-') {  //符号位只有一个，不能跟两个if,即只判断一次符号位
            sign = -1;
            index++;
        }else if (arr[index] == '+') {
            index++;
        }  //前导空格和符号位处理完毕
        while (index < len) {
            if (arr[index] < '0' || arr[index] > '9') {  //数字结束则跳出循环
                break;
            }
            if(num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && (arr[index] -'0')> Integer.MAX_VALUE % 10 )){
                num = Integer.MAX_VALUE;  // 最大值和最小值截断 ,arr[index]是字符，记得减0
                break;
            }
            if(num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && (arr[index] - '0') > 8)){
                num = Integer.MIN_VALUE;
                break;
            }
            num = num * 10 + sign * (arr[index] - '0' );
            index++;
        }
        return num;
    }
}
