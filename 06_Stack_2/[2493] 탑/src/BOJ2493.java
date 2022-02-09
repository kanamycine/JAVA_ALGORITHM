import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ2493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stk = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n+1];
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for(int i = 1 ; i <= n ; i++) arr[i] = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= n; i++){
			if (stk.empty()){
				sb.append(0 + " ");
				stk.add(i);
			}
			else {
				int now = arr[i];
				while(!stk.empty() && arr[stk.peek()] < now){
					stk.pop();
				}
				if(stk.empty()){
					sb.append(0 + " ");
					stk.add(i);
				} else {
					sb.append(stk.peek() + " ");
					stk.add(i);
				}
			}
		}
		System.out.println(sb);
	}
}
