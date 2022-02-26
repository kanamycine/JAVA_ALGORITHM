import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ18115 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		List<Integer> lst = new ArrayList<Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			lst.add(Integer.parseInt(st.nextToken()));
		}
		Collections.reverse(lst);

		Deque<Integer> dq = new ArrayDeque<>();
		int num = 1;
		int tmp = 0;
		for (int i = 0; i < n; i++) {
			int function = lst.get(i);

			if(function == 1){
				dq.addFirst(num);
			} else if (function == 2){
				tmp = dq.poll();
				dq.addFirst(num);
				dq.addFirst(tmp);
			} else {
				dq.addLast(num);
			}
			num++;
		}

		while(!dq.isEmpty()){
			sb.append(dq.poll()).append(" ");
		}
		System.out.println(sb.toString());
	}
}
