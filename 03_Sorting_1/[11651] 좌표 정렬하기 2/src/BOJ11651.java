import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BOJ11651 {

	public static void main(String[] args) {
		List<Points> points = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Points a = new Points(sc.nextInt(), sc.nextInt());
			points.add(a);
		}

		Collections.sort(points, MyComparator);

		for (int i = 0; i < points.size(); i++) {
			System.out.print(points.get(i).x + " ");
			System.out.println(points.get(i).y);
		}
	}

	public static Comparator<Points> MyComparator = new Comparator<Points>() {
		@Override
		public int compare(Points o1, Points o2) {
			if (o1.y > o2.y) {
				return 1;
			} else if (o1.y == o2.y) {
				if (o1.x > o2.x)
					return 1;
			}
			return -1;
		}
	};
}

class Points {
	int x = 0;
	int y = 0;

	public Points(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
