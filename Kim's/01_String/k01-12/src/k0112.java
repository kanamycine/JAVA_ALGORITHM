import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class k0112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String input = sc.next();
		List<String> lst = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			lst.add(Character.toString(input.charAt(i)));
		}
		for (int i = 0; i < n; i++) {
			String sign = "";
			for (int j = 0; j < 7; j++) {
				sign += lst.get(0);
				lst.remove(0);
			}
			sign = sign.replaceAll("#", "1");
			sign = sign.replaceAll("\\*", "0");

			int binary = Integer.parseInt(sign, 2);
			int dec = Integer.valueOf(Integer.toString(binary), 10);

			System.out.print((char)dec);
		}
	}
}
