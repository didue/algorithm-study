import java.util.Scanner;

public class repeatString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();//테스트 케이스 개수
		exceptions(T, 1000); // 예외처리 
		
		for(int i=0; i<T; i++){	//테스트 케이스만큼 반복
			int R = sc.nextInt(); // 반복횟수
			exceptions(R, 8);	// 예외처리

			String text = sc.next();	//반복원하는 문자열
			
			for(int j=0; j < text.length(); j++){//이중 for문... 수정방법 고민 필요
				for(int k=0; k < R; k++){
					System.out.print(text.charAt(j));
				}	
			}
			System.out.println();// 테스트 케이스 종료시 개행
		}
	}
	
	public static int exceptions(int num, int max){ // 문제로 지정된 값의 최대최소값 지정
		if(num < 1){
			num = 1;
		}else if(num > max){
			num = max;
		}
		return num;
	}
}
