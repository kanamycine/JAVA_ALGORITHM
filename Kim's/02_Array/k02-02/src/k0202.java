import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class k0202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		String input = sc.nextLine();
		String [] inputa = input.split(" ");
		List<Integer> lst = new ArrayList<>();
		int min = 0;
		for (int i = 0; i < inputa.length; i++) {
			int tmp = Integer.parseInt(inputa[i]);
			if (min < tmp) {
				lst.add(tmp);
				min = tmp;
			}
		}
		System.out.println(lst.size());
	}
}
