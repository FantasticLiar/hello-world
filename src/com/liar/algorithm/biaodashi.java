package com.liar.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class biaodashi{
    public static void main(String[] args) {
        Stack<Character> symbol=new Stack<>();
        Stack<Double> num = new Stack<Double>();
        Scanner sr = new Scanner(System.in);
        String input = sr.nextLine();
        int start=0;
        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            while(Character.isDigit(c)){
                if (i+1>=input.length()){
                    i+=1;
                    break;
                }
                else
                    i++;
                c = input.charAt(i);
            }
            double d=Double.parseDouble(input.substring(start,i));
            start=i;
            System.out.println(d);
        }
    }
    public static double numb(int start,String input){
        return 0;
    }
    public static double cal(double a1, double a2, char symbol) {
        switch (symbol){
            case '+':
                return a1+a2;
            case '-':
                return a1-a2;
            case '*':
                return a1*a2;
            case '/':
                return a1/a2;
            default:
                return 0;
        }
    }
}