package com.boj.agrthm.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAlpabet {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] loc = new int[26];
        Arrays.fill(loc, -1);

        for(int i=0 ; i<input.length() ; i++){
           int idx = input.charAt(i) - 97;

           if(loc[idx] != -1)   continue;       //한번 위치를 세면 그 다음은 세지 않는다

           loc[idx] = i;
        }

        for(int l : loc){                       //ascii code로 a(97)~z(122)이므로 배열의 index를 이용
            System.out.printf("%d ", l);
        }
    }
}
