package no4;

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
class Km2Mile extends Convert{
	protected String srcString = "Km";
	protected String destString = "Mile";
	protected double ratio;
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src / ratio;
	}
	protected String getSrcString() { return srcString; }
	protected String getDestString() { return destString; }

}

public class Km2MileEx {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
