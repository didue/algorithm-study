package com.boj.agrthm.mathmatics;

import java.io.*;
import java.util.*;
public class PrimeFactor{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        List<Integer> factors = new ArrayList<Integer>();

        int idx = 2;
        while(target != 1){
            if(target%idx == 0){
                factors.add(idx);
                target /= idx;
            }else{
                idx++;
            }
        }
        factors.forEach(f -> System.out.print(f + " "));
    }
}