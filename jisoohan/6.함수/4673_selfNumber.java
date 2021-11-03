import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        int size = 10001;
        
        boolean[] isSelfNumber = new boolean[size];
        Arrays.fill(isSelfNumber, false);

        for(int i = 1 ; i<size ; i++){
            int n = getDn(i);
            if(n < size){
                isSelfNumber[n] = true;
            }
        }

        for(int i=1 ; i<isSelfNumber.length ; i++){
            if(!isSelfNumber[i]){
                System.out.println(i);
            }
        }
    }

    public static int getDn(int n){
        int dn = n;
        while(n > 0){
            dn += n%10;
            n /= 10;
        }
        return dn;
    }


    //TODO : 이중for문을 제거할 수 있을지 생각해보기(시간복잡도 감소)

}
