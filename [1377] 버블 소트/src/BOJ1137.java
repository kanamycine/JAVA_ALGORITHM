import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ1137 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Number [] numbers = new Number[n+1];

		for (int i = 1; i <= n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			numbers[i] = new Number(tmp, i);
		}

		Arrays.sort(numbers, 1, n+1);

		int res = 0;
		for (int i = 1; i < n + 1; i++) {
			res = Math.max(res, numbers[i].idx - i);
		}

		bw.write((res + 1) + "\n");
		bw.close();
		br.close();
	}
}

class Number implements Comparable<Number>{
	int number;
	int idx;

	public Number(int number, int idx){
		this.number = number;
		this.idx = idx;
	}

	@Override
	public int compareTo(Number o) {
		return number-o.number;
	}
}
