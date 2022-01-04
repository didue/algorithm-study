package recursiveFunction;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		if(N == 0){
		}else if(N == 1){
			result = 1;
		}else{
			int[] arr = new int[N+1];
			arr[0] = 0;
			arr[1] = 1;
			for(int i=2; i<=N; i++){
				arr[i] = arr[i-2]+arr[i-1];
				result = arr[i];
			}
		}
		System.out.println(result);
	}
}
