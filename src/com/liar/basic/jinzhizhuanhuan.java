package com.liar.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 进制数读入、转换等
 */
public class jinzhizhuanhuan {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String n =sr.nextLine();
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(n); i++) {
            Integer tmp=new Integer(Integer.parseInt(sr.nextLine(),16));
            res.add(Integer.toOctalString(tmp));
        }
        for (int i=0;i<res.size();i++) {
            System.out.println(res.get(i));
        }
    }
}
