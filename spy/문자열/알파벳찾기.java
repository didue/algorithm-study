package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알파벳찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 97;
            if (arr[index] != -1) {
                continue;
            }
            arr[index] = i;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
