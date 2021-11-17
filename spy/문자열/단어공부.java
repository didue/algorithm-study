package 문자열;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 단어공부 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        char[] SArr = S.toLowerCase().toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : SArr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char answer = '?';
        int cnt = 0;
        boolean sameCnt = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (value > cnt) {
                answer = key;
                cnt = value;
                sameCnt = false;
            } else if (value == cnt) {
                sameCnt = true;
            }
        }

        if (sameCnt) {
            System.out.println('?');
        } else {
            System.out.println(String.valueOf(answer).toUpperCase());
        }

    }
}
