package com.liar.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组排序
 */
public class Sort {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n=sr.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sr.nextInt();
        }
        Arrays.sort(arr);
        for (int i:arr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
