import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] str = s.split("");
		Stack<String> stk = new Stack<>();
		int res = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("("))
				stk.push(str[i]);
			else {
				stk.pop();
				if (str[i - 1].equals("(")) {
					res += stk.size();
				} else if (str[i - 1].equals(")")) {
					res += 1;
				}
			}
		}

		System.out.println(res);
	}
}
