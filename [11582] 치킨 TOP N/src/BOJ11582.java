import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ11582 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int c = sc.nextInt();

		for (int i = 0; i < n; i += (int)(n / c)) {
			int [] tmp = Arrays.copyOfRange(arr, i, i + (int)(n / c));

			Arrays.sort(tmp);
			for (int j = 0; j < tmp.length; j++) {
				res.add(tmp[j]);
			}
		}
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}
	}
}
