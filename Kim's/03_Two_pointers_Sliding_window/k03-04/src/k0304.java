import java.util.Scanner;

public class k0304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int res = 0;
		int l = 0;
		int sum = 0;
		for (int r = 0; r < n; r++) {
			sum += arr[r];
			if(sum==m) res+=1;
			while (sum >= m) {
				sum -= arr[l++];
				if(sum == m){
					res+=1;
				}
			}
		}
		System.out.println(res);
	}
}

