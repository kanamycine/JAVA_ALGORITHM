import java.util.Map;
import java.util.Scanner;

public class BOJ1018 {

	public static void main(String[] args) {
		boolean [][] arr;
		int min = 64;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		arr = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W')
					arr[i][j] = true;
				else{
					arr[i][j] = false;
				}
			}
		}

		int vN = n-7;
		int vM = m-7;

		for (int i = 0; i < vN; i++) {
			for (int j = 0; j < vM; j++) {
				int endX = i + 8;
				int endY = j + 8;
				int cnt = 0;

				boolean firstColor = arr[i][j];

				for (int k = i; k < endX ; k++) {
					for (int l = j; l < endY; l++) {
						if(arr[k][l] != firstColor){
							cnt++;
						}
						firstColor = (!firstColor);
					}
					firstColor = (!firstColor);
				}
				cnt = Math.min(cnt, 64-cnt);
				min = Math.min(min, cnt);
			}
		}
		System.out.println(min);
	}
}
