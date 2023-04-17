import java.util.InputMismatchException;
import java.util.Scanner;

class Circle{
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
}

public class CircleManager {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Circle [] c = new Circle[3];
        for (int i = 0; i < 3; i++){
            try {
                System.out.print("x, y, radius >>");
                double x = scan.nextDouble();
                double y = scan.nextDouble();
                int radius = scan.nextInt();
                c[i] = new Circle(x, y, radius);
            }
            catch(InputMismatchException e){
                System.out.println("잘못된 입력입니다.");
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
        }
        for (int i = 0; i < c.length; i++){
            c[i].show();
        }
        scan.close();
    }
}
