package 함수;

public class 셀프넘버 {

    public static void main(String[] args) {
        int a = 10000;

        boolean[] arr = new boolean[a];
        for (int i = 1; i <= a; i++) {
            int temp = i;
            int index = 0;
            int digit = (int)(Math.log10(temp) + 1);
            for (int j = 0; j < digit; j++) {
                index += temp % 10;
                temp /= 10;
            }
            index += i;
            if (index > a) {
                continue;
            }
            arr[index - 1] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
