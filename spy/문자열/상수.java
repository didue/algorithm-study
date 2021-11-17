package 문자열;

import java.util.Scanner;

public class 상수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] SArr = sc.nextLine().split(" ");
        StringBuilder builder = new StringBuilder(SArr[0]);
        int s = Integer.parseInt(builder.reverse().toString());
        builder = new StringBuilder(SArr[1]);
        int t = Integer.parseInt(builder.reverse().toString());
        System.out.println(Math.max(s, t));
    }
}
