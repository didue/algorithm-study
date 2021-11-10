import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(hans(scan.nextInt()));
		scan.close();		
	}
 
	public static int hans(int num) {
		int cnt = 0;
 
		if (num < 100) {
			return num;
		} else {
			cnt = 99;
 
			for (int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}

			if (num == 1000) {
				num = 999;
			}
			
		}
 
		return cnt;
	}
 
}