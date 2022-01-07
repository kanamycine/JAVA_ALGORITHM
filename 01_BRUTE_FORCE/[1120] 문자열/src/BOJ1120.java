import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer og = new StringBuffer();
		StringBuffer bn = new StringBuffer();
		og.append(sc.next());
		bn.append(sc.next());
		int ogIdx = 0;
		int bnIdx = 0;
		int arrSize = 0;
		int contmp = 0;
		if(og.length() != bn.length()) {
			if (og.length() - bn.length() > 0)
				arrSize = og.length() - bn.length();
			arrSize = -(og.length() - bn.length());

			int[] cnts = new int[arrSize + 1];
			while (contmp <= arrSize) {
				int cnt = 0;
				for (int i = 0; i < og.length(); i++) {
					if (og.charAt(i) == bn.charAt(i)) {
						cnt += 1;
					}
				}
				cnts[contmp] = cnt;
				contmp++;
				og.insert(0, "0");
			}
			int max = cnts[0];
			int maxIndex = 0;
			for (int i = 0; i < cnts.length; i++) {
				if (cnts[i] > max) {
					max = cnts[i];
					maxIndex = i;
				}
			}
			og.delete(0, arrSize - maxIndex + 1);
			int rescnt = 0;
			for (int i = 0; i < og.length(); i++) {
				if (og.charAt(i) == '0')
					continue;
				if (og.charAt(i) != bn.charAt(i))
					rescnt += 1;
			}
			System.out.println(rescnt);
			return;
		}
		int rescnt = 0;
		for (int i = 0; i < og.length(); i++) {
			if (og.charAt(i) != bn.charAt(i))
				rescnt += 1;
		}
		System.out.print(rescnt);
	}
}
