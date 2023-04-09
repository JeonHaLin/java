import java.util.Scanner;
public class MakePairs {
	public static int boolName(String name) {
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		for (int i=0;i<course.length;i++) {
			if(name.equals(course[i])) {
				return i;
			}
			else if(name.equals("그만")) {
				return -2;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int score[] = { 95, 88, 76, 62, 55 };
		while (true) {
			System.out.print("과목 이름>>");
			String name=scan.nextLine();
			if(MakePairs.boolName(name)==-1) {
				System.out.println("없는 과목입니다.");
				continue;
			}
			else if(MakePairs.boolName(name)==-2) {
				scan.close();
				return;
			}
			else {
				System.out.println(name+"의 점수는 "+score[boolName(name)]);
			}
		}
	}
}
