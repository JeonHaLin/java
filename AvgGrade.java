import java.util.InputMismatchException;
import java.util.Scanner;

class Grade {

    private int math, science, english;

    public Grade() {}

    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int[] getGrade() {
        int [] temp = new int[3];
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                this.math = scan.nextInt();
                this.science = scan.nextInt();
                this.english = scan.nextInt();
                if (this.math < 0 || this.science < 0 || this.english < 0) {
                    System.out.println("0 이상의 정수만 입력 가능합니다.");
                    System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
                } else {
                    temp[0] = this.math;
                    temp[1] = this.science;
                    temp[2] = this.english;
                    return temp;
                }
            } catch (InputMismatchException e) {
                System.out.println("정수만 입력 가능한 프로그램입니다.");
                System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
                scan.next();
            }
        }
    }

    public int average() {
        return (this.math + this.science + this.english) / 3;
    }

}

public class AvgGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        Grade scanGrade = new Grade();

        int[] tempGrade = scanGrade.getGrade();

        Grade myGrade = new Grade(tempGrade[0], tempGrade[1], tempGrade[2]);
        System.out.println("평균은 " + myGrade.average());

        scan.close();
    }
}
/*
1. 과목 점수에 음의 정수가 입력될 때
2. 과목 점수에 정수가 아닌 데이터가 입력될 때
 */
