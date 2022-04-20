import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class k0111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine() + " ";
		StringBuilder sb = new StringBuilder();
		int cnt = 1;

		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				cnt++;
			} else {
				sb.append(input.charAt(i));
				if (cnt > 1) {
					sb.append(cnt);
					cnt = 1;
				}
			}
		}
		System.out.println(sb);

	}
}
