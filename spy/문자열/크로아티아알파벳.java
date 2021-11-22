package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
//        String S = "dz=";

        char[] SArr = S.toCharArray();
        int cnt = 0;
        for (int i = 1; i < SArr.length; i++) {
            char target = SArr[i];
            if (target == '=') {
                if (i > 1 && SArr[i - 1] == 'z' && SArr[i - 2] == 'd') {
                    cnt += 2;
                    continue;
                }
                if (SArr[i - 1] == 'c' || SArr[i - 1] == 's' || SArr[i - 1] == 'z') {
                    cnt += 1;
                }
                continue;
            }
            if (target == '-') {
                if (SArr[i - 1] == 'd' || SArr[i - 1] == 'c') {
                    cnt += 1;
                }
                continue;
            }
            if (target == 'j') {
                if (SArr[i - 1] == 'l' || SArr[i - 1] == 'n') {
                    cnt += 1;
                }
            }
        }
        System.out.println(SArr.length - cnt);
    }
}
