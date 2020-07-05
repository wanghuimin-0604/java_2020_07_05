package com.company;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-05
 * Time:20:15
 * 一万年太久，只争朝夕，加油
 */
//加减法交换两个值不使用额外空间
public class Main3 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2};
        /*arr[0]=arr[0]+arr[1];
        arr[1]=arr[0]-arr[1];
        arr[0]=arr[0]-arr[1];*/
        arr[0]=arr[0]^arr[1];
        arr[1]=arr[0]^arr[1];
        arr[0]=arr[0]^arr[1];
        System.out.println(Arrays.toString(arr));
    }
}
