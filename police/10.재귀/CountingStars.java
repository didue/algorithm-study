package recursiveFunction;

import java.util.Arrays;
import java.util.Scanner;

public class CountingStars {
	public static char[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		arr = new char[N][N];
		
		for(int i=0; i<N; i++){
			Arrays.fill(arr[i], ' ');
		}
		filling(N,0,0);
		for(int i=0; i<N; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void filling(int N, int x, int y){
		if(N==1){
			arr[x][y] = '*';
			return;
		}
		int value = N/3;
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if( i==1 && j ==1){
					continue;
				}else{
					filling(value, x+(value*i), y+(value*j));
				}
			}
		}
	}
}
