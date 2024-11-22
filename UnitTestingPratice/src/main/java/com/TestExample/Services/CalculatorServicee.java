package com.TestExample.Services;

public class CalculatorServicee {
    public static int addTwoNumbers(int a, int b){
        return a+b;
    }

    public static int productTwoNumber(int a, int b){
        return a*b;
    }
    public static double divide(int a, int b){
    return a / b;
    }
    public static int sumAnyNumber(int... numbers){
        int s=0;
        for(int n:numbers){
            s+=n;

        }
        return s;
    }

}
