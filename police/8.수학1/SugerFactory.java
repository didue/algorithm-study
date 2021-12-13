package mathMathics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugerFactory {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int weight = Integer.parseInt(br.readLine());
		/*
		 * 조건1 : 5와 3으로 만들 수 있는 수 
		 * 조건 2 : 최소의 봉지 개수 
		 * 조건3 : -1은 최소한의 경우 출력
		 */
		int result =0;
		
		while(true){

			if(weight %5 ==0){
				result += weight/5;
				System.out.println(result);
				break;
			}else if(weight <= 0){
				System.out.println(-1);
				break;
			}else{
				weight -= 3;
				result++;
			}
			
		}
	}
}
