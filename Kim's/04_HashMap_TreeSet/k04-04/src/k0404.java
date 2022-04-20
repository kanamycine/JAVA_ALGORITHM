import java.util.HashMap;
import java.util.Scanner;

public class k0404 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String a = sc.next();

		String[] str = s.split("");
		String[] ana = a.split("");
		HashMap<String, Integer> map = new HashMap<>();
		HashMap<String, Integer> anamap = new HashMap<>();
		for (int i = 0; i < ana.length; i++) {
			anamap.put(ana[i], anamap.getOrDefault(ana[i], 0 + 1));
		}
		int answer = 0;

		int lt = 0;
		for (int i = 0; i < a.length() - 1; i++) {
			map.put(str[i], map.getOrDefault(str[i], 0) + 1);
		}

		for (int rt = a.length() - 1; rt < s.length(); rt++) {
			map.put(str[rt], map.getOrDefault(str[rt], 0) + 1);
			if (map.equals(anamap)) {
				answer += 1;
			}
			map.put(str[lt], map.getOrDefault(str[lt], 0) - 1);
			if (map.get(str[lt]) == 0) {
				map.remove(str[lt]);
			}
			lt++;
		}
		System.out.println(answer);
	}
}
