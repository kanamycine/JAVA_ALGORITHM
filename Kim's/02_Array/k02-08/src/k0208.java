import java.util.ArrayList;
import java.util.Scanner;

public class k0208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = 100;
		int rank = 1;
		int tmp =0;
		int [] res = new int [n];
		while(x >= 0){
			for (int i = 0; i < n; i++) {
				if (arr[i] == x){
					res[i] = rank;
					tmp ++;
				}
			}
			rank += tmp;
			tmp = 0;
			x--;
		}
		for (int re : res) {
			System.out.print(re + " ");
		}
	}
}
