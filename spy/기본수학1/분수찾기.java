package 기본수학1;

public class 분수찾기 {

    public static void main(String[] args) {

        int nth = 1;
        int sum = 0;
        int maxNum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;
            if (nth < sum) {
                maxNum = i;
                break;
            }
        }
        int leftnth = (nth - (sum - maxNum)) - 1;
        if (maxNum % 2 == 0) {
            // 짝수 1 / n
            int left = 1 + leftnth;
            int right = maxNum - leftnth;
            System.out.println(left + "/" + right);
        } else {
            // 홀수 n / 1
            int left = maxNum - leftnth;
            int right = 1 + leftnth;
            System.out.println(left + "/" + right);
        }
    }
}
