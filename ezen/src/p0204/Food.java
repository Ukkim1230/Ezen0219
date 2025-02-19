package p0204;

public class Food {

	int price;
	String name;
	public String toString() {
		return "가격 : " + price + ", 이름 : " + name;
	}
	public static void main(String[] args) {
		Food f = new Food();
		f.name = "참치김밥";
		f.price = 5000;
		System.out.println(f);
	}
}
