package mathMathics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BigNum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		/*
		 * BigInteger
		 *  java.math의 함수이며 문자열을 인자값으로 넘겨준다.
		 *  문자열이기 때문에 사칙연산 적용되지 않고 내부 메서드 사용해야함
		 *  문자열 검사, 음수, 양수 검사등 과정이 거처 효율이 좋지는 않지만 
		 *  아주 넓은 범위를 지니며 예외를 다양하게 처리하여 정합성이 높음
		 */
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		System.out.println(A.add(B));
	}
}
