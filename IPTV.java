package no2;

class TV{
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}
class ColorTV extends TV{
	public int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.print("myTV: ");
		System.out.print("the size is  ");
		System.out.print(getSize());
		System.out.print(", the color is ");
		System.out.println(color);
	}
}
class IPTV extends ColorTV{
	public String IP;
	public IPTV(String IP, int size, int color) {
		super(size, color);
		this.IP = IP;
	}
	@Override
	public void printProperty() {
		System.out.print("myIPTV: ");
		System.out.print("the adress is " + IP);
		System.out.print(", the size is  ");
		System.out.print(getSize());
		System.out.print(", the color is ");
		System.out.println(color);
	}
}
public class IPTVEx {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
