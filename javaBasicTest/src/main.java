public class main {
	public static void main(String[] args) {
		int x = 0x80000000;
		System.out.println(x + " ");
		x = x >>> 31;
		System.out.println(x);
	}
}
