package com.lcd.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author linchengdong
 * @created 2021-03-09 9:27
 */
// 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = doubleLink(nums);
        System.out.println(list.toString());
    }

    /**
     * 双指针法
     * @param nums
     * @return
     */
    public static List<List<Integer>> doubleLink(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums.length < 3) return list;
        Arrays.sort(nums); // 排序
        for (int i=0;i<nums.length; i++) {
            if (nums[i] > 0) break; // nums[i]大于0,三数之和大于0,结束跳出
            if (i> 0 && nums[i] == nums[i-1]) continue; //去掉重复
            for (int j = i+1,k=nums.length-1;j<k;) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while (j <k && nums[j] == nums[j+1]) j++; //去调左重复
                    while (j <k && nums[k] == nums[k-1]) k--; //去掉右重复
                    j++;
                    k--;
                } else if (sum < 0){
                    j++; // 小于零, 说明需要的值大一些, 往右移动
                } else if (sum >0) k--;
                }
        }
        return list;
    }
}
