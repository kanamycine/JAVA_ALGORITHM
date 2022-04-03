import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] str = s.split("");

		Stack<String> stk = new Stack<>();
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("("))
				stk.push(str[i]);
			else {
				if (stk.isEmpty()) {
					System.out.println("NO");
					return;
				}
				stk.pop();
			}
		}

		if (stk.isEmpty()) {
			System.out.println("YES");
			return;
		} else {
			System.out.println("NO");
			return;
		}
	}
}
