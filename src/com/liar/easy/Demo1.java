package com.liar.easy;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        double pi=Math.atan(1.0)*4;
        Scanner sr=new Scanner(System.in);
        double r=sr.nextInt();
        String result = String.format("%.2f", pi*r*r);
        System.out.println(result);
    }
}
