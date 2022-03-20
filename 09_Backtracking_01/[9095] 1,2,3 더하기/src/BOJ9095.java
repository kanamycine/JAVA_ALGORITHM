import java.util.Scanner;

public class BOJ9095 {
	private static int [] result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		result = new int [t];
		for (int i = 0; i < t; i++) {
			result[i] = 0;
			int n = sc.nextInt();
			backtracking(n, i);
			System.out.println(result[i]);
		}
	}

	static void backtracking(int n, int order){
		if (n == 0){
			result[order]++;
		}

		for (int i = 1; i <= 3; i++) {
			int chk = n-i;
			if(chk>=0){
				backtracking(n-i, order);
			}
		}
	}
}
