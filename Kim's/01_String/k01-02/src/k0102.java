import java.util.Scanner;

public class k0102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) >= 65 && input.charAt(i) <= 90){
				System.out.print((char)(input.charAt(i) + 32));
			}
			else if (input.charAt(i) >= 97 && input.charAt(i)<=122){
				System.out.print((char)(input.charAt(i) - 32));
			}
		}
	}
}
