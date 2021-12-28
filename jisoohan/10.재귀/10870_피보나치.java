package com.boj.agrthm.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        System.out.println(fibonacci(0,1, loop));
    }
    private static int fibonacci(int a, int b, int loop){
        if(loop<2)  return a+b>2? b : loop;
        return fibonacci(b, a+b, --loop);
    }
}
