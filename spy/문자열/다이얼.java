package 문자열;

import java.util.Scanner;

public class 다이얼 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        char[] SArr = sc.nextLine().toCharArray();
        for (char c : SArr) {
            System.out.println(c - 64);
            System.out.println(c + "|||" + (((c - 64) / 3) + 2));
            answer += ((c - 64) / 3) + 2;
        }
        System.out.println(answer);
    }
}
