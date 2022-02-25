import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ3190 {

	static int n;
	static int[][] arr;
	static Map<Integer, String> cmd;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int dir = 1; //뱀의 최초 머리 방향 설정 (오른쪽)

	private static class Location {
		public int x;
		public int y;

		Location(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());

		arr = new int[n + 1][n + 1];
		cmd = new HashMap<>();

		for (int i = 0; i < k; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
		}

		int commandCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < commandCount; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int time = Integer.parseInt(st.nextToken());
			String direction = st.nextToken();
			cmd.put(time, direction);
		}
		run();
	}

	static void run() {
		Deque<Location> snake = new ArrayDeque<>();
		snake.add(new Location(1, 1));
		arr[1][1] = -1;
		int time = 0;

		while (true) {
			if (cmd.containsKey(time)) {
				dir = (cmd.get(time).equals("D")) ? (dir + 1) % 4 : (dir + 3) % 4;
			}

			time++;
			Location head = snake.getFirst();
			int nx = head.x + dx[dir];
			int ny = head.y + dy[dir];

			if (nx <= 0 || nx > n || ny <= 0 || ny > n) {
				break;
			}

			if (arr[nx][ny] == -1) {
				break;
			}

			if (arr[nx][ny] == 1) {
				arr[nx][ny] = -1;
				snake.offerFirst(new Location(nx, ny));
			}
			else {
				arr[nx][ny] = -1;
				snake.offerFirst(new Location(nx, ny));
				Location tail = snake.peekLast();
				arr[tail.x][tail.y] = 0;
				snake.pollLast();
			}
		}
		System.out.println(time);
	}
}
