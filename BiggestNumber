import java.util.*;

class BigNum {
	Scanner scan = new Scanner(System.in);
	int[] input_num = new int[5];

	public void inputNum() {
		try {
			for (int i = 0; i < 5; i++) {
				this.input_num[i] = scan.nextInt();
				if (this.input_num[i] <= 0) {
					throw new IllegalArgumentException("wrong range of input!");
				}
			}
		}
		catch(InputMismatchException e){
			System.out.println("wrong type of input.");
			System.exit(0);
		}
		finally {
			scan.close();
		}
	}

	public int compareNum() {
		int temp = 0;
		for (int j = 0; j < 4; j++) {
			if (input_num[j] > input_num[j + 1])
				temp = input_num[j];
			else
				temp = input_num[j + 1];
		}
		return temp;
	}
}

public class BiggestNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigNum an = new BigNum();

		System.out.println("input 5 int.");
		an.inputNum();
		System.out.println("the biggest number is " + an.compareNum());
	}
}
