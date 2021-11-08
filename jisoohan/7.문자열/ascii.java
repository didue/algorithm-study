package com.boj.agrthm.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ascii {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        System.out.println(input.hashCode());
    }
}
