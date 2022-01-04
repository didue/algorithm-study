package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieFilm {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if (N > 1) {
			filmNum(N);
		} 
		else {
			System.out.println(666);
		}
	}

	public static void filmNum(int n) {
		int count = 1;
		int preNum = 0;	// 선수 자릿수
		int num = 0;	// 선수 자릿수를 제외한 나머지 뒷 자릿수


		while (true) {
			if (((preNum % 10000) / 10) == 666 && preNum % 10 != 6) {
				for (int i = 0; i < 1000; i++) {
					if (count == n) {
						System.out.print(preNum * 1000 + num);
						return;
					}
					num++;
					count++;
				}
				preNum++;
			}else if (preNum % 1000 == 666) {
				num = 0;
				for (int i = 0; i < 1000; i++) {

					if (count == n) {
						System.out.print(preNum * 1000 + num);
						return;
					}
					count++;
					num++;
				}
				preNum++;
			}else if (preNum % 100 == 66) {
				num = 600;
				for (int i = 0; i < 100; i++) {
					if (count == n) {
						System.out.print(preNum * 1000 + num);
						return;
					}
					count++;
					num++;
				}
				preNum++;
			} 
			else if (preNum % 10 == 6) {
				num = 660;
				for (int i = 0; i < 10; i++) {
					if (count == n) {
						System.out.print(preNum * 1000 + num);
						return;
					}
					num++;
					count++;
				}
				preNum++;
			}
			else {
				num = 666;
				if (count == n) {
					System.out.print(preNum * 1000 + num);
					return;
				}
				count++;
				preNum++;
			}
		}
	}
}
