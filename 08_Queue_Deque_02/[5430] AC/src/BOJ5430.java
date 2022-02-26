import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ5430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = null;

		for (int i = 0; i < t; i++) {
			String tmpcmd = br.readLine();
			String[] cmd = tmpcmd.split("");

			int n = Integer.parseInt(br.readLine());
			Deque<String> dq = new LinkedList<>();

			String number = br.readLine();
			number = number.substring(1, number.length() - 1);
			if(n != 0)
				st = new StringTokenizer(number, ",");
			else{
				if(tmpcmd.contains("D"))
					System.out.println("error");
				else
					System.out.println("[]");
				continue;
			}

			for (int j = 0; j < n; j++) {
				dq.add(st.nextToken());
			}

			boolean flag = true;
			boolean error = false;


			for (int k = 0; k < cmd.length; k++) {
				for(String s : dq){
					System.out.print(s + " ");
				}
				System.out.println();
				if (cmd[k] == "R") {
					flag = !flag;
				}
				else {
					if (dq.isEmpty()) {
						error = true;
						break;
					}
					if (flag)
						dq.pollFirst();
					else
						dq.pollLast();
				}
			}

			if (!error) {
				System.out.print("[");
				if (flag) {
					while (dq.size() > 1) {
						System.out.print(dq.pollFirst() + ",");
					}
				} else {
					while (dq.size() > 1) {
						System.out.print(dq.pollLast() + ",");
					}
				}
				if (!dq.isEmpty())
					System.out.print(dq.getFirst());
				System.out.println("]");
			} else {
				System.out.println("error");
			}
		}
	}
}

