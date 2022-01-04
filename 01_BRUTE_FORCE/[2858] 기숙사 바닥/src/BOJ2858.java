import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ2858 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int area = a + b;
		int i = 1;

		List<Integer> divisors = new ArrayList<>();
		List<Integer> results = new ArrayList<>();
		while (i < area / 2){
			if (area % i == 0 && i >= 3){
				divisors.add(i);
			}
			i++;
		}

		for (int j = 0; j < divisors.size() ; j++) {
			int num = divisors.get(j);
			int secondNum = area / num;

			if( (num - 2) * (secondNum - 2) == b){
				results.add(num);
				results.add(secondNum);
			}
		}
		System.out.print(results.get(results.size()-2) + " ");
		System.out.println(results.get(results.size()-1));
	}
}
