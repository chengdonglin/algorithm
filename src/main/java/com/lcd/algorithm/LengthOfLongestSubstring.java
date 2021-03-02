package com.lcd.algorithm;

/**
 * 最长字串
 * @author linchengdong
 * @created 2021-03-02 14:21
 */

import java.util.HashSet;

/**
 Input: s = "abcabcbb"
 Output: 3
 Explanation: The answer is "abc", with the length of 3.
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String str = "abcefhiabc";
        int length = str.length();
        HashSet<Character> set = new HashSet<>();
        int ans =0, i =0, j =0;
        while (i < length && j <length) {
            // range [i,j]
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j++));
                ans = Math.max(ans,j-i);
            } else {
                set.remove(str.charAt(i++));
            }
        }
        System.out.println(ans);
    }
}
