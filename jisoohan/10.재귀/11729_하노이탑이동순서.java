package com.boj.agrthm.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HanoiTower {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ring = Integer.parseInt(br.readLine());

        int cnt = (int)Math.pow(2, ring) - 1;
        System.out.println(cnt);

        hanoi(ring, 1, 2, 3);
    }

    private static void hanoi(int n, int from, int by, int to){
        if(n == 1) {
            printStep(from, to);
        }else{
            //1. n-1개 A->B
            hanoi(n-1, from, to, by);
            //2. 마지막 한개 A->C
            printStep(1, 3);
            //3. n-1개 B->C
            hanoi(n-1, by, from, to);
        }
    }

    private static void printStep(int from, int to) {
        System.out.printf("%d %d\n", from, to);
    }
}
