import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		StringBuilder sb = new StringBuilder();
		sb.append('<');

		while(q.size() > 1) {
			for (int j = 0; j < m-1; j++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()).append(", ");
		}

		sb.append(q.poll()).append('>');
		System.out.println(sb);
	}
}
