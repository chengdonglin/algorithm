package com.lcd.algorithm;

import java.util.ArrayList;

/**
 * 从输入任意个整型数，统计其中的负数个数并求所有非负数的平均值，结果保留一位小数，如果没有非负数，则平均值为0
 * @author linchengdong
 * @created 2021-02-24 9:51
 */

public class NagativePositiveCountAvg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-13);
        list.add(-4);
        list.add(-7);
        int negative = 0;
        int positive = 0;
        int sum = 0;
        for (int i =0; i < list.size(); i++) {
            if (list.get(i) <0) {
                negative++;
            }else {
                positive++;
                sum+= list.get(i);
            }
        }
        System.out.println(negative);
        if (positive ==0) {
            System.out.println(0.0);
        } else {
            System.out.println(Math.round(sum *10.0/positive)/10.0);
        }

    }
}
