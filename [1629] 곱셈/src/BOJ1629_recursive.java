import java.util.Scanner;

public class BOJ1629_recursive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long m = sc.nextLong();
		System.out.print(recursive(a,b,m));
	}

	public static long recursive(long a, long b, long m) {
		if(b == 0){
			return a % m;
		}
		long tmp = recursive(a, b/2 , m);
		if (b % 2 == 0){
			return tmp * tmp % m;
		}
		return (tmp * tmp % m) * tmp % m;
	}
}
