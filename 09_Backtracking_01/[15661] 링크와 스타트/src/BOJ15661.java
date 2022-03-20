import java.util.Scanner;

public class BOJ15661 {
	static int n;
	static int min = Integer.MAX_VALUE;
	static int [][] map;
	static boolean[] visit;
	static int t;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		map = new int [n][n];
		visit = new boolean[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		for(t = 1; t<n; t++){
			combination(0,0);
		}
		System.out.println(min);
	}

	static void combination(int idx, int count){
		if(idx == t){
			min = Math.min(min, diff());
			if (min == 0) {
				System.out.println(min);
				System.exit(0);
			}
			return;
		}

		for (int i = count; i < n; i++) {
			if(!visit[i]){
				visit[i] = true;
				combination(idx + 1, i + 1);
				visit[i] = false;
			}
		}
	}

	static int diff(){
		int start = 0;
		int link = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if(visit[i] == true && visit[j] == true){
					start += map[i][j];
					start += map[j][i];
				}

				else if (visit[i] == false && visit[j]==false){
					link += map[i][j];
					link += map[j][i];
				}
			}
		}
		int val = Math.abs(start-link);

		if (val == 0){
			System.out.println(val);
			System.exit(0);
		}
		return min = Math.min(val, min);
	}
}
