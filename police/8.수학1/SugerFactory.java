package mathMathics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugerFactory {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int weight = Integer.parseInt(br.readLine());
		/*
		 * ����1 : 5�� 3���� ���� �� �ִ� �� 
		 * ���� 2 : �ּ��� ���� ���� 
		 * ����3 : -1�� �ּ����� ��� ���
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
