package com.lcd.algorithm;

/**
 * @author linchengdong
 * @created 2021-03-03 9:25
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        int maxArea = getMaxArea(heights);
        System.out.println(maxArea);
    }

    public static int getMaxArea(int[] heights) {
        // 最大面积
        int maxArea =0;
        // 左指针
        int i =0;
        // 右指针
        int j = heights.length -1;
        while (i < j) {
            // 面积由 Math.min(heights[i], heights[j]) 高度最小值决定
            // Math.min(heights[i], heights[j]) * (j - i) 可以盛的面积大小
            maxArea = Math.max(maxArea, Math.min(heights[i], heights[j]) * (j - i));
            // 右指针高
            if (heights[i] < heights[j]) {
                i++;
            } else {
                // 左指针高
                j--;
            }
        }
        return maxArea;
    }
}
