import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class k0206_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;
			while (tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}
			if(prime(res)){
				ans.add(res);
			}
		}

		for (Integer an : ans) {
			System.out.print(an + " ");
		}
	}

	static boolean prime(int tmp) {
		if (tmp == 1) return false;
		for (int i = 2; i * i <= tmp; i++) {
			if (tmp % i == 0) {
				return false;
			}
		}
		return true;

	}
}
