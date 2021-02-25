package com.lcd.algorithm;

/**
 * @author linchengdong
 * @created 2021-02-24 17:50
 */

/**
 * 计算一个数字的立方根，不使用库函数。保留一位小数。
 */
public class CubeRoot {

    public static double getCubeRoot(double input) {
        double min =0;
        double max = input;
        double mid = 0;
        // 采用二分法
        while ((max - min) > 0.001) {
            mid = (max + min) /2;
            if (mid * mid * mid > input) {
                max = mid;
            }else if (mid * mid * mid < input) {
                min = mid;
            } else {
                return mid;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double root = getCubeRoot(216);
        System.out.println(root);
    }
}
