import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class alphaNumeric {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        String inputString = sc.nextLine();
        int inputLength = inputString.length();

        if (inputLength > 20) {
            System.out.println("out of bounds");
            return;
        }

        char[] charArr = new char[inputLength];

        for (int i = 0; i < inputLength ; i++) {
            charArr[i] = inputString.charAt(i);
        }
        
        for (int i = 2; i < inputLength ; i++) {
            //[0] = 숫자
            //[1] = ' '
            //[2~n까지] = 문자
            int cnt = charArr[0]-48;

                if (cnt < 1 || cnt > 8) {
                    System.out.println("out of bounds");
                    return;
                }

            System.out.print((charArr[i] + "").repeat(cnt));
        }
    }

}
