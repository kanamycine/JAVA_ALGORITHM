import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String res = "YES";
		for (int i = 0; i < n; i++) {
			Stack<String> stk = new Stack<>();
			String[] arr = br.readLine().split("");
			for (int j = 0; j < arr.length; j++) {

				if(arr[j].equals("(")) {
					stk.push(arr[j]);
				}
				else{
					if (stk.size() == 0) {
						stk.push("end");
						break;
					}
					else{
						stk.pop();
					}
					}
				}
				if(stk.size() == 0){
					System.out.println("YES");
				}
				else
					System.out.println("NO");

		}
	}
}
