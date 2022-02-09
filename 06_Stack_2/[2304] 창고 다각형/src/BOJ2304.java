import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ2304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Point> pointLst = new ArrayList<>();
		int[] hArr = new int[1001];
		int res = 0;

		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			int tmp2 = sc.nextInt();
			hArr[i] = tmp2;
			pointLst.add(new Point(tmp, tmp2));
		}
		Arrays.sort(hArr);
		Collections.sort(pointLst);
		int maxH = hArr[hArr.length - 1];
		int maxX = 0;
		for(int i=0; i<pointLst.size(); i++) {
			if(pointLst.get(i).h == maxH) {
				maxX = i;
				break;
			}
		}
		for (int i = 0; i < maxX; i++) {
			for (int j = i + 1; j <= maxX; j++) {
				if (pointLst.get(i).h <= pointLst.get(j).h) {
					res += (pointLst.get(j).x - pointLst.get(i).x) * pointLst.get(i).h;
					i = j;
				}
			}
		}
		for (int i = n - 1; i > maxX; i--) {
			for (int j = i - 1; j >= maxX; j--) {
				if (pointLst.get(i).h <= pointLst.get(j).h) {
					res += (pointLst.get(i).x - pointLst.get(j).x) * pointLst.get(i).h;
					i = j;
				}
			}
		}
		System.out.println(res);
		System.out.println(res + maxH);
	}
}

class Point implements Comparable<Point> {
	int x;
	int h;

	public Point(int x, int h) {
		this.x = x;
		this.h = h;
	}

	@Override
	public int compareTo(Point o) {
		return Integer.compare(this.x, o.x);
	}
}
