package com.boj.agrthm.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//2231 분해합
public class DivisionSum {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int constructor = getConstructor(number);
        System.out.println(constructor);
    }

    private static int getConstructor(int target) {
        int offset = String.valueOf(target).length();
        for(int i=target-(offset*9) ; i<target ; i++){
            int tmp = i, sum = i;
            for(int j=String.valueOf(i).length() ; j>0 ; j--){
                int m = tmp%10;
                sum += m;
                tmp/=10;
            }
            if(sum == target)   return i;
        }
        return 0;
    }
}
