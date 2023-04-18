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

    public int getGrade() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                int theGrade = scan.nextInt();
                if (theGrade < 0) {
                    System.out.println("0 이상의 정수만 입력 가능합니다.");
                    System.out.print("해당 과목의 점수를 다시 입력하세요>> ");
                } else {
                    return theGrade;
                }
            } catch (InputMismatchException e) {
                System.out.println("정수만 입력 가능한 프로그램입니다.");
                System.out.print("해당 과목의 점수를 다시 입력하세요>> ");
                scan.next();
            }
        }
    }

    public int average() {
        return (math + science + english) / 3;
    }

}

public class AvgGrade{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
        Grade scanGrade = new Grade();
        try {
            int math = scanGrade.getGrade();
            int science = scanGrade.getGrade();
            int english = scanGrade.getGrade();
            //

            Grade myGrade = new Grade (math, science, english);
            System.out.println("평균은 " + myGrade.average());

            scan.close();
        }
        catch(InputMismatchException e){
            System.out.println("정수만 입력 가능한 프로그램입니다.");
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }

    }
}
