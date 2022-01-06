import java.util.Scanner;

public class BOJ10973 {

	public static int [] intArr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		intArr = new int[n];
		for (int i = 0; i < n; i++) {
			intArr[i] = sc.nextInt();
		}

		if (nextPermutation()){
			for (int i = 0; i < intArr.length; i++) {
				System.out.print(intArr[i] + " ");
			}
		}
		else{
			System.out.print(-1);
		}
	}
	public static boolean nextPermutation() {
		//포인트 값 찾기
		int point = intArr.length -1;
		while(point > 0 && intArr[point-1] <= intArr[point]){
			point--;
		}

		if (point == 0) {
			return false;
		}

		int j = intArr.length-1;
		while(intArr[j] >= intArr[point-1]){
			j--;
		}

		// 값 스왑
		swap(intArr, point-1, j);

		// 순열뒤집기
		j = intArr.length - 1;
		while(point < j) {
			swap(intArr, point, j);
			point += 1;
			j -= 1;
		}
		return true;
	}

	public static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
