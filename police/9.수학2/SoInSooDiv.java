package mathMatics2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoInSooDiv {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for(int i=2; i<=Math.sqrt(num);i++){
			while(num % i == 0){
				System.out.println(i);
				num /= i;
			}
		}
		if(num != 1 ){
			System.out.println(num);
		}
	}
}
