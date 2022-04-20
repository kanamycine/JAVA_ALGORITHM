import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class k0303 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String first = br.readLine();
		String[] tmp = first.split(" ");

		int n = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);
		int[] arr = new int[n + 1];

		first = br.readLine();
		tmp = first.split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(tmp[i]);
		}

		int max = 0;
		int sum = 0;
		int k = m;
		for (int i = 0; i < m; i++) {
			max += arr[i];
		}
		sum = max;
		while (k != arr.length - 1) {
			sum = sum - arr[k - m] + arr[k];
			if (sum > max) {
				max = sum;
			}
			k++;
		}
		System.out.println(max);
	}
}
