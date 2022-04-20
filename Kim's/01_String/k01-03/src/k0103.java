import java.util.Scanner;

public class k0103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] arr = input.split(" ");
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(arr[i].length(), max);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() == max) {
				System.out.println(arr[i]);
				return;
			}
		}
	}
}
