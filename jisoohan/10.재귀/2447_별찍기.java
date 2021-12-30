package com.boj.agrthm.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountingStars {

    private static StringBuffer sb = new StringBuffer();
    private static String EMPTY = " ";
    private static String STAR = "*";

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int x=0 ; x<n ; x++) {
            for (int y=0; y<n; y++) {
                printStar(x, y, n);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    private static void printStar(int x, int y, int n){
        if((x/n)%3 == 1 && (y/n)%3 == 1){
            sb.append(EMPTY);
        }else{
            if(n/3 == 0){
                sb.append(STAR);
            }else {
                printStar(x, y, n/3);
            }
        }
    }
}
