package com.boj.agrthm.recursion;

import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ring = sc.nextInt();
        System.out.println(move(ring));
        //TODO : 수행절차 로직 누락
    }
    private static int move(int ring) {
        return ring==1? 1 : move(ring-1) + move(ring-1)+1;
    }
}
