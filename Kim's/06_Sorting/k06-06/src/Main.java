import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		//깊은복사

		int[] tmp = arr.clone();

		ArrayList lst = new ArrayList();

		Arrays.sort(tmp);

		for (int i = 0; i < n; i++) {
			if (arr[i] != tmp[i]) {
				lst.add(i + 1);
			}
		}

		for (Object o : lst) {
			System.out.print(o + " ");
		}
	}
}
