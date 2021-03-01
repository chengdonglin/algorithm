package com.lcd.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 *  两数之和
 *  Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * @author linchengdong
 * @created 2021-03-01 9:00
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
//        int[] ints = twoSum(nums, target);
//        System.out.println(ints[0]+" " + ints[1]);
        int[] sumByHash = twoSumByHash(nums, target);
        System.out.println(sumByHash[0]+" " + sumByHash[1]);
    }

    /**
     * 暴力法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums,int target) {
        for (int i =0;i<nums.length;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("无法找到");
    }


    public static  int[] twoSumByHash(int[] nums,int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("无法找到");
    }
}
