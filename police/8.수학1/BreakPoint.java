package mathMathics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakPoint {
	public static void main(String[] args) throws IOException {
		/*
		 * �Ѻ�� = (����(A) + (�ΰǺ�(B)*����))
		 * �Ѽ��� = (��Ʈ�ϰ���(C) *����)
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
				System.out.println("������ ���ڰ� �ƴմϴ�.");
				return;
			}
		}	
		
		//int result = arr[0]/(arr[2]-arr[1]);0���� ������� ��쿡 ���� ����ó�� ����
		
		if(arr[2]-arr[1] < 1){
			System.out.println(-1);
		}else{
			System.out.println(arr[0]/(arr[2]-arr[1])+1);
		}
	}
}
