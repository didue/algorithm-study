package 문자열;

import java.util.Scanner;

public class 단어의개수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine().trim();
        if (S.equals("")) {
            System.out.println(0);
        } else {
            String[] SArr = S.split(" ");
            System.out.println(SArr.length);
        }
    }
}
