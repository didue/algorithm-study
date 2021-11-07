public class selfNumber {
    public static void main(String[] args) throws Exception {
        int num = 100;
        boolean[] chk = new boolean[num];
        
        for (int i = 1; i<num; i++) {
            if(isSelfNum(i) < num) {
                chk[isSelfNum(i)] = true;
            }
        }

        for (int j = 1; j < num ; j++) {
            if (!chk[j]) {
                System.out.println(j);
            }
        }

    }
    
    public static int isSelfNum(int n) {
        int sum = n;
        int tmp = n;
        
        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }
        
        // TODO :: 1) Math.pow 사용해서 고쳐보기
        // TODO :: 2) 시간/메모리
        //Math.pow(10, 1) = 10
        //Math.pow(10, 2) = 100
        //Math.pow(10, 3) = 1000
        // for (int i = 1 ; i < 4 ; i++) {
        //     double dec = Math.pow(10, i);
        //     sum = (int) (n / dec);
        //     if (sum < 1) {
        //         sum = n % 10;
        //     }
        //     tmp += sum;
        // }

        return sum;
    }
}

