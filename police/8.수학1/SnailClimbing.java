package mathMathics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnailClimbing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		/**
		 *  (up - down)X = length
		 *  
		 *  X = length/(up-down);
		 *  
		 */
		int[] arr = new int[3];
		for(int i=0; i<3; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = (arr[2]-arr[1]) / (arr[0] - arr[1]);
		
		if((arr[2]-arr[1]) % (arr[0] - arr[1]) != 0) result++;
		
		System.out.println(result);
	}
}
