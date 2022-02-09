import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class BOJ2812 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		String input = br.readLine();
		Stack<Integer> stk = new Stack<>();
		int cnt = 0;

		for (int i = 0; i < input.length(); i++) {
			int nbr = input.charAt(i) - '0';
			while(cnt < m && !stk.isEmpty() && stk.peek() < nbr) {
				stk.pop();
				cnt++;
			}
			stk.add(nbr);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n-m ; i++) {
			sb.append(stk.get(i));
		}
		System.out.println(sb);
	}
}
