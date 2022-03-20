import java.util.Scanner;

public class BOJ15649_2nd {

	static int n;
	static int m;
	static int [] arr = new int[10];
	static boolean [] visited = new boolean[10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		recursive(0);
	}

	static void recursive(int depth){
		if (depth == m){
			for (int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

		else{
			for (int i = 1; i <= n; i++) {
				if(!visited[i]) {
					arr[depth] = i;
					visited[i] = true;
					recursive(depth+1);
					visited[i] = false;
				}
			}
		}
	}
}
