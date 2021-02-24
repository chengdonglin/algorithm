package com.lcd.algorithm;

import java.util.Stack;

/**
 * 字符串逆序
 * @author linchengdong
 * @created 2021-02-24 9:26
 */
public class StringReverse {

    /**
     * 根据StringBuffer
     * @param str
     * @return
     */
    public static String getStringReverseByStringBuffer(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }

    /**
     * 根据栈数据结构来实现
     * @param str
     * @return
     */
    public static String getStringReverseByStack(String str) {
        String newStr = "";
        Stack<Character> stringStack = new Stack<Character>();
        for (char c: str.toCharArray()) {
            stringStack.push(c);
        }
        while (stringStack.size() != 0) {
            newStr = newStr + stringStack.pop();
        }
        return newStr;
    }

    /**
     * 根据栈数据结构来实现
     * @param str
     * @return
     */
    public static String getStringReverseByStringBuilder(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i =str.length()-1; i>=0;i--){
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        String string = "I am a student";
        String str = getStringReverseByStringBuffer(string);
        String str2 = getStringReverseByStack(string);
        String str3 = getStringReverseByStringBuilder(string);
        System.out.println(str3);
    }
}
