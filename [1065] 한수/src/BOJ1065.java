import java.util.Scanner;

public class BOJ1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int i = 0;

		while (i <= n) {
			if( i < 100){
				cnt ++;
				i++;
				continue;
			}
			String strN = Integer.toString(i);
			boolean flag = true;
			if (strN.charAt(1) - (strN.charAt(0)) != strN.charAt(2) - (strN.charAt(1))) {
				flag = false;
			}
			if (flag == true)
				cnt++;
			i++;
		}
		System.out.println(cnt - 1);
	}
}
