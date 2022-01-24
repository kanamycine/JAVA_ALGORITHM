import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BOJ10825 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> studentLst = new ArrayList<>();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			Student tmp = new Student(name, kor, eng, mat);
			studentLst.add(tmp);
		}

		Collections.sort(studentLst, MyComparator);

		for (int i = 0; i < studentLst.size(); i++) {
			System.out.println(studentLst.get(i).name);
		}
	}

	public static Comparator<Student> MyComparator = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			if (o1.kor < o2.kor) {
				return 1;
			}
			else if (o1.kor == o2.kor) {
				if (o1.eng > o2.eng) {
					return 1;
				} else if (o1.eng == o2.eng) {
					if (o1.mat < o2.mat) {
						return 1;
					}
					else if(o1.mat == o2.mat){
						if (o1.name.compareTo(o2.name) > 0){
							return 1;
						}
					}
				}
			}
			return -1;
		}
	};
}

class Student {
	String name;
	int kor;
	int eng;
	int mat;

	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}
}
