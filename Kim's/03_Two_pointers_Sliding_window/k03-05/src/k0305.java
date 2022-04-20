import java.util.Scanner;

public class k0305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n / 2 + 1];
		for (int i = 0; i < n / 2 + 1; i++) {
			arr[i] = i + 1;
		}
		int res = 0;
		int l = 0;
		int sum = 0;
		for (int r = 0; r < n / 2 + 1; r++) {
			sum += arr[r];
			if (sum == n)
				res += 1;
			while (sum >= n) {
				sum -= arr[l++];
				if (sum == n) {
					res += 1;
				}
			}
		}
		System.out.println(res);
	}
}
