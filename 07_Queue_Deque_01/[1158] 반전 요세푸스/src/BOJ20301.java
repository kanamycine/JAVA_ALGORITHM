import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ20301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> q = new LinkedList<>();
		ArrayList<Integer> lst = new ArrayList<>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		boolean flag = false;

		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		while (q.size() > 0) {
			if (flag == false) {
				for (int j = 0; j < m - 1; j++) {
					q.offerLast(q.pollFirst());
				}
				System.out.println(q.poll());
			}
			else {
				for (int i = 0; i < m - 1; i++) {
					q.offerFirst(q.pollLast());
				}
				System.out.println(q.pollLast());
			}
			cnt++;
			if (cnt == k) {
				flag = !flag;
				cnt = 0;
			}
		}
	}
}

