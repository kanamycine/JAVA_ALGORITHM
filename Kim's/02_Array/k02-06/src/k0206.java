import java.util.Scanner;

public class k0206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		input = sb.toString();
		String[] inputt = input.split(" ");

		for (int i = n - 1; i >= 0; i--) {
			int tmp = Integer.parseInt(inputt[i]);
			if (prime(tmp) && tmp > 1) {
				System.out.print(tmp + " ");
			}
		}
	}

	static boolean prime(int tmp) {
		for (int i = 2; i * i <= tmp; i++) {
			if (tmp % i == 0) {
				return false;
			}
		}
		return true;
	}
}
