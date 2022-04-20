import java.util.Scanner;

public class Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int n = sc.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		int[] arr = new int[size];
		for (int x : input) {
			int pos = -1;
			for (int i = 0; i < size; i++) {
				if (x == arr[i])
					pos = i;
			}
			if (pos == -1) {
				for (int i = size - 1; i >= 1; i--) {
					arr[i] = arr[i - 1];
				}
				arr[0] = x;
			} else {
				for (int i = pos; i >= 1; i--) {
					arr[i] = arr[i - 1];
				}
				arr[0] = x;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
