import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Stack<Integer> stk = new Stack<>();

		for (int i = n; i > 0; i--) {
			stk.push(i);
		}

		int cnt = 1;
		while(stk.size() != 1){
			while(cnt != m){
				stk.add(0, stk.pop());
				cnt +=1;
			}
			stk.pop();
			cnt = 1;

		}
		int answer = stk.pop();
		System.out.println(answer);
	}
}
