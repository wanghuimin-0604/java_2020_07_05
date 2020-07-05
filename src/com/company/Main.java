package com.company;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //先输入一个数字
        //int n=sc.nextInt();
        //将它转换为字符串12
        String str=sc.nextLine();
        //创建一个数组，用来保存每个数字出现的次数的次数
        int[] count=new int[10];
        for(int i=0;i<str.length();i++) {
            count[str.charAt(i) - '0']++;
            //str.charAt(i) - '0':表示的是取到字符串中的某个字符，让它减去'0'这个字符,
            // 其实是他们的ASCII码在进行计算，ASCII的差值就是这个统计数组的下标
        }
        for(int i=0;i<10;i++){
            if(count[i]!=0){
                System.out.println(i+":"+count[i]);
            }
        }
    }
}
