import java.util.Scanner;

public class BOJ15652 {
	public static int n;
	public static int m;
	public static int[] arr = new int[10];
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		permutation(0);
		System.out.println(sb);
	}

	public static void permutation(int k) {
		if (k == m) {
			for (int i = 0; i < m - 1 ; i++) {
				if(arr[i] > arr[i+1]){
					return;
				}
			}
			for (int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
		}

		for (int i = 1; i <= n; i++) {
			if(k >= n){
				break;
			}
				arr[k] = i;
				permutation(k + 1);
			}
		}
	}
