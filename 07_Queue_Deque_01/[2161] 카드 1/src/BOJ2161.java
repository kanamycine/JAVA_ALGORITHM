import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(q.poll() + " ");
			q.offer(q.poll());
		}
	}
}
