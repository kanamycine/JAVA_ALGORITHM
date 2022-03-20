import java.util.Scanner;

public class k0204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int [] arr = new int[n];

		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
