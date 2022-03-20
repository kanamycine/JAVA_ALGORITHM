import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class k0302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);

		List<Integer> lst = new ArrayList<>();
		int p1 = 0;
		int p2 = 0;
		while(p1<a.length && p2<b.length){
			if(a[p1] == b[p2]){
				lst.add(a[p1]);
				p1++;
			}
			else if (a[p1] < b[p2]){
				p1++;
			}
			else
				p2++;
		}

		for (Integer integer : lst) {
			System.out.print(integer + " ");
		}

	}
}
