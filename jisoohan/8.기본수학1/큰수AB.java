package com.boj.agrthm.mathmatics1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

//10757 큰수 덧셈
public class AddBigInteger {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        BigInteger numA = new BigInteger(input[0]);
        BigInteger numB = new BigInteger(input[1]);

        System.out.println(numA.add(numB));
    }
}
