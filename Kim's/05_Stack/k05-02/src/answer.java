import java.util.Scanner;
import java.util.Stack;

public class answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] str = s.split("");

		Stack<String> stk = new Stack<>();

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(")")) {
				while (!(stk.pop().equals("("))) {
				}
			} else
				stk.push(str[i]);
		}
		for (int i = 0; i < stk.size(); i++) {
			System.out.print(stk.get(i));
		}
	}
}

