import java.util.Scanner;

public class sumNs {
	public static long sum(int[] a) {
		long ans = 0; // ��������  long�� ������ �䱸
		for(int i=0; i<a.length; i++){
			ans += a[i];
		}
		return ans;
	}
}
