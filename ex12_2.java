import java.util.Scanner;

public class ex12_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산>>");
		int x = scanner.nextInt();
		String s = scanner.next();
		int y = scanner.nextInt();
		
		switch(s) {
		case "+": System.out.println(x+"+"+y+"의 계산 결과는 "+ (x+y));break;
		case "-": System.out.println(x+"-"+y+"의 계산 결과는 "+ (x-y));break;
		case "*": System.out.println(x+"*"+y+"의 계산 결과는 "+ (x*y));break;
		case "/":
			if (y==0) // 0으로 나누려고 할 때의 예외처리
				{System.out.println("0으로 나눌 수 없습니다.");break;} 
			else
				{System.out.println(x+"/"+y+"의 계산 결과는 "+ (x/y));break;}
		}
		
		scanner.close();

	}

}
