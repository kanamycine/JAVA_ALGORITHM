import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<Character> stk = new Stack<>();
		int res = 0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '('){
				stk.push(input.charAt(i));
			}

			if(input.charAt(i) == ')'){
				stk.pop();
				if (input.charAt(i-1) == '('){
					res += stk.size();
				}
				else
					res += 1;
			}
		}
		System.out.println(res);

	}
}
