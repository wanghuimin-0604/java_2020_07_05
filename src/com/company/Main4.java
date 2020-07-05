package com.company;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-05
 * Time:20:21
 * 一万年太久，只争朝夕，加油
 */
public class Main4 {
    public static void main(String[] args) {
        int n=1;
        getGray(n);
       // System.out.println(Arrays.toString(result));


    }
    public static String[] getGray(int n) {
        String[] result = new String[(int)Math.pow(2,n)];
        if (n == 1) {
            result[0] = "0";
            result[1] = "1";
            return result;
        }
        String[] last = getGray(n - 1);
        Arrays.toString(last);
        for (int i = 0; i < last.length; i++) {
            result[i] = "0" + last[i];
            result[result.length - i - 1] = "1" + last[i];
        }
        return result;
    }
}
