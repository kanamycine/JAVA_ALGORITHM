import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class BOJ13335 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String [] arr = str.split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int k = Integer.parseInt(arr[2]);

		int [] trucks = new int [n];
		str = br.readLine();
		arr = str.split(" ");

		for (int i = 0; i < n; i++) {
			trucks[i] = Integer.parseInt(arr[i]);
		}

		Queue<Integer> bridge = new ArrayDeque<>();

		for (int i = 0; i < m-1; i++) {
			bridge.add(0);
		}
		int currentWeights = trucks[0];
		bridge.add(currentWeights);

		int idx = 1;
		int ans = 1;

		while (!bridge.isEmpty()){
			ans++;
			int truck = bridge.poll();
			currentWeights -= truck;
			if(idx < trucks.length){
				if(currentWeights + trucks[idx] <= k){
					currentWeights += trucks[idx];
					bridge.add(trucks[idx++]);
				}
				else{
					bridge.add(0);
				}
			}
		}
		System.out.println(ans);
	}
}
