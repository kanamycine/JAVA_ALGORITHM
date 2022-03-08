import java.util.Scanner;

public class k0101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String target = sc.nextLine();
		int res = 0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == target.charAt(0) || input.charAt(i) == target.charAt(0) + 32
			|| input.charAt(i) == target.charAt(0) - 32){
				res += 1;
			}
		}
		System.out.println(res);
	}
}
