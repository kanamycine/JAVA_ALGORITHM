import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class k0405 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					ts.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		int cnt = 0;
		for (Integer t : ts) {
			cnt++;
			if (cnt == m) {
				System.out.println(t);
				return;
			}
		}
		System.out.println(-1);
	}
}
