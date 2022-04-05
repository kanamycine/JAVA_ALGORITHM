import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String t = sc.nextLine();
		String s = sc.nextLine();
		List<String> lst = Arrays.asList(t.split(""));
		String[] string = s.split("");
		List<String> answer = new ArrayList<>();
		for (int i = 0; i <s.length() ; i++) {
			if (lst.contains(string[i])){
				answer.add(string[i]);
			}
		}

		if(lst.equals(answer)){
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}

}
