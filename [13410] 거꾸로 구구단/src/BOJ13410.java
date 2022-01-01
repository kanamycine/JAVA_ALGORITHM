import java.util.Scanner;

public class BOJ13410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[m];
		for (int i = 1; i < m + 1 ; i++) {
			int tmp = n * i;
			String stringTmp = Integer.toString(tmp);
			String reverse = "";
			for (int j = stringTmp.length() - 1; j >= 0; j--) {
				reverse = reverse + stringTmp.charAt(j);
				arr[i - 1] = Integer.parseInt(reverse);
			}
		}

		int max = arr[0];
		for (int i = 0; i < arr.length ; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
