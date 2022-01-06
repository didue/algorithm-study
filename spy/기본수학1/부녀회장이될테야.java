package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이될테야 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
//        int repeat = 2;

        for (int i = 0; i < repeat; i++) {
            int floor = Integer.parseInt(br.readLine());
//            int floor = 5;
            int nth = Integer.parseInt(br.readLine());
//            int nth = 4;
            System.out.println(getNum(floor, nth));
        }
    }

    private static int getNum(int floor, int nth) {
        int result = 0;
        for (int i = 1; i <= nth; i++) {
            if (floor - 1 > 0) {
                result += getNum(floor - 1, i);
            } else {
                result += i;
            }
        }
        return result;
    }
}
