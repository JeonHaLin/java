import java.util.Scanner;
import java.util.InputMismatchException;
public class MutlipleOfThree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		int arr[];
		arr = new int[10];
		for (int i = 0; i < 10; i++) {
			try {
				arr[i] = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("정수가 아닙니다! 다시 입력하세요!");
				scan.nextLine();
				continue;
			}
		}
		System.out.print("3의 배수는 ");
		for (int j = 0; j < 10; j++) {
			if (arr[j] % 3 == 0)
				System.out.print(arr[j]+" ");
		}
		System.out.println();
		scan.close();
	}
}
