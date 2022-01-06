import java.util.Arrays;
import java.util.Scanner;

public class BOJ6603 {
	static int n;
	static int m = 6;
	static int[] arr;
	static boolean[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			if(n == 0){
				break;
			}
			visit = new boolean[n];
			arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			permutation(0, 0);
			System.out.println();
		}
	}

	public static void permutation(int j, int k) {
		if (k == 6) {
			for (int i = 0; i < n; i++) {
				if (visit[i] == true)
					System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

		for (int i = j; i < n; i++) {
			visit[i] = true;
			permutation(i + 1, k + 1);
			visit[i] = false;
		}
	}
}
