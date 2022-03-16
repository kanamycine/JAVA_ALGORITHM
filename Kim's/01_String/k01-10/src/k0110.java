import java.util.Scanner;

public class k0110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String [] iArr = input.split(" ");
		input = iArr[0];
		String target = iArr[1];

		int [] ans = new int[input.length()];

		for (int i = 0 ; i < ans.length; i++) {
			int tmp = i;
			int cnt = 0;
			int min = 10;
			while(tmp >= 0){
				if (input.charAt(tmp) == target.charAt(0)){
					min = Math.min(min, cnt);
					break;
				}
				cnt++;
				tmp--;
			}
			tmp = i;
			cnt = 0;
			while(tmp <= ans.length - 1){
				if (input.charAt(tmp) == target.charAt(0)){
					min = Math.min(min, cnt);
					break;
				}
				cnt++;
				tmp++;
			}
			ans[i] = min;
		}
		for (int i : ans) {
			System.out.print(i + " ");
		}


	}
}
