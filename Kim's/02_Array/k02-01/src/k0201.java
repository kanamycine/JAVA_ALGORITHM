import java.util.Scanner;

public class k0201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		String input = sc.nextLine();
		String[] tmp = input.split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < tmp.length; i++) {
			arr[i] = Integer.parseInt(tmp[i]);
		}

		System.out.print(arr[0] + " ");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				System.out.print(arr[i + 1] + " ");
			}
		}
	}
}
