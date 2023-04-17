import java.util.InputMismatchException;
import java.util.Scanner;

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
            System.out.print("인원수>>");
            int num = scan.nextInt();
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
검색할 이름에 숫자가 들어가면 오류?
아니 이걸 메소드로 다 만들으라고??? 갈아 엎어???
 */
