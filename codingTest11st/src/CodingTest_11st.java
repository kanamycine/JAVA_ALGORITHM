public class CodingTest_11st {
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	class Solution {
		public int solution(int[] A) {
			int cnt = 0;
			boolean[] chk = new boolean[A.length];
			boolean flag;

			for (int i = 0; i < A.length; i++) {
				chk[A[i] - 1] = true;
				flag = true;
				if (A[i] > 1) {
					for (int j = 0; j < A[i] - 1; j++) {
						if (chk[j] != true) {
							flag = false;
							break;
						}
					}
					if (flag) {
						cnt++;
					}
				}
				if (A[i] == 1) {
					cnt++;
				}
			}

			return cnt;
		}
	}

}

public jsdgsgsdfg{
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	class Solution {
		public int solution(int A, int B) {
			int res = -1;
			String a = Integer.toString(A);
			String b = Integer.toString(B);

			res = b.indexOf(a);
			return res;
		}
	}

}
