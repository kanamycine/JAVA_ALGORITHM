import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BOJ1764 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int b = sc.nextInt();
		HashSet<String> dSet= new HashSet<>();
		List<String> dblst = new ArrayList<>();

		for (int i = 0; i < d; i++) {
			dSet.add(sc.next());
		}
		for (int i = 0; i < b; i++) {
			String tmp = sc.next();
			if(dSet.contains(tmp)) {
				dblst.add(tmp);
			}
		}
		System.out.println(dblst.size());
		Collections.sort(dblst);
		for (int i = 0; i < dblst.size(); i++) {
			System.out.println(dblst.get(i));
		}
	}
}
