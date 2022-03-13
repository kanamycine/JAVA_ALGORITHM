import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class k0106 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < input.length(); i++) {
			set.add(input.charAt(i));
		}
		for (Character character : set) {
			System.out.print(character);
		}
	}
}
