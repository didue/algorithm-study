import java.util.Scanner;

public class repeatString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();//�׽�Ʈ ���̽� ����
		exceptions(T, 1000); // ����ó�� 
		
		for(int i=0; i<T; i++){	//�׽�Ʈ ���̽���ŭ �ݺ�
			int R = sc.nextInt(); // �ݺ�Ƚ��
			exceptions(R, 8);	// ����ó��

			String text = sc.next();	//�ݺ����ϴ� ���ڿ�
			
			for(int j=0; j < text.length(); j++){//���� for��... ������� ��� �ʿ�
				for(int k=0; k < R; k++){
					System.out.print(text.charAt(j));
				}	
			}
			System.out.println();// �׽�Ʈ ���̽� ����� ����
		}
	}
	
	public static int exceptions(int num, int max){ // ������ ������ ���� �ִ��ּҰ� ����
		if(num < 1){
			num = 1;
		}else if(num > max){
			num = max;
		}
		return num;
	}
}
