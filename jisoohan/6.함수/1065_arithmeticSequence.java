import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int n = Integer.parseInt(str);
        int count = getNumberOfSequence(n);
        System.out.println(count);
    }

    public static int getNumberOfSequence(int num){
        if(num < 100) {
            return num;
        }

        int cnt = 99;
        for(int i=100 ; i<=num ; i++){
            if(isSequence(i)){
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean isSequence(int num) {
        int first = num / 100;
        int sec = (num / 10) % 10;
        int third = num % 10;

        return first - sec == sec - third;
    }
    
    //TODO : 1000보다 작은 자연수 n 이라는 한정없이 계산하기 위한
    //확장 코딩 해보기!
}
