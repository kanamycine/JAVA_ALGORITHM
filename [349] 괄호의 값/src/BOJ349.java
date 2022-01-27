import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class BOJ349 {
	static int calculate(String input) {

		int l = input.length();
		int cur = 1;
		int res = 0;
		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < l; i++) {
			switch (input.charAt(i)) {
				case '(': stk.push('('); cur *= 2; break;
				case '[': stk.push('['); cur *= 3; break;
				case ')':
					if (stk.isEmpty() || stk.peek() != '(') return 0;
					if (input.charAt(i - 1) == '(') {
						res += cur;
					}
						stk.pop();
						cur /= 2;
						break;
				case ']':
					if (stk.isEmpty() || stk.peek() != '[') return 0;
					if (input.charAt(i - 1) == '[') {
						res += cur;
					}
						stk.pop();
						cur /= 3;
						break;

			}
		}
		if (!stk.isEmpty())
			return 0;
		return res;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(calculate(input));
	}
}

