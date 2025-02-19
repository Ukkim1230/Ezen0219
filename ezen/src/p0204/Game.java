package p0204;

public class Game {

	public int price;
	public String name;
	public String vendor;
	
	@Override
	public String toString() {
		return "Game [price=" + price + ", name=" + name + ", vendor=" + vendor + "]";
	}

	public static void main(String[] args) {
		// price 14000, name 삼국지, vendor KOEI
		// 값을 가진 객체를 하나 생성하고
		// System.out.println(객체)를 출력했을때
		// 메모리 주소가 아니라 각 값을 출력하는 코드를 완성해주세요.
		Game g = new Game();
		g.price = 14000;
		g.name = "삼국지";
		g.vendor = "KOEI";
		System.out.println(g);
	}
}
