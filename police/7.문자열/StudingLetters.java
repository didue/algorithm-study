package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudingLetters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int[] arr = new int[26];//알파뱃 배열		
		String letter = br.readLine();
		
		for(int i=0; i<letter.length(); i++){
			if('A'<=letter.charAt(i) && letter.charAt(i) <='Z'){//대문자
				arr[letter.charAt(i) - 'A']++; // 해당 알파뱃 인덱스의 값 1 증가 
			}else{//소문자
				arr[letter.charAt(i) - 'a']++; // 해당 알파뱃  인덱스의 값 1 증가
			}
		}
		int max = -1;//중복된 알파뱃 개수 
		char ch='?' ;// 출력 문자

		for(int i=0; i<26; i++){//인덱스가 제일 높은 값 찾기 
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
