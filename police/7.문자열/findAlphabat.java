import java.util.Scanner;

public class findAlphabat {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		for(char c='a'; c<='z'; c++){	// a~z까지 반복한다.
			System.out.print(word.indexOf(c)+" ");	// 반복문의 해당 char의 값이 입력된 문자열의 몇번째 인덱스인지 출력 없으면 default -1로 출력
		}
		
		/*
		 * 지적사항 1 : Scanner 의 사용 효율이 떨어진다 - BufferedReader를 사용하거나 sc.next()처럼 하나의 값을 받고자 할때는 한 값만 받아오는 방법이(System.in.read()) 있음 
		 * 지적사항 2 :  for문 안의 for문 -> a-z부터의 for문 안에  indexOf를 탈 경우 indexOf()의 특성이 모든 값 조회이기에 for문 안의for문이 되어
		 * 			메모리 소모가 큰 소스가 된다. 
		 * 	indexOf() 
		 * 	- 0번 인덱스부터 끝 인덱스까지 서치한다.
		 * 	- 반복되는 값은 뒤의 인덱스 값을 채택한다. 
		 * 	- String값을 받아도 아스키코드로 변환해서 입력 받는다.
		 */
	}
}
