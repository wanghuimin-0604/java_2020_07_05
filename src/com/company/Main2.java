package com.company;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-05
 * Time:18:52
 * 一万年太久，只争朝夕，加油
 */
public class Main2 {
    public static void main(String[] args) {
        int[] A=new int[]{1,2,3,5,6};
        multiply(A);
    }

    public static void multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if (length != 0) {
            B[0] = 1;
            //计算下三角连乘
            for (int i = 1; i < length; i++) {
                B[i] = B[i - 1] * A[i - 1];
            }
            int temp = 1;
            //计算上三角
            for (int j = length - 2; j >= 0; j--) {
                temp *= A[j + 1];
                B[j] *= temp;
            }
        }
        System.out.println(Arrays.toString(B));
    }
}