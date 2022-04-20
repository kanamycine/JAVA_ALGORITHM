import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class k0211 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][5];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		ArrayList<int[][]> lst = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			lst.add(new int[n][5]);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < n; k++) {
					if (i != k && arr[i][j] == arr[k][j]) {
						lst.get(i)[k][j] = 1;
					}
				}
			}
		}
		ArrayList<Integer> res = new ArrayList<>();
		for (int[][] ints : lst) {
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 5; j++) {
					// System.out.print(ints[i][j] + " ");
					if (ints[i][j] == 1) {
						cnt++;
						break;
					}
				}
				// System.out.println();
			}
			// System.out.println(cnt);
			res.add(cnt);
		}
		System.out.println(res.indexOf(Collections.max(res)) + 1);
	}
}
