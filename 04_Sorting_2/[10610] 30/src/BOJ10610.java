import java.util.Scanner;

public class BOJ10610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		long strLen = str.length();
		long total = 0;
		int [] cntArr = new int [10];
		for (int i = 0; i < strLen; i++) {
			int idx = Integer.parseInt(str.substring(i,i+1));
			cntArr[idx] += 1;
			total += idx;
		}

		if(!str.contains("0") || total % 3 != 0){
			System.out.println("-1");
			return;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 9; i >= 0; i--) {
			while(cntArr[i] > 0){
				sb.append(i);
				cntArr[i]--;
			}
		}
		System.out.println(sb.toString());
	}
}
