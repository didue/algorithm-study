import java.util.Scanner;

public class findAlphabat {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		for(char c='a'; c<='z'; c++){	// a~z���� �ݺ��Ѵ�.
			System.out.print(word.indexOf(c)+" ");	// �ݺ����� �ش� char�� ���� �Էµ� ���ڿ��� ���° �ε������� ��� ������ default -1�� ���
		}
		
		/*
		 * �������� 1 : Scanner �� ��� ȿ���� �������� - BufferedReader�� ����ϰų� sc.next()ó�� �ϳ��� ���� �ް��� �Ҷ��� �� ���� �޾ƿ��� �����(System.in.read()) ���� 
		 * �������� 2 :  for�� ���� for�� -> a-z������ for�� �ȿ�  indexOf�� Ż ��� indexOf()�� Ư���� ��� �� ��ȸ�̱⿡ for�� ����for���� �Ǿ�
		 * 			�޸� �Ҹ� ū �ҽ��� �ȴ�. 
		 * 	indexOf() 
		 * 	- 0�� �ε������� �� �ε������� ��ġ�Ѵ�.
		 * 	- �ݺ��Ǵ� ���� ���� �ε��� ���� ä���Ѵ�. 
		 * 	- String���� �޾Ƶ� �ƽ�Ű�ڵ�� ��ȯ�ؼ� �Է� �޴´�.
		 */
	}
}
