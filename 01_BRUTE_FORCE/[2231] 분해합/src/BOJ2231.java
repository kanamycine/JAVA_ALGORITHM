import java.util.Scanner;

public class BOJ2231 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strN = scanner.nextLine();
		int nLength = strN.length();
		int number = Integer.parseInt(strN);
		int res = 0;

		for ( int i = (number - (nLength * 9)); i < number; i++) {
			int n = i;
			int sum = 0;

			while(n != 0){
				sum += n % 10;
				n /= 10;
			}

			if (sum + i == number){
				res = i;
				break;
			}
		}
		System.out.println(res);
	}
}
