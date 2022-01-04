package mathMatics2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindSoSu2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		if(M > N){
			return;
		}
		int sum = 0;
		int minVal = 0;

		for(int i=N; i>M; i--){
			boolean flag = true;
			for(int j=2; j<=Math.sqrt(i); j++){
				if(i % j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				sum += i;
				minVal = i;
			}
		}
		if(sum == 0){
			System.out.println(-1);
			return;
		}
		System.out.println(sum);
		System.out.println(minVal);
	}
}
