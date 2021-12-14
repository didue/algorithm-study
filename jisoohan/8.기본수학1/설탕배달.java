package com.boj.agrthm.mathmatics1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SugarDelivery {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int bundle = 0;

        if (N == 4 || N == 7) {
            bundle = -1;
        } else if (N % 5 == 0) {
            bundle = N/5;
        } else if (N % 5 == 1 || N % 5 == 3) {
            bundle = (N / 5) + 1;
        } else if (N % 5 == 2 || N % 5 == 4) {
            bundle = (N / 5) + 2;
        }
        System.out.println(bundle);
    }
}
