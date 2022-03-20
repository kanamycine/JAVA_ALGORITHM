import java.util.ArrayList;
import java.util.Scanner;

public class k0210 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] dx = {-1,1,0,0};
		int [] dy = {0,0,-1,1};

		int n = sc.nextInt();
		int [][] arr = new int[n+2][n+2];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					int x = i + dx[k];
					int y = j + dy[k];
					if (arr[i][j] <= arr[x][y]){
						flag =false;
						break;
					}
				}
				if (flag){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
