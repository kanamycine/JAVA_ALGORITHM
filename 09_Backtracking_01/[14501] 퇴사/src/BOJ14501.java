

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 그냥 엄청 오래품.. 한 3시간 붙잡은듯..... 풀이를 봤다
 */
public class BOJ14501 {
	static int n;
	static int[] t;
	static int[] p;
	static int max_money = Integer.MIN_VALUE;

	static void answer(int start, int money) {
		if (start > n) return;
		if (start == n) {
			max_money = Math.max(max_money, money);
			return;
		}

		answer(start + t[start], money + p[start]);
		answer(start + 1, money); /* 이게 포인트!! */
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		t = new int[n];
		p = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}

		answer(0, 0);

		System.out.println(max_money);
	}
}
	// public static void main(String[] args) throws IOException {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 	StringTokenizer st;
	//
	// 	int N = Integer.parseInt(br.readLine());
	// 	int[] dp = new int[N + 1];
	//
	// 	for (int i = 0; i < N; i++) {
	// 		st = new StringTokenizer(br.readLine());
	// 		int T = Integer.parseInt(st.nextToken());
	// 		int P = Integer.parseInt(st.nextToken());
	// 		System.out.print("dp : ");
	// 		for (int i1 : dp) {
	// 			System.out.print(i1 + " ");
	// 		}
	// 		System.out.println();
	// 		dp[i + 1] = Math.max(dp[i], dp[i + 1]);
	// 		if (i + T <= N) dp[i + T] = Math.max(dp[i + T], dp[i] + P);
	// 	}
	// 	System.out.println(dp[N]);
	// }
