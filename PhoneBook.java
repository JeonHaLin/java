import java.util.InputMismatchException;
import java.util.Scanner;

class OperatingPhoneBook {
    public int inputNum() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("인원수>>");
            int num = scan.nextInt();
            if (num <= 0) {
                System.out.println("0 이하의 정수는 입력할 수 없습니다.");
            } else return num;
        }
    }
}
class Phone{
    String name, tel;

    public Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }

}
public class PhoneBook {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            OperatingPhoneBook op = new OperatingPhoneBook();
            int num = op.inputNum();

            Phone[] myPhone = new Phone[num];
            for (int i = 0; i < num; i++) {
                System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
                String name = scan.next();
                String tel = scan.next();
                myPhone[i] = new Phone(name, tel);
            }

            System.out.println("저장되었습니다...");

            while (true) {
                System.out.print("검색할 이름>>");
                String data = scan.next();
                int index = -1;
                for (int i = 0; i < myPhone.length; i++) {
                    if (data.equals(myPhone[i].name))
                        index = i;
                }
                if (data.equals("그만")) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                if (index == -1) {
                    System.out.println(data + " 이(가) 없습니다.");
                } else {
                    System.out.println(data + "의 번호는 " + myPhone[index].tel + "입니다.");
                }

            }
        }
        catch(InputMismatchException e){
            System.out.println("잘못된 접근입니다.");
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
    }
}
/*
1. 인원수에 양의 정수만 입력
2. 인원수에 0을 입력하면 프로그램 종료
3. 문자열이 아닌 데이터 입력
 */
