import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class k0401 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 65; i < 70; i++) {
			map.put(Character.toString((char)i), 0);
		}
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		String [] strings = s.split("");
		for (int i = 0; i < strings.length; i++) {
			if(map.containsKey(strings[i]))
				map.put(strings[i], map.get(strings[i]) + 1);
		}
		List<Map.Entry<String, Integer>> entryList= new LinkedList<>(map.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		System.out.println(entryList.get(4).getKey());
	}
}
