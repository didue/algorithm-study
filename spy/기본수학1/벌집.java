package 기본수학1;

public class 벌집 {

    public static void main(String[] args) {

        String S = "13";
        int A = Integer.parseInt(S);

        int a = 1;

        if (A == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 0; ; i++) {
            a = a + 6 * i;
            if (a >= A) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
