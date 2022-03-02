import java.io.*;
import java.util.*;

public class BOJ3078 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		long answer = 0;
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		// 최소 길이가 2, 최대 길이가 20이므로 Queue타입의 배열을 만든다.
		Queue<Integer>[] q = new LinkedList[21];
		for (int i = 2; i < 21; ++i)
			q[i] = new LinkedList<>();

		for (int i = 1; i <= N; ++i) {
			int len = br.readLine().length();
			// q가 비어있다면 그냥 넣음
			if (q[len].isEmpty()) {
				q[len].add(i);
			}
			else {
				while (!q[len].isEmpty()) {
					// 아니라면 가장 앞의 등수를 확인하고, 현재 학생의 등수의 차가 K이하라면 q사이즈만큼 쌍이 만들어지므로 answer에 더한다.
					// 그리고 q에 넣고 빠져나온다
					if (i - q[len].peek() <= K) {
						answer += q[len].size();
						q[len].add(i);
						break;
					}
					// 만약 q의 가장 앞에 있는 등수와의 차가 K보다 크다면 빼낸다.
					q[len].poll();
				}
				// q가 비었다면 q에 있었던 모든 학생의 차가 K보다 컸기 때문에 그냥 현재 학생의 등수만 넣어준다.
				if(q[len].isEmpty())
					q[len].add(i);
			}
		}
		System.out.println(answer);
	}

}