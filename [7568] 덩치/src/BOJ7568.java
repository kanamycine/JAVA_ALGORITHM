import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ7568 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int peopleNumber = scanner.nextInt();
		List<int []> lst = new ArrayList<>();

		for (int i = 0; i < peopleNumber; i++) {
			int [] arr = new int[3];
			arr[0] = scanner.nextInt();
			arr[1] = scanner.nextInt();
			arr[2] = 0;
			lst.add(arr);
		}

		for (int i = 0; i < lst.size() - 1; i++) {
			for (int j = i+1; j < lst.size(); j++) {
				int [] a = lst.get(i);
				int [] b = lst.get(j);
				if (a[0] > b[0] && a[1] > b [1]){
					b[2] += 1;
				}
				else if (a[0] < b[0] && a[1] < b[1]){
					a[2] += 1;
				}
			}
		}

		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
	}
}
