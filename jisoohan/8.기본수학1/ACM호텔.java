package com.boj.agrthm.mathmatics1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//10250 ACM 호텔
public class HotelACM {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        while(testcase --> 0) {
            String[] input = br.readLine().split(" ");
            int h = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[2]);

            int yy = 0;
            int xx = 0;

            if(n%h == 0) {
                yy = h;
                xx = n/h;
            }else {
                yy = n % h;
                xx = n/h + 1;
            }

            System.out.println(yy*100 + xx);
        }
    }
}