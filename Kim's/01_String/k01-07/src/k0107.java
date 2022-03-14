import java.util.Scanner;

public class k0107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int lt = 0;
		int rt = input.length() - 1;

		while (lt <= rt) {
			if (input.charAt(lt) != input.charAt(rt)
					&& input.charAt(lt) != input.charAt(rt) + 32
					&& input.charAt(lt) + 32 != input.charAt(rt)
					&& input.charAt(lt) - 32 != input.charAt(rt)
					&& input.charAt(lt) != input.charAt(rt) - 32) {
				System.out.println("NO");
				return;
			}
			lt++;
			rt--;
		}
		System.out.println("YES");
	}
}
