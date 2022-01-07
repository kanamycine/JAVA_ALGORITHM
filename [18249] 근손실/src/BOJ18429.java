import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ18429 {
	static int n;
	static int m;
	static int [] arr;
	static int [] kit;
	static boolean [] visit;
	static List<int[]> lst;
	static int res = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[10];
		visit = new boolean[10];
		kit = new int[n];
		lst=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			kit[i] = sc.nextInt();
		}
		recur(0);

		for (int i = 0; i < lst.size(); i++) {
			int temp = 500;
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				int kitNum = lst.get(i)[j];
				if(temp - m +kit[kitNum - 1]<500) {
					flag = false;
					break;
				}
				else {
					temp=temp-m+kit[kitNum - 1];
				}
			}
			if (flag == true)
				res += 1;
		}

		System.out.print(res);
	}

	public static void recur(int k){
		if(k == n){
			int [] tmp = new int[n];
			for (int i = 0; i < n; i++) {
				tmp[i] = arr[i];
			}
			lst.add(tmp);
		}

		for (int i = 1; i <= n; i++) {
			if(!visit[i]){
				arr[k] = i;
				visit[i] = true;
				recur(k+1);
				visit[i] = false;
			}
		}
	}
	// public static int kitSum(int idx) {
	// 	int sum = 0;
	// 	for (int i = 0; i < idx ; i++) {
	// 		sum += kit[i];
	// 	}
	// 	return sum;
	// }
}
