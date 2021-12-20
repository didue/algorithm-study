package com.boj.agrthm.mathmatics;
import java.io.*;
import java.util.Scanner;

public class FindPrimes {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        boolean[] prime = new boolean[to+1];

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
        
        for(int k=from ; k<prime.length ; k++){
            if(!prime[k]){
                System.out.println(k);
            }
        }
    }
}
