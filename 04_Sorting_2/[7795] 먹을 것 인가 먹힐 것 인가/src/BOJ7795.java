import java.util.Arrays;
import java.util.Scanner;

public class BOJ7795 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int [] na = new int [n];
			int [] ma = new int [m];


			for (int j = 0; j < n; j++) {
				na[j] = sc.nextInt();
			}

			for (int j = 0; j < m; j++) {
				ma[j] = sc.nextInt();
			}
			Arrays.sort(ma);

			int res = 0;
			for (int j = 0; j < n; j++) {
				for (int k = m-1; k >= 0; k--) {
					if (na[j] > ma[k]){
						res += k + 1;
						break;
					}
				}
			}
			System.out.println(res);
		}
	}
}
