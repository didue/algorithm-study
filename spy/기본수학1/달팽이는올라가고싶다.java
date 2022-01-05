package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이는올라가고싶다 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int day = Integer.parseInt(s[0]);
//        int day = 3;
        int night = Integer.parseInt(s[1]);
//        int night = 2;
        int top = Integer.parseInt(s[2]);
//        int top = 10;
        int dayClimbed = day - night;
        int beforeLastDay = top - day;
        int answer = beforeLastDay / dayClimbed + 1;
        if (beforeLastDay % dayClimbed > 0) {
            answer++;
        }
        System.out.println(answer);
    }
}