import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		Arrays.sort(arr);


		// binary search
		int low = 0;
		int high = arr.length - 1;
		int mid;

		while(low <= high){
			mid = (low + high) / 2;

			if(arr[mid] == m) {
				System.out.println(mid + 1);
				break;
			}

			else if (arr[mid] > m){
				high = mid - 1;
			}
			else low = mid + 1;
		}
	}
}
