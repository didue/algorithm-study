
public class selfNum {
	public static void main(String[] args) {

		int index = 10000; // 1~10000������ ��
		boolean[] nums = new boolean[index]; // ���� �ѹ��� ������ �迭 ����

		for(int i=0; i<nums.length; i++) {
			if(add(i+1) < index+1){			// ���� �ѹ��� �ƴϸ� true�� ����
				nums[add(i+1)-1] = true; 
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == false)
				System.out.println(i+1);
		}
	}

	static int add(int n) {

		String str = Integer.toString(n); // ������ ��ȯ 

		for(int i=0; i<str.length(); i++) {
			n += Integer.parseInt(str.substring(i, i+1)); // 
		}
		return n;
	}
}
