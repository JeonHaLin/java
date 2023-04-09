import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply_Error {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n = scan.nextInt();
				int m = scan.nextInt();
				System.out.print(n + "X" + m + "=" + n * m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scan.nextLine();
				continue;
			}
		}
		scan.close();
	}
}
