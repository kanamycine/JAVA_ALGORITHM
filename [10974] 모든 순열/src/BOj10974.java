import java.util.Scanner;

public class BOj10974 {
	public static int n;
	public static int[] arr = new int[10];
	public static boolean[] visit = new boolean[10];
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		permutation(0);
	}

	public static void permutation(int k) {
		if (k == n){
			for (int i = 0; i < n; i++) {
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
