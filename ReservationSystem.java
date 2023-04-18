import java.util.InputMismatchException;
import java.util.Scanner;
class OperateSystem{
    public OperateSystem(){}
    String[][]arr=new String[3][11];
    public void clearSeats(){
        arr[0][0] = "S";
        arr[1][0] = "A";
        arr[2][0] = "B";
        for (int i = 0; i < 3; i++){
            for (int j = 1; j < 11; j++){
                arr[i][j] = "---";
            }
        }
    }
    public void addPerson(int seatType, String name, int seatNum){
        arr[seatType-1][seatNum] = name;
    }
    public void delPerson(String name, int seatType){
        for (int i = 1; i < 11; i++){
            if (arr[seatType-1][i].equals(name)) {
                arr[seatType - 1][i] = "---";
            }
        }
    }

    public void showSeats(int seatType){
        for (int i = 0; i < 11; i++){
            System.out.print(arr[seatType-1][i]+" ");
        }
        System.out.println();
    }

    public void showAll(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 11; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("<<<조회를 완료하였습니다>>>");
    }
}

public class ReservationSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        OperateSystem os = new OperateSystem();

        os.clearSeats();

        System.out.println("명품콘서트홀 예약 시스템입니다.");
        try {
            while (true) {
                System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
                int menu = scan.nextInt();

                switch (menu){
                    case 1:{
                        System.out.print("좌석구분 S(1), A(2), B(3)>>");
                        int seatType = scan.nextInt();
                        os.showSeats(seatType);

                        System.out.print("이름>>");
                        String name = scan.next();

                        System.out.print("번호>>");
                        int seatNum = scan.nextInt();
                        os.addPerson(seatType, name, seatNum);
                        break;
                    }
                    case 2:{
                        os.showAll();
                        break;
                    }
                    case 3:{
                        System.out.print("좌석 S:1, A:2, B:3>>");
                        int seatType = scan.nextInt();
                        os.showSeats(seatType);

                        System.out.print("이름>>");
                        String name = scan.next();
                        os.delPerson(name, seatType);
                        break;
                    }
                    case 4:
                        System.exit(0);
                    default:{
                        System.out.println("잘못된 접근입니다.");
                        System.out.println("시스템을 종료합니다.");
                        System.exit(0);
                    }
                }
            }
        }
        catch(InputMismatchException e){
            System.out.println("잘못된 접근입니다.");
            System.out.println("시스템을 종료합니다.");
            System.exit(0);
        }
        finally {
            scan.close();
        }
    }
}
/*
예외처리만 하면 됨!!!!
1. 메인 메뉴에서 1~4 아닌 숫자 입력할 때
2. 좌석 타입에서 1~3 아닌 숫자 입력할 때
3. 번호에서 1~10 아닌 숫자 입력할 때
 */

