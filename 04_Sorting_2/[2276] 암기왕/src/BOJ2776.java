import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ2776 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());

			HashMap<Integer, Boolean> map = new HashMap<>();
			for (int j = 0; j < N; j++) {
				map.put(Integer.parseInt(st.nextToken()), true);
			}

			int M = Integer.parseInt(br.readLine());

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				if(map.containsKey(Integer.parseInt(st.nextToken()))){
					bw.write("1\n");
				}
				else {
					bw.write("0\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
