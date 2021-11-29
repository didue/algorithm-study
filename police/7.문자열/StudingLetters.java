package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudingLetters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int[] arr = new int[26];//���Ĺ� �迭		
		String letter = br.readLine();
		
		for(int i=0; i<letter.length(); i++){
			if('A'<=letter.charAt(i) && letter.charAt(i) <='Z'){//�빮��
				arr[letter.charAt(i) - 'A']++; // �ش� ���Ĺ� �ε����� �� 1 ���� 
			}else{//�ҹ���
				arr[letter.charAt(i) - 'a']++; // �ش� ���Ĺ�  �ε����� �� 1 ����
			}
		}
		int max = -1;//�ߺ��� ���Ĺ� ���� 
		char ch='?' ;// ��� ����

		for(int i=0; i<26; i++){//�ε����� ���� ���� �� ã�� 
			if(arr[i] >max){
				max = arr[i];
				ch = (char)(i+65);
			}else if(arr[i] == max){
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
