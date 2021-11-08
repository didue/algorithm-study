package 함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int a = Integer.parseInt(str);
//        int a = 1;

        if (a < 100) {
            System.out.println(a);
            return;
        }
        int cnt = 0;
        if (a == 1000) {
            cnt = -1;
        }
        for (int i = 100; i <= a; i++) {
            int temp = i;
            int first = temp % 10;
            temp /= 10;
            int second = temp % 10;
            int diff = first - second;
            temp /= 10;
            if ((second - diff) == (temp % 10)) {
                cnt++;
            }
        }
        System.out.println(cnt + 99);
    }
}
