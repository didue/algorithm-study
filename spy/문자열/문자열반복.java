package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열반복 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String repeat = br.readLine();

        for (int i = 0; i < Integer.parseInt(repeat); i++) {
            String line = br.readLine();
            String[] lineArr = line.split(" ");
            int cnt = Integer.parseInt(lineArr[0]);
            String str = lineArr[1];

            char[] charArr = str.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();

            for (char c : charArr) {
                stringBuilder.append(String.valueOf(c).repeat(Math.max(0, cnt)));
            }
            System.out.println(stringBuilder);
        }
    }
}
