package recursiveFunction;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int result = 1;
		for(int i=N; i>0; i--){
			result *= i;
		}
		System.out.println(result);
	}
}
