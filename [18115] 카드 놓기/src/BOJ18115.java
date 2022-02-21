import java.util.LinkedList;
import java.util.Scanner;

public class BOJ18115 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		LinkedList<Integer> dq = new LinkedList();
		LinkedList<Integer> res = new LinkedList();

		for (int i = 1; i <= n; i++) {
			dq.offerLast(i);
		}

		for (int i = 0; i < n; i++) {
			int cmd  = sc.nextInt();
			if(dq.size() == 1){
				int tmp = dq.poll();
				res.offerFirst(tmp);
				break;
			}

			if(cmd == 1){
				int tmp = dq.pollFirst();
				res.offerFirst(tmp);
			}

			if(cmd == 2){
				int tmp1 = dq.pollFirst();
				if(res.size() != 0) {
					int tmp2 = res.pollLast();
					res.offerLast(tmp2);
				}
				dq.offerLast(tmp1);
			}

			if(cmd == 3){
				int tmp = dq.pollFirst();
				res.offerLast(tmp);
			}

		}
		for(int integer : res){
			System.out.print(integer + " ");
		}
	}
}
