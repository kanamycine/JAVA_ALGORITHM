import java.util.Scanner;

public class k0301 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int [] arra = new int [n + 1];
		for (int i = 0; i < n; i++) {
			arra[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int [] arrb = new int[m + 1];
		for (int i = 0; i < m; i++) {
			arrb[i] = scanner.nextInt();
		}
		int [] res = new int[n+m];
		int a = 0;
		int b = 0;
		int idx = 0;
		boolean flag = true;
		for (int i = 0; i < n+m; i++) {
			if (a > n - 1){
					res[i] = arra[a];
					idx = i;
					break;
			}
			else if (b>m-1){
				res[i] = arrb[b];
				flag = false;
				idx = i;
				break;
			}
			else if (arra[a] < arrb[b]){
				res[i] = arra[a];
				a++;
			}
			else{
				res[i] = arrb[b];
				b++;
			}
		}
		if(flag){
			while(idx < m + n) {
				res[idx] = arrb[b];
				idx++;
				b++;
			}
		}
		else
			while(idx < m + n){
				res[idx] = arra[a];
				idx++;
				b++;
			}

		for (int r : res) {
			System.out.print(r + " ");
		}
	}
}
