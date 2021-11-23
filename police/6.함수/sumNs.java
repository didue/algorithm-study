import java.util.Scanner;

public class sumNs {
	public static long sum(int[] a) {
		long ans = 0; // 문제에서  long의 정수를 요구
		for(int i=0; i<a.length; i++){
			ans += a[i];
		}
		return ans;
	}
}
