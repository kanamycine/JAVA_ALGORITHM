import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int index;
	int priority;

	public Person(int index, int priority) {
		this.index = index;
		this.priority = priority;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Queue<Person> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.offer(new Person(i, arr[i]));
		}
		int answer = 0;
		while (!q.isEmpty()) {
			Person tmp = q.poll();
			for (Person x : q) {
				if (x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}

			if (tmp != null) {
				answer++;
				if (tmp.index == m) {
					System.out.println(answer);
					return;
				}
			}
		}

	}
}
