import java.util.InputMismatchException;
import java.util.Scanner;
class OperateSystem{
    public OperateSystem(){}
    String[][]arr=new String[3][11];
    public void clearSeats(){   // reset seats
        arr[0][0] = "S";
        arr[1][0] = "A";
        arr[2][0] = "B";
        for (int i = 0; i < 3; i++){
            for (int j = 1; j < 11; j++){
                arr[i][j] = "---";
            }
        }
    }
    public int inputSeatNum(int seatType){   // input seat number
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("번호>>");
            int seatNum = scan.nextInt();
            if(seatNum < 1 || seatNum > 10){
                System.out.println("잘못된 접근입니다. 다시 입력하세요.");
                continue;
            }
            if (alreadyReserved(seatType, seatNum)){
                return 0;
            }

            else return seatNum;
        }
    }

    public int inputSeatType(){   //input seat type
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.print("좌석구분 S(1), A(2), B(3)>>");
            int seatType = scan.nextInt();

            if (seatType<1||seatType>3){
                System.out.println("잘못된 접근입니다. 다시 입력하세요.");
            }
            else return seatType;
        }
    }
    public void addPerson(int seatType, String name, int seatNum){  // add name
        arr[seatType-1][seatNum] = name;
    }
    public void delPerson(String name, int seatType){   // remove name
        for (int i = 1; i < 11; i++){
            if (arr[seatType-1][i].equals(name)) {
                arr[seatType - 1][i] = "---";
            }
        }
    }

    public void showSeats(int seatType){    // output the type of seats
        for (int i = 0; i < 11; i++){
            System.out.print(arr[seatType-1][i]+" ");
        }
        System.out.println();
    }

    public void showAll(){  // output every seats
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 11; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("<<<조회를 완료하였습니다>>>");
    }

    public boolean isEmpty(int seatType){   // if the type of seats are empty
        int temp = 0;
        for (int i = 1; i < 11; i++){
            if (arr[seatType-1][i].equals("---"))
                temp++;
        }
        return temp == 10;
    }

    public boolean isFull(int seatType){    // if the type of seats are full
        int temp = 0;
        for (int i = 1; i < 11; i++){
            if (arr[seatType-1][i].equals("---"))
                temp++;
        }
        return temp == 0;
    }
    public boolean isThere(int seatType, String name){  // if there is the name
        // if there's the name in the type of seats. 
        int temp = 0;
        for (int i = 1; i < 11; i++){
            if (arr[seatType-1][i].equals(name))
                temp++;
        }
        return temp != 0;
    }
    public boolean alreadyReserved(int seatType, int seatNum){
        // if the seat is already booked
        return !arr[seatType-1][seatNum].equals("---");
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

                switch (menu) {
                    case 1: {    // reservation
                        int seatType = os.inputSeatType();
                        os.showSeats(seatType);

                        System.out.print("이름>>");
                        String name = scan.next();
                        int seatNum = os.inputSeatNum(seatType);

                        if (seatNum == 0) {
                            System.out.println("이미 매진된 좌석입니다.");
                            System.out.println("메인 메뉴로 돌아갑니다.");
                            break;
                        }
                        if (os.isFull(seatType)) {
                            System.out.println("전 석 매진입니다.");
                            System.out.println("메인메뉴로 돌아갑니다.");
                            break;
                        }

                        os.addPerson(seatType, name, seatNum);
                        break;
                    }
                    case 2: {    // check
                        os.showAll();
                        break;
                    }
                    case 3: {    // cancel
                        int seatType = os.inputSeatType();
                        os.showSeats(seatType);

                        if (os.isEmpty(seatType)) {
                            System.out.println("취소할 수 있는 좌석이 없습니다.");
                            System.out.println("메인메뉴로 돌아갑니다.");
                            break;
                        }

                        System.out.print("이름>>");
                        String name = scan.next();

                        if (!os.isThere(seatType, name)) {
                            System.out.println("해당 이름이 없습니다.");
                            System.out.println("메인 메뉴로 돌아갑니다.");
                        }
                        os.delPerson(name, seatType);
                        break;
                    }
                    case 4: { // terminate the system
                        System.exit(0);
                    }
                    default:{
                        System.out.println("잘못된 접근입니다. 다시 입력하세요.");
                        break;
                    }
                }
            }
        }
        catch(InputMismatchException e){    //if there's input of wrong type  
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
v 1. 메인 메뉴에서 1~4 아닌 숫자 입력할 때 >> 잘못된 접근입니다.
v 2. 좌석 타입에서 1~3 아닌 숫자 입력할 때 >> 잘못된 접근입니다.
v 3. 번호에서 1~10 아닌 숫자 입력할 때 >> 잘못된 접근입니다.
v 4. 빈 열에 뭔가를 취소하려고 할때 >> 좌석이 모두 비어있습니다.
v 5. 이름이 없을 때>> 예약 내역이 없습니다.
v 6. 열에 모든 좌석이 예약되어 있는데 더 예약하려 할 때 >> 매진입니다.
종료하면 안되고 retry 하도록 해야함!!!!!!!!!!!
 */
