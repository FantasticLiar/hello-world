package com.liar.easy;

import java.util.Scanner;

public class fibonacii {
    public static void main(String[] args) {
        int a1=1;int a2=1;
        Scanner sr=new Scanner(System.in);
        int n= sr.nextInt();
        if (n<=2)
            System.out.println("1");
        else{
            for (int i = 3; i <=n ; i++) {
                int tmp=a2;
                a2=(a1+a2)%10007;
                a1=tmp;
            }
            System.out.println(a2);
        }
    }
}
