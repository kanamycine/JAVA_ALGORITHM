import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		Stack<Integer> stk = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 49 && arr[i] <= 57) {
				int t = stk.push(arr[i] - '0');
			} else {
				int lt = stk.pop();
				int rt = stk.pop();
				if (arr[i] == '+') {
					stk.push(lt + rt);
				} else if (arr[i] == '-') {
					stk.push(rt - lt);
				} else if (arr[i] == '*') {
					stk.push(rt * lt);
				} else {
					stk.push(rt / lt);
				}
			}
		}
		System.out.println(stk.pop());

	}
}
