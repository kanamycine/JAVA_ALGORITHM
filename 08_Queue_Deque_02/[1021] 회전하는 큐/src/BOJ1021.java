import java.util.LinkedList;
import java.util.Scanner;

public class BOJ1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		LinkedList<Integer> dq = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			dq.offerLast(i);
		}

		int[] arr = new int[m];

		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}

		int cnt = 0;

		for (int i = 0; i < m; i++) {
			int t_idx = dq.indexOf(arr[i]);
			int h_idx = 0;

			if (dq.size() % 2 == 0) {
				h_idx = dq.size() / 2 - 1;
			} else
				h_idx = dq.size() / 2;

			if (t_idx <= h_idx) {
				for (int j = 0; j < t_idx; j++) {
					int tmp = dq.pollFirst();
					dq.offerLast(tmp);
					cnt++;
				}
			} else {
				for (int j = 0; j < dq.size() - t_idx; j++) {
					int tmp = dq.pollLast();
					dq.offerFirst(tmp);
					cnt++;
				}
			}
			dq.pollFirst();
		}

		System.out.println(cnt);

	}
}
