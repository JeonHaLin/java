import java.util.InputMismatchException;
import java.util.Scanner;

class Add{
    long a, b;
    public Add(){}
    public void setValue(long a, long b){
        this.a = a;
        this.b = b;
    }
    public long calculate(){
        return a + b;
    }
}
class Sub{
    long a, b;
    public Sub(){}
    public void setValue(long a, long b){
        this.a = a;
        this.b = b;
    }
    public long calculate(){
        return a - b;
    }
}
class Mul{
    long a, b;
    public Mul(){}
    public void setValue(long a, long b){
        this.a = a;
        this.b = b;
    }
    public long calculate(){
        return a * b;
    }
}
class Div{
    long a, b;
    public Div(){}
    public void setValue(long a, long b){
        this.a = a;
        this.b = b;
    }
    public long calculate() {
        return a / b;
    }
}

public class DoCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오>>");
        try {
            long a = scan.nextInt();
            long b = scan.nextInt();
            String c = scan.next();

            switch (c) {
                case "+": {
                    Add addNum = new Add();
                    addNum.setValue(a, b);
                    long answer = addNum.calculate();
                    System.out.println(answer);
                    break;
                }
                case "-": {
                    Sub subNum = new Sub();
                    subNum.setValue(a, b);
                    long answer = subNum.calculate();
                    System.out.println(answer);
                    break;
                }
                case "*": {
                    Mul mulNum = new Mul();
                    mulNum.setValue(a, b);
                    long answer = mulNum.calculate();
                    System.out.println(answer);
                    break;
                }
                case "/": {
                    Div divNum = new Div();
                    divNum.setValue(a, b);
                    long answer = divNum.calculate();
                    System.out.println(answer);
                    break;
                }
                default:
                    throw new IllegalArgumentException("잘못된 입력입니다.");
            }
        }
        catch(InputMismatchException e){
            System.out.println("정수와 사칙연산 연산자만 입력할 수 있습니다.");
        }
        catch(ArithmeticException e){
            System.out.println("0으로는 나눌 수 없습니다.");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
                scan.close();
        }
    }
}
