import java.util.Scanner;

public class arithmeticSeq {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        if(input > 1000) {
            System.out.println("out of bounds");
        } else if (input == 1000) {
            //1000은 등차 아니므로
            int result = isArithmeticSeq(999);
            System.out.println(result);
        } else {
            int result = isArithmeticSeq(input);
            System.out.println(result);
        }

    }

    public static int isArithmeticSeq(int n) {
        String strNum = Integer.toString(n);
        int numLength = strNum.length();
        int[] arrNum = new int[numLength];
        int cnt = 0;

        for (int i = 0; i < numLength ; i++) {
            arrNum[i] = strNum.charAt(i) - '0';
        }

        if (numLength == 1) {
            return n;
        } else if (numLength == 2) {
            return n;
        } else if (numLength == 3) {
            //100~999까지
            for (int i = 100; i <= n ; i++) {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i - (100 * a) - (10 * b);
                if (a-b == b-c) {
                    cnt++;
                }
            }
            return 99 + cnt;
        }

        return cnt;
    }
}
