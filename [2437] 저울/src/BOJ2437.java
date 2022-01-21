import java.util.Arrays;
import java.util.Scanner;

public class BOJ2437 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		int res = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > res + 1){
				break;
			}
			res += arr[i];
		}
		System.out.println(res + 1);
	}
}
