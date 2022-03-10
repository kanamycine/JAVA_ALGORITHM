import java.util.Scanner;

public class k0104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for (int j = input.length() - 1; j >= 0; j--) {
				System.out.print(input.charAt(j));
			}
			System.out.println();
		}
	}
}
