import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class k0402 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		String[] s1a = s1.split("");
		String[] s2a = s2.split("");

		Map<String, Integer> map1 = new LinkedHashMap<>();
		Map<String, Integer> map2 = new LinkedHashMap<>();

		for (int i = 0; i < s1a.length; i++) {
			map1.put(s1a[i], map1.getOrDefault(s1a[i], 0) + 1);
		}

		for (int i = 0; i < s2a.length; i++) {
			map2.put(s2a[i], map2.getOrDefault(s2a[i], 0) + 1);
		}

		for (int i = 0; i < s1a.length; i++) {
			// System.out.println(map1.get(s1a[i]) + " " + map2.get(s2a[i]));
			// System.out.println(s1a[i] + " " + s2a[i]);
			if (map1.get(s1a[i]) != map2.get(s1a[i])) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		return;
	}
}
