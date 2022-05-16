import java.util.Scanner;

public class BOJ15650 {
	static int n;
	static int m;
	static int [] arr = new int [10];
	static boolean [] visited = new boolean[10];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		recur(1,0);
	}

	static void recur(int depth, int k){
		if(k == m){
			for (int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

		else {
			for (int i = depth; i <= n; i++) {
				if(!visited[i]){
					arr[k] = i;
					visited[i] = true;
					recur(i + 1, k+1);
					visited[i] = false;
				}
			}
		}
	}
}
