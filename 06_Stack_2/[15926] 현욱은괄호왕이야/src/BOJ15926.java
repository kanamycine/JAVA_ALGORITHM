import java.util.Scanner;
import java.util.Stack;

public class BOJ15926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<>();

		int n = sc.nextInt();
		boolean[] arr = new boolean[n];

		String str = sc.next();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == '(')
				stk.push(i);
			else {
				if (!stk.empty()){
					arr[i] = true;
					arr[stk.peek()] = true;
					stk.pop();
				}
			}
		}
		int sum = 0;
		int res = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i]){
				sum++;
			}
			else {
				res = Math.max(res, sum);
				sum = 0;
			}
		}

		if(sum > 0)
			res = Math.max(res, sum);

		System.out.println(res);
	}
}
