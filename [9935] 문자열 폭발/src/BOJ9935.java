import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.lang.String;


public class BOJ9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String bomb = br.readLine();
		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			stk.push(str.charAt(i));

			if (stk.size() >= bomb.length()){
				boolean flag = true;
				for (int j = 0; j < bomb.length(); j++) {
					if(stk.get(stk.size() - bomb.length() + j) != bomb.charAt(j)) {
						flag = false;
						break;
					}
				}
				if(flag){
					for (int j = 0; j < bomb.length(); j++) {
						stk.pop();
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		if(stk.size() == 0){
			System.out.println("FRULA");
			return;
		}
		for(char c : stk){
			sb.append(c);
		}
		System.out.println(sb);
	}
}
