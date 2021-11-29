package mathMathics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakPoint {
	public static void main(String[] args) throws IOException {
		/*
		 * 총비용 = (재료비(A) + (인건비(B)*개수))
		 * 총수입 = (노트북가격(C) *개수)
		 * A+B*X <= C*X
		 * A<=C*X-B*X
		 * A <= (C-B)X
		 * A/(C-B) <= X
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > 2100000000 || arr[i] < 1){
				System.out.println("가능한 숫자가 아닙니다.");
				return;
			}
		}	
		
		//int result = arr[0]/(arr[2]-arr[1]);0으로 나눠기는 경우에 대한 예외처리 없음
		
		if(arr[2]-arr[1] < 1){
			System.out.println(-1);
		}else{
			System.out.println(arr[0]/(arr[2]-arr[1])+1);
		}
	}
}
