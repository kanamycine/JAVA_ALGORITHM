import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BOJ3758 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			//팀수
			int tn = sc.nextInt();
			//문제수
			int pn = sc.nextInt();
			//내팀
			int id = sc.nextInt();
			//로그수
			int logN = sc.nextInt();
			List<Question> allQ = new ArrayList<>();
			List<Team> teamLst = new ArrayList<>();

			for (int j = 0; j < tn; j++) {
				teamLst.add(new Team(j + 1));
			}

			int[][] score_board = new int[tn + 1][pn + 1];

			for (int j = 0; j < logN; j++) {
				Question tmp = new Question(sc.nextInt(), sc.nextInt(), sc.nextInt());
				allQ.add(tmp);
			}

			// 제출 횟수 카운팅, 팀 객체 업데이트, 최대값 뽑기.
			for (int j = 0; j < allQ.size(); j++) {
				teamLst.get(allQ.get(j).id - 1).countSubmit += 1;
				if (score_board[allQ.get(j).id][allQ.get(j).problemNumber] < allQ.get(j).score) {
					score_board[allQ.get(j).id][allQ.get(j).problemNumber] = allQ.get(j).score;
				}
				teamLst.get(allQ.get(j).id - 1).lastSubmit = j;
			}

			//팀 스코어 정산 후 팀 객체에 업데이트
			for (int j = 1; j < tn + 1; j++) {
				for (int k = 1; k < pn + 1; k++) {
					teamLst.get(j - 1).score += score_board[j][k];
				}
			}

			Collections.sort(teamLst, compare2);
			int idx = 0;
			int score = 0;
			for (int j = 0; j < teamLst.size(); j++) {
				if(teamLst.get(j).id == id){
					idx = j;
					score = teamLst.get(j).score;
					break;
				}
			}

			int res = 1;
			for (int j = 0; j < idx; j++) {
				if(teamLst.get(j).score >= score){
					res+=1;
				}
			}
			// System.out.println(idx);
			System.out.println(res);
		}
	}

	public static Comparator<Team> compare2 = new Comparator<Team>() {
		@Override
		public int compare(Team o1, Team o2) {
			if (o1.score < o2.score) {
				return 1;
			} else if (o1.score == o2.score) {
				if (o1.countSubmit > o2.countSubmit) {
					return 1;
				} else if (o1.countSubmit == o2.countSubmit) {
					if (o1.lastSubmit > o2.lastSubmit)
						return 1;
				}
			}
			return -1;
		}
	};
}

class Question {
	int id;
	int problemNumber;
	int score;

	public Question(int id, int problemNumber, int score) {
		this.id = id;
		this.problemNumber = problemNumber;
		this.score = score;
	}
}

class Team {
	int id;
	int countSubmit;
	int lastSubmit;
	// int rank;
	int score;

	public Team(int id) {
		this.id = id;
		countSubmit = 0;
		lastSubmit = 0;
		// rank = 0;
		score = 0;
	}
}



