
public class hanSuoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];
		int result = 99;
		int inNum = Integer.parseInt(sc.nextLine());

		if(inNum <100){ // 100미만은 그 자체가 값
			System.out.println(inNum);
			return;
		}

		for(int i=100; i<1000; i++){// 각 배열에 담아 위치별 값 비교
			arr[0] = i / 100; 
			arr[1] = (i / 10)% 10 ; 
			arr[2] = i % 10; 

			if(arr[0] - arr[1] == arr[1] - arr[2]){
				result++;
			}
			if(i == inNum){
				break;
			}
		}
		System.out.println(result);
	}
}
