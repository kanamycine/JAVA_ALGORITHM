import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		for (int i = 0; i < n; i++) {
			int len = sc.nextInt();
			int pri = sc.nextInt();

			LinkedList<int[]> q = new LinkedList<>();
			for (int j = 0; j < len; j++) {
				q.offer(new int[] {j, sc.nextInt()});
			}

			int cnt = 0;

			while (q.size() > 0) {
				int[] tmp = q.poll();
				boolean flag = true;

				for (int j = 0; j < q.size(); j++) {
					if (tmp[1] < q.get(j)[1]) {
						q.offer(tmp);
						for (int k = 0; k < j; k++) {
							q.offer(q.poll());
						}
						flag = false;
						break;
					}
				}
				if (!flag) {
					continue;
				}
				cnt++;
				if (tmp[0] == pri) {
					break;
				}
			}
			System.out.println(cnt);
		}
	}
}