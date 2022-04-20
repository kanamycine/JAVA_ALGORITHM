import java.util.ArrayList;
import java.util.Scanner;

public class k0301_2nd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] b = new int[m + 1];
		for (int i = 0; i < m; i++) {
			b[i] = scanner.nextInt();
		}
		ArrayList<Integer> lst = new ArrayList<>();
		int p1 = 0, p2 = 0;
		while (p1 < n && p2 < m) {
			if (a[p1] < b[p2])
				lst.add(a[p1++]);
			else
				lst.add(b[p2++]);
		}
		while (p1 < n)
			lst.add(a[p1++]);
		while (p2 < m)
			lst.add(b[p2++]);

		for (Integer integer : lst) {
			System.out.print(integer + " ");
		}
	}
}