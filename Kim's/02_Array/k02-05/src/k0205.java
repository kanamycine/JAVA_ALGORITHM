import java.util.Scanner;

public class k0205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n + 1];
		int cnt = 0;
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) {
				cnt++;
			} else if (arr[i] == 1)
				continue;

			for (int j = i * 2; j < arr.length; j = j + i) {
				arr[j] = 1;
			}
		}
		System.out.println(cnt);
	}
}
