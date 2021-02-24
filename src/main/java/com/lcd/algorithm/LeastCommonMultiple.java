package com.lcd.algorithm;

/**
 * @author linchengdong  最小公倍数
 * @created 2021-02-24 9:17
 */

/**
 * 题目描述: 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 * 题解: 两数最小公倍数等于两数乘积除以两数的最大公约数
 */
public class LeastCommonMultiple {

    /**
     * 求最大公约数
     * @param m
     * @param n
     * @return
     */
    public static int getYinshu(int m, int n) {
        int i = m;
        while ((m%i != 0) || (n%i) != 0) {
            i--;
        }
        return i;
    }

    public static int getLeastCommonMultiple(int m, int n) {
        int multiValue = m * n;
        int leastCommonMultiple = multiValue / getYinshu(m,n);
        return leastCommonMultiple;
    }

    public static void main(String[] args) {
        int leastCommonMultiple = getLeastCommonMultiple(5, 7);
        System.out.println(leastCommonMultiple);
    }
}
