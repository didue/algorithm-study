package com.boj.agrthm.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CroatiaAlpabet {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] croatiaAlpabet = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int count = 0;

        for(String alpabet : croatiaAlpabet){
            int countOfString = countString(input, alpabet);
            if(countOfString > 0){
                count += countOfString/alpabet.length();
                input = input.replaceAll(alpabet," ");
            }
        }
        count += input.replaceAll(" ", "").length();

        System.out.println(count);
    }

    private static int countString(String input, String target){
        return input.length() - input.replaceAll(target, "").length();
    }
}
