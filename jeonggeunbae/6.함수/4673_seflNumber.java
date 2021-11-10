public class Main {
	public static void main(String args[]) {
		int[] total = new int[10001];
		for(int i=1;i<10001;i++) {
			int n = d(i);
			if(n<10001) {
				total[n] = 1;
			}
		}
		for(int j=1;j<10001;j++) {
			if(total[j] == 0) {
				System.out.println(j);
			}
		}

	}
	public static int d(int number) {
		int total = number;
		
		while(number != 0) {
			total = total + (number % 10);
			number = number/10;
		}
		return total;
	}
}