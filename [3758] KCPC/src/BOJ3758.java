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
				teamLst.add(new Team(j+1));
			}

			int[][] score_board = new int[tn + 1][pn + 1];

			for (int j = 0; j < logN; j++) {
				Question tmp = new Question(sc.nextInt(), sc.nextInt(), sc.nextInt());
				allQ.add(tmp);
			}
			// 마지막 제출 순서 계산 로직
			int tmpChekSubmitSequence = 1;
			for (int j = allQ.size()-1; j >= 0; j--){
				if(teamLst.get((allQ.get(j).id)-1).lastSubmit == 0){
					teamLst.get((allQ.get(j).id)-1).lastSubmit = tmpChekSubmitSequence;
				}
				else{
					continue;
				}
				tmpChekSubmitSequence += 1;
			}

			// for (int j = 0; j < teamLst.size(); j++) {
			// 	System.out.println("lastSubmit " + teamLst.get(j).lastSubmit);
			// }

			Collections.sort(allQ, compare);

			// 제출 횟수 카운팅 후 팀 객체에 업데이트
			for (int j = 0; j < allQ.size() ; j++) {
				teamLst.get(allQ.get(j).id -1).countSubmit += 1;
			}

			// for (int j = 0; j < teamLst.size(); j++) {
			// 	System.out.println("team Count Submit : " + teamLst.get(j).countSubmit);
			// }

			// for (int j = 0; j < allQ.size(); j++) {
			// 	System.out.print(allQ.get(j).id + " ");
			// 	System.out.print(allQ.get(j).problemNumber + " ");
			// 	System.out.println(allQ.get(j).score);
			// }

			//가장 높은 수를 뽑아낸다.
			for (int j = 1; j < tn + 1; j++) {
				for (int k = 1; k < pn + 1; k++) {
					for (int l = 0; l < allQ.size(); l++) {
						if (j == allQ.get(l).id && k == allQ.get(l).problemNumber) {
							score_board[j][k] = allQ.get(l).score;
							break;
						}
					}
				}
			}

			// for (int k = 1; k < tn + 1; k++) {
			// 	for (int l = 1; l < pn + 1; l++) {
			// 		System.out.println("tn : " + k + " pn : " + l + " score " + score_board[k][l]);
			// 	}
			// }

			//팀 스코어 정산 후 팀 객체에 업데이트
			for (int j = 1; j < tn+1; j++) {
				for (int k = 1; k < pn+1; k++) {
					teamLst.get(j-1).score += score_board[j][k];
				}
			}

			// for (int j = 0; j < teamLst.size(); j++) {
			// 	System.out.println(j+1 + " team score" + teamLst.get(j).score);
			// }

			Collections.sort(teamLst, compare2);

			// for (int j = 0; j < teamLst.size(); j++) {
			// 	System.out.println(teamLst.get(j).id);
			// }


			int rescnt = 1;
			for (int j = 0; j < teamLst.size(); j++) {
				if(id == teamLst.get(j).id){
					System.out.println(rescnt);
					break;
				}
				else{
					rescnt += 1;
				}
			}
		}
	}

	public static Comparator<Question> compare = new Comparator<Question>() {
		@Override
		public int compare(Question o1, Question o2) {
			if (o1.id > o2.id) {
				return 1;
			} else if (o1.id == o2.id) {
				if (o1.problemNumber > o2.problemNumber) {
					return 1;
				} else if (o1.problemNumber == o2.problemNumber) {
					if(o1.score < o2.score)
						return 1;
				}
			}
			return -1;
		}
	};

	public static Comparator<Team> compare2 = new Comparator<Team>() {
		@Override
		public int compare(Team o1, Team o2) {
			if (o1.score < o2.score) {
				return 1;
			} else if (o1.score == o2.score) {
				if (o1.countSubmit > o2.countSubmit) {
					return 1;
				} else if (o1.countSubmit == o2.countSubmit) {
					if(o1.lastSubmit < o2.lastSubmit)
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

class Team{
	int id;
	int countSubmit;
	int lastSubmit;
	int rank;
	int score;

	public Team(int id){
		this.id = id;
		countSubmit = 0;
		lastSubmit = 0;
		rank = 0;
		score = 0;
	}
}