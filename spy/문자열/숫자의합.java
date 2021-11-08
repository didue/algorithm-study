package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String len = br.readLine();
        String number = br.readLine();

        int sum = 0;
        for (int i = 0; i < Integer.parseInt(len); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        System.out.println(sum);
    }
}
