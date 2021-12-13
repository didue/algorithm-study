package mathMathics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HotelMaster {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for(int i=0; i<testCase; i++){

			String nums = br.readLine();

			StringTokenizer st = new StringTokenizer(nums," ");

			int H = Integer.parseInt(st.nextToken());//층수
			int W = Integer.parseInt(st.nextToken());//방수
			int N = Integer.parseInt(st.nextToken());//손님번호
			
			if( H>100 || W>100 || N> H*W || H<1 || W<1 || N<1 ){
				System.out.println("숫자오류");
				return;
			}
			
			int result;
			if(N%H ==0){
				result =  H*100 + (N/H);
			}else{
				result = (N%H)*100 + (N/H)+1;
			}
			
			System.out.println(result);
		}
	}
}
