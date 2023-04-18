import java.util.InputMismatchException;
import java.util.Scanner;

class Circle{
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;       // x, y, radius 초기화
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
}

public class CircleManager {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Circle [] c = new Circle[3];        // 3개의 배열 선언
        for (int i = 0; i < 3; i++){
            try {
                System.out.print("x, y, radius >>");
                double x = scan.nextDouble();   // x값 읽기
                double y = scan.nextDouble();   // y값 읽기
                int radius = scan.nextInt();    // 반지름 읽기
                if (radius <= 0){
                    System.out.println("반지름은 양의 정수여야 합니다.");
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                c[i] = new Circle(x, y, radius);    //Circle 객체 생성
            }
            catch(InputMismatchException e){
                System.out.println("잘못된 입력입니다.");
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
        }
        for (int i = 0; i < c.length; i++){     // 모든 Circle 객체 출력
            c[i].show();
        }
        scan.close();
    }
}
/*
1. 반지름에 음수가 입력됐을 때
2. 정수가 아닌 데이터가 입력됐을 때
 */
