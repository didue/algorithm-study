package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
//        int target = 14;
        int max = 0;
        int i = 1;
        boolean oddNthTrigger = true;
        while (true) {
            max += i;
            oddNthTrigger = !oddNthTrigger;
            if (target <= max) {
                break;
            }
            i++;
        }
        int gap = max - target;
        int numerator;
        int denominator;
        if (oddNthTrigger) {
            numerator = i - gap;
            denominator = 1 + gap;
        } else {
            numerator = 1 + gap;
            denominator = i - gap;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
