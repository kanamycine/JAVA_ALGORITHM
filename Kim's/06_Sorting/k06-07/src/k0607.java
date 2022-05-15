import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class k0607 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		List<Point> lst = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			lst.add(new Point(x, y));
		}
		Collections.sort(lst);
		for (Point point : lst) {
			System.out.println(point.x + " " + point.y);
		}
	}
}

class Point implements Comparable<Point> {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	@Override
	public int compareTo(Point e2) {
		if (this.x == e2.x) {
			if (this.y > e2.y) {
				return 1;
			} else if (this.y == e2.y) {
				return 0;
			} else
				return -1;
		} else if (this.x > e2.x) {
			return 1;
		} else {
			return -1;
		}
	}
}