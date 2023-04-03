import java.util.Scanner;

public class ex12_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner_1 = new Scanner(System.in);
		
		System.out.print("연산>>");
		int x = scanner.nextInt();
		String s = scanner.next();
		int y = scanner.nextInt();
		
		if(s.equals("+"))
			System.out.println(x+"+"+y+"의 계산 결과는 "+ (x+y));
		else if(s.equals("-"))
			System.out.println(x+"-"+y+"의 계산 결과는 "+ (x-y));
		else if(s.equals("*"))
			System.out.println(x+"*"+y+"의 계산 결과는 "+ (x*y));
		else if(s.equals("/")) {
			if (y==0)		// 0으로 나누려고 할 때의 예외처리
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(x+"/"+y+"의 계산 결과는 "+ (x/y));
		}
		
		scanner.close();
		scanner_1.close();

	}

}
