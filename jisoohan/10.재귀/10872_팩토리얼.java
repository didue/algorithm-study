package com.boj.agrthm.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int result = factorial(sc.nextInt());
        System.out.println(result);
    }

    private static int factorial(int number){
        return (number < 2)? 1 : number * factorial(number-1);
    }
}
