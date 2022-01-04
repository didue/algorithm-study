package mathMatics2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindSoSu {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int nums = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int result =0;
		for(int i=0; i<nums; i++){

			int sosu = Integer.parseInt(st.nextToken());
			boolean flag = true;
			
			if(sosu == 1){
				continue;
			}
			
			for(int j=2; j<=Math.sqrt(sosu); j++){
				if(sosu%j==0){
					flag = false;
					break;
				}
			}
			
			if(flag){
				result++;
			}
		}
		System.out.println(result);
	}
}
