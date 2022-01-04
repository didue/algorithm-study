package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Size {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ple = Integer.parseInt(br.readLine());
		
		int[][] arr= new int[ple][2];
		
		for(int i=0; i< ple; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i< ple; i++){
			int rank = 1;
			for(int j=0; j < ple; j++){
				if(i ==j) continue;
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
	}
}
