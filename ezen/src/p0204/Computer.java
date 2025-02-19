package p0204;

public class Computer {

	public String cpu;
	public String ram;
	public String ssd;
	public int price;
	
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", ssd=" + ssd + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// cpu i7-13 ram 16GB ssd 2T price 1100000
		// 위의 값으로 객체를 만들고 출력했을때 각 값이 나오는 코드를 완성해주세요.
		Computer c = new Computer();
		c.cpu = "I7-13";
		c.ram = "16GB";
		c.ssd = "2T";
		c.price  = 1100000;
		System.out.println(c);
	}
}
