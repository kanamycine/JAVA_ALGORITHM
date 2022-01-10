import java.util.Scanner;

public class _1_N {
	static int n;
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sum = 0;
		recursive(1);
		System.out.println(sum);
	}

	public static void recursive(int i){
		if (i == n + 1){
			return;
		}
		sum += i;
		recursive(i+1);
	}
}
