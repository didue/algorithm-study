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

			int H = Integer.parseInt(st.nextToken());//����
			int W = Integer.parseInt(st.nextToken());//���
			int N = Integer.parseInt(st.nextToken());//�մԹ�ȣ
			
			if( H>100 || W>100 || N> H*W || H<1 || W<1 || N<1 ){
				System.out.println("���ڿ���");
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
