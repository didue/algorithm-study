package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 그룹단어체커 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < len; i++) {
            char[] SArr = br.readLine().toCharArray();
            char before = SArr[0];
            boolean groupWord = true;
            List<Character> checkList = new ArrayList<>();
            for (int j = 1; j < SArr.length; j++) {
                if (before != SArr[j]) {
                    if (checkList.contains(SArr[j])) {
                        groupWord = false;
                        break;
                    } else {
                        checkList.add(before);
                        before = SArr[j];
                    }
                }
            }
            if (groupWord) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
