import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2529 {
	static boolean[] check = new boolean[10];
	static int n;
	static char[] a = new char[10];
	static ArrayList ans = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray()[0];
		}

		recur(0, "");
		Collections.sort(ans);

		System.out.println(ans.get(ans.size() - 1));
		System.out.println(ans.get(0));
	}

	static void recur(int index, String num) {
		if (index == n + 1) {
			ans.add(num);
			return;
		}

		for (int i = 0; i <= 9; i++) {
			if (check[i]) {
				continue;
			}
			if (index == 0 || chk(num.charAt(index - 1), (char)(i + '0'), a[index - 1])) {
				check[i] = true;
				recur(index + 1, num + Integer.toString(i));
				check[i] = false;
			}
		}
	}

	static boolean chk(char a, char b, char c) {
		if (c == '<') {
			if (a > b) {
				return false;
			}
		}
		if (c == '>') {
			if (a < b) {
				return false;
			}
		}
		return true;
	}
}


