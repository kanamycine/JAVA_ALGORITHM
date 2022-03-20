import java.util.Scanner;

public class k0207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i <n ; i++) {
			arr[i] = sc.nextInt();
		}

		int ans = 0;
		int combo = 0;

		if(arr[0] == 1){
			ans += 1;
		}
		for (int i = 1; i < n; i++) {
			if(arr[i-1] == 1){
				combo += 1;
			}
			else{
				combo = 0;
			}
			if(arr[i] == 1){
				ans += 1 + combo;
			}
		}
		System.out.println(ans);
	}
}
