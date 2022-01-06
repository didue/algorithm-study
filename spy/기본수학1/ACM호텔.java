package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACM호텔 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());
//        int repeat = 1;
        for (int i = 0; i < repeat; i++) {

            String[] s = br.readLine().split(" ");
//            String[] s = {"51", "26", "452"};
            int height = Integer.parseInt(s[0]);
            int width = Integer.parseInt(s[1]);
            int nth = Integer.parseInt(s[2]);

            int floor = nth % height;
            int nthRoom = nth / height + 1;

            if (floor == 0) {
                floor = height;
                nthRoom--;
            }

            System.out.println(floor + String.format("%02d", nthRoom));

        }
    }
}
