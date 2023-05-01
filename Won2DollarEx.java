package no3;

import java.util.*;

abstract class Convert{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Convert " + getSrcString() + " into " + getDestString());
			System.out.print("Insert " + getSrcString() + " >> ");
			double val = scan.nextDouble();
			double res = convert(val);
			System.out.println("Result: " + res + getDestString());
			scan.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Wrong input! Exit the system.");
			System.exit(0);
		}
	}
}
class Won2Dollar extends Convert{
	protected String srcString = "Won";
	protected String destString = "Dollar";
	protected double ratio;
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src / ratio;
	}
	protected String getSrcString() { return srcString; }
	protected String getDestString() { return destString; }

}

public class Won2DollarEx {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}
