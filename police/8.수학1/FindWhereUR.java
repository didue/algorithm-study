package mathMathics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindWhereUR {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int range = 0;
		int i=1;
		while(true){
			range = range + i;
			if(range > num){
				
			}
			i++;
		}
	}
}
