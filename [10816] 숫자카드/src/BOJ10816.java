import java.util.Arrays;
import java.util.Scanner;


public class BOJ10816 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];

		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] compare = new int[m];
		for (int i = 0; i < m; i++) {
			compare[i] = sc.nextInt();
		}

		Arrays.sort(input);

		int[] res = new int[m];
		for (int i = 0; i < m; i++) {
			if (binarySearch(input, compare[i], 0, m - 1)) {
				res[i] += 1;
			}
		}

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static boolean binarySearch(int[] arr, int key, int low, int high) {
		while (low <= high) {
			int m = (low + high) / 2;
			if (arr[m] == key) {
				return true;
			} else if (arr[m] < key) {
				low = m + 1;
			} else {
				high = m - 1;
			}
		}
		return false;
	}
}
