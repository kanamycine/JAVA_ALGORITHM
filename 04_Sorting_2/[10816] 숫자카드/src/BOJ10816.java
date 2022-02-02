import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int [] arr = new int [20000001];
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(s[i]) + 10000000]++;
		}
		int m = Integer.parseInt(br.readLine());
		String ss[] = br.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			sb.append(arr[Integer.parseInt(ss[i]) + 10000000] + " ");
		}
		System.out.println(sb);
	}
}
