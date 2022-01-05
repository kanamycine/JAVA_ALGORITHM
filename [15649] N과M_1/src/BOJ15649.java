import java.util.Scanner;

public class BOJ15649 {
	public static int n;
	public static int m;
	public static int[] arr = new int[10];
	public static boolean[] visit = new boolean[10];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		permutation(0);
	}

	public static void permutation(int k) {
		if (k == m){
			for (int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			if(!visit[i]){
				arr[k] = i;
				visit[i] = true;
				permutation(k+1);
				visit[i] = false;
			}
		}
	}
}
