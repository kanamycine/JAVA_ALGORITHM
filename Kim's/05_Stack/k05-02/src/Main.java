import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] str = s.split("");

		Stack<String> stk = new Stack<>();
		ArrayList<String> lst = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("(")) {
				stk.push(str[i]);
			} else if (str[i].equals(")"))
				stk.pop();
			else {
				if (stk.isEmpty()) {
					lst.add(str[i]);
				}
			}
		}
		for (String s1 : lst) {
			System.out.print(s1);
		}
		return;
	}
}
