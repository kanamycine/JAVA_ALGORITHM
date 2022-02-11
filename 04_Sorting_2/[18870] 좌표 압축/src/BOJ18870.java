import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BOJ18870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] og = new int[n];

		for (int i = 0; i < n; i++) {
			og[i] = sc.nextInt();
		}
		int[] ogsort = og.clone();

		Arrays.sort(ogsort);

		Map<Integer, Integer> map = new HashMap<>();
		int i = 0;
		for (int N : ogsort) {
			if (!map.containsKey(N)) {
				map.put(N, i++);
			}
		}

		for (int N : og)
			sb.append(map.get(N) + " ");

		System.out.println(sb);
	}
}
