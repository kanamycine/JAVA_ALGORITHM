import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ10972 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] intArr = new int[n];
		for (int i = 0; i < n; i++) {
			intArr[i] = sc.nextInt();
		}

		if (nextPermutation(intArr)){
			for (int i = 0; i < intArr.length; i++) {
				System.out.print(intArr[i] + " ");
			}
		}
		else{
			System.out.print(-1);
		}
	}
	public static boolean nextPermutation(int[] intArr) {
		//포인트 값 찾기
		int N = intArr.length - 1;
		int point = -1;
		List<Integer> potential = new ArrayList<>();
		for (int i = N; i > 0; i--) {
			if (intArr[i - 1] < intArr[i]) {
				point = i - 1;
				break;
			}
		}
		//다음 순열 없을 때 경우
		if (point == -1) {
			return false;
		}

		//point 뒤로 point 보다 큰 수들 다 저장
		for (int i = point + 1; i <= intArr.length - 1; i++) {
			if (intArr[point] < intArr[i]) {
				potential.add(intArr[i]);
			}
		}

		if(potential.size() == 0){

		}
		// potential중에 min 값 뽑기
		int min = Collections.min(potential);
		List<Integer> tmpLst = new ArrayList<>();
		for(int e : intArr){
			tmpLst.add(e);
		}

		// min값 스왑
		int minIdx = tmpLst.indexOf(min);
		int tmp = intArr[minIdx];
		intArr[minIdx] = intArr[point];
		intArr[point] = tmp;

		// point idx 부터 뒤에 정렬
		Arrays.sort(intArr, point+1, intArr.length);
		return true;
	}
}
