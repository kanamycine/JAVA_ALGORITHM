import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();


		int n = Integer.parseInt(br.readLine());
		boolean [] emergeArray = new boolean [2000001];
		for (int i = 0; i < n; i++) {
			emergeArray[Integer.parseInt(br.readLine()) + 1000000] = true;
		}

		for (int i = 0; i <emergeArray.length ; i++) {
			if(emergeArray[i] == true)
				sb.append((i-1000000)).append('\n');
		}
		System.out.println(sb);
	}
}
