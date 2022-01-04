import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ4641 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true){
			int res = 0;
			String stringInput = sc.nextLine();
			if (stringInput.equals("-1")){
				return ;
			}
			List<String> lst = Arrays.asList(stringInput.split(" "));
			List<Integer> intLst = new ArrayList<>();
			for (int i = 0; i < lst.size(); i++) {
				intLst.add(Integer.parseInt(lst.get(i)));
			}

			intLst.remove(intLst.size()-1);
			for (int i = 0; i < intLst.size(); i++) {
				if(intLst.contains(intLst.get(i) * 2)){
					res += 1;
				}
			}
			System.out.println(res);
		}
	}
}
