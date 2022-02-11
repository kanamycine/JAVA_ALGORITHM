import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ15970 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Point> lst = new ArrayList<>();
		int res = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int color = sc.nextInt();
			Point tmp = new Point(x, color);
			lst.add(tmp);
		}

		for (int i = 0; i < lst.size(); i++) {
			Point og = lst.get(i);
			List<Integer> tmpAbss = new ArrayList<>();
			for (int j = 0; j < lst.size(); j++) {
				if (og.x != lst.get(j).x && lst.get(j).color == og.color){
					tmpAbss.add(Math.abs(og.x - lst.get(j).x));
				}
			}
			res += Collections.min(tmpAbss);
		}

		System.out.print(res);
	}
}

class Point{
	int x;
	int color;

	public Point(int x, int color){
		this.x = x;
		this.color = color;
	}
}
