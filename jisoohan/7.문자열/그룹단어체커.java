package com.boj.agrthm.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1316 그룹단어체커
public class GroupChecker {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        int count = 0;
        while(loop --> 0){
            char[] input = br.readLine().toCharArray();

            if(input.length == 1){
                System.out.println(1);
                return;
            }

            if(isGroupWord(input)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isGroupWord(char[] input){
        char prev = input[0];
        boolean[] groupCheker = new boolean[26];
        groupCheker[prev - 'a'] = true;

        for (int i = 1; i < input.length ; i++) {
            char now = input[i];

            if(prev != now){
                if(groupCheker[now - 'a'] == true){
                    groupCheker[now - 'a'] = true;
                    return false;
                }
            }
            prev = now;
        }
        return true;
    }
}
