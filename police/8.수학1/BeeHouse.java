package mathMathics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeeHouse {
	public static void main(String[] args) throws IOException {
		/**
		 * 1	7
		 * 이후 각 칸마다 6개 씩 증가 
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int i=0;
		int regNum=1;
		while(true){
			regNum = regNum+6*i;
			if(num<=regNum){
				System.out.println(i+1);
				break;
			}
			
			i++;
		}
	}
}
