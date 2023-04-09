import java.util.Random;
public class Random2Darray {
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		Random rand=new Random();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				arr[i][j]=rand.nextInt(1,10);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
