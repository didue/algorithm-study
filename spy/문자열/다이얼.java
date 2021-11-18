package 문자열;

import java.util.Scanner;

public class 다이얼 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int[] secondArr = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        char[] SArr = sc.nextLine().toCharArray();
        for (char c : SArr) {
            answer += secondArr[c - 65];
        }
        System.out.println(answer);
    }
}
