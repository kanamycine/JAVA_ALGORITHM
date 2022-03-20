import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class k0209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		ArrayList<Integer> lst = new ArrayList<>();
		int rsum = 0;
		int csum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rsum += arr[i][j];
				csum += arr[j][i];
			}
			lst.add(rsum);
			lst.add(csum);
			rsum = 0;
			csum = 0;
		}

		for (int i = 0; i < n; i++) {
			rsum += arr[i][i];
			csum += arr[i][n - i - 1];
		}
		lst.add(rsum);
		lst.add(csum);

		System.out.println(Collections.max(lst));
	}

}

