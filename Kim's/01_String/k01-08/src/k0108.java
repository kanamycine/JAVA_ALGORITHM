import java.util.Scanner;

public class k0108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		input = input.replaceAll("[^a-zA-Z0-9]", "");

		StringBuilder sb = new StringBuilder(input);
		if (input.equalsIgnoreCase(sb.reverse().toString())) {
			System.out.println("YES");
		} else
			System.out.println("NO");
	}
}
