import java.util.ArrayList;
import java.util.Scanner;

public class k0109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		input = input.replaceAll("[^0-9]", "");
		ArrayList<Integer> lst = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			lst.add(input.charAt(i) - '0');
		}

		while(lst.get(0) == 0){
			lst.remove(0);
		}

		for (Integer integer : lst) {
			System.out.print(integer);
		}
	}
}
