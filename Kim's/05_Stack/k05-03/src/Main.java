import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		Stack [] arr = new Stack[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Stack<Integer>();
		}

		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String [] str =s.split(" ");
			for (int j = 0; j < n; j++) {
				if(!(str[j].equals("0"))) {
					arr[j].push(str[j]);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			Collections.reverse(arr[i]);
		}

		int answer = 0;
		Stack<Object> answerStack = new Stack<>();
		int m = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		int [] ints = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		for (int i = 0; i < m; i++) {
			if(arr[ints[i] - 1].isEmpty()){
				continue;
			}
			else if (!(answerStack.isEmpty()) && arr[ints[i] - 1].peek().equals(answerStack.peek())){
				answer +=2;
				arr[ints[i] - 1].pop();
				answerStack.pop();
			}
			else {
				answerStack.push(arr[ints[i] - 1].pop());
			}

		}
		System.out.println(answer);

	}
}
