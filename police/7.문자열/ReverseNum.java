package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		/*Stringbuilder 변경 가능한 문자의 시퀀스인 문자열 형식의 개체를 나타낸다
		 * 광범위한 문자열 조작을 수행하는 루틴으로 성능저하의 이슈가 있다
		 * 주요 메서드 Append, clear, reverse, insert, replace 등*/
		System.out.println(num1>num2 ? num1 : num2);
	}
}
