import java.util.Scanner;

public class BOJ10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			int second = N / H;
			int first = N % H;

			sb.append(first);
			if(second < 10){
				sb.append(0);
			}
			sb.append(second + 1);

			System.out.println(sb);
		}
	}
}
