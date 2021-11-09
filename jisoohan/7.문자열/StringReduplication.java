package com.boj.agrthm.Strings;

import java.util.Scanner;

public class StringReduplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int loopSize = Integer.parseInt(sc.nextLine());

            for(int i=0 ; i<loopSize ; i++) {

                StringBuffer sb = new StringBuffer();
                String inputLine = sc.nextLine();

                String[] inputs = inputLine.split(" ");

                int repeatSize = Integer.parseInt(inputs[0]);

                for (int j = 0; j < inputs[1].length(); j++) {
                    String word = String.valueOf(inputs[1].charAt(j));
                    sb.append(word.repeat(repeatSize));
                }
                System.out.println(sb.toString());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}