import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		List<Integer> lst = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int input = sc.nextInt();
			if(lst.size() >= n){
				if(lst.contains(input)){
					lst.remove(input);
					lst.add(0, input);
					continue;
				}
				else{
					lst.remove(n-1);
					lst.add(0, input);
					continue;
				}
			}
			lst.add(0, input);
		}
		for (Integer integer : lst) {
			System.out.print(integer + " ");
		}

		Set<Integer> set = new LinkedHashSet<>();
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(0);

		System.out.println(set);
	}
}
