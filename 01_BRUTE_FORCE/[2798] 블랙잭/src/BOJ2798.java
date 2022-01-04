import java.util.Scanner;

public class BOJ2798 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int max = 0;

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < j; k++) {
					if (arr[i] + arr[j] + arr[k] > max && arr[i] + arr[j] + arr[k] <= m) {
						max = arr[i] + arr[j] + arr[k];
					}
				}
			}
		}
		System.out.println(max);
	}
}
