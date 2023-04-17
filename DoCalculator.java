import java.util.InputMismatchException;
import java.util.Scanner;

class Add{
    int a, b;
    public Add(){}
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a + b;
    }
}
class Sub{
    int a, b;
    public Sub(){}
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a - b;
    }
}
class Mul{
    int a, b;
    public Mul(){}
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a * b;
    }
}
class Div{
    int a, b;
    public Div(){}
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a / b;
    }
}

public class DoCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오>>");
        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            String c = scan.next();

            switch (c) {
                case "+": {
                    Add addNum = new Add();
                    addNum.setValue(a, b);
                    int answer = addNum.calculate();
                    System.out.println(answer);
                    break;
                }
                case "-": {
                    Sub subNum = new Sub();
                    subNum.setValue(a, b);
                    int answer = subNum.calculate();
                    System.out.println(answer);
                    break;
                }
                case "*": {
                    Mul mulNum = new Mul();
                    mulNum.setValue(a, b);
                    int answer = mulNum.calculate();
                    System.out.println(answer);
                    break;
                }
                case "/": {
                    if(b==0){
                        System.out.println("0으로는 나눌 수 없습니다.");
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }
                    Div divNum = new Div();
                    divNum.setValue(a, b);
                    int answer = divNum.calculate();
                    System.out.println(answer);
                    break;
                }
                default:
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        }
        catch(InputMismatchException e){
            System.out.println("잘못된 입력입니다.");
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
    }
}
