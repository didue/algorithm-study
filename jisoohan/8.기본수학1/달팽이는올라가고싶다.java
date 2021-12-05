package com.boj.agrthm.mathmatics1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SnailWantToClimb {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);
        int day = (v-b)/(a-b);
        day = ((v-b)%(a-b) != 0)? day+1 : day;
        System.out.println(day);
    }
}