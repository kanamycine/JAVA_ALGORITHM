import java.util.Scanner;

public class k0105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		char [] s = input.toCharArray();
		int lt, rt;
		lt = 0;
		rt = s.length - 1;
		while(lt <= rt){
			if(!Character.isAlphabetic(s[lt]))
				lt++;
			else if (!Character.isAlphabetic(s[rt]))
				rt--;
			else {
				char tmp = s[rt];
				s[rt] = s[lt];
				s[lt] = tmp;
				lt++;
				rt--;
			}
		}
		String res = String.valueOf(s);
		System.out.println(res);
	}
}
