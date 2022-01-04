import java.util.Scanner;

public class BOJ1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1;
		int i = 666;
		while(cnt != n+1){
			String str = Integer.toString(i);
			if(str.contains("666")) {
				cnt += 1;
			}
			i++;
		}
		System.out.println(i - 1);
	}
}
