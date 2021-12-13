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
		 *  java.math�� �Լ��̸� ���ڿ��� ���ڰ����� �Ѱ��ش�.
		 *  ���ڿ��̱� ������ ��Ģ���� ������� �ʰ� ���� �޼��� ����ؾ���
		 *  ���ڿ� �˻�, ����, ��� �˻�� ������ ��ó ȿ���� ������ ������ 
		 *  ���� ���� ������ ���ϸ� ���ܸ� �پ��ϰ� ó���Ͽ� ���ռ��� ����
		 */
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		System.out.println(A.add(B));
	}
}
