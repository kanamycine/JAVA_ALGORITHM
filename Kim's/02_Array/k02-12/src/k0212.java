import java.util.Scanner;

public class k0212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int res = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int cnt = 0;
				if (i != j) {
					for (int k = 0; k < m; k++) {
						int positioni = 0;
						int positionj = 0;
						for (int l = 0; l < n; l++) {
							if (arr[k][l] == i) {
								positioni = l;
							}
							if (arr[k][l] == j) {
								positionj = l;
							}
						}
						if (positioni < positionj) {
							cnt++;
						}
					}
					if (cnt == m)
						res++;
				}
			}
		}
		System.out.println(res);
	}
}
