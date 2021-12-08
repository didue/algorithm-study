package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 손익분기점 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] SArr = S.split(" ");

        int A = Integer.parseInt(SArr[0]);
        int B = Integer.parseInt(SArr[1]);
        int C = Integer.parseInt(SArr[2]);

        int netProfit = C - B;

        if (netProfit <= 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(A/netProfit + 1);

    }
}
