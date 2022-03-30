import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class k0403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] sa = s.split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		String number = sc.nextLine();
		String [] numbers = number.split(" ");
		List<Integer> answer = new ArrayList<>();
		HashMap<Integer,Integer> hm = new HashMap<>();
		for (int i = 0; i < m-1; i++) {
			hm.put(Integer.parseInt(numbers[i]), hm.getOrDefault(Integer.parseInt(numbers[i]), 0) + 1);
		}
		int lt = 0;

		for (int rt = m-1; rt < n; rt++) {
			hm.put(Integer.parseInt(numbers[rt]), hm.getOrDefault(Integer.parseInt(numbers[rt]), 0) + 1);
			answer.add(hm.size());
			hm.put(Integer.parseInt(numbers[lt]), hm.get(Integer.parseInt(numbers[lt])) - 1);
			if(hm.get(Integer.parseInt(numbers[lt])) == 0) {
				hm.remove(Integer.parseInt(numbers[lt]));
			}
			lt++;
		}
		for (Integer i : answer) {
			System.out.print(i + " ");
		}

	}
}
