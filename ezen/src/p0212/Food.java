package p0212;

public class Food {
	private String name;
	private int price;
	private String type;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public String toString() {
		return "[name=" + name + ",price=" + price + ",type=" + type + "]";
	}
	/*
	 *  String 이름(name), int 가격(price), String 분류(type)
	 *  해당 변수를 private으로 선언하고
	 *  public 으로 getter, setter 메서드를 생성
	 *  toString을 오버라이딩하여 각 값이 나오는 클래스를 생성
	 */
}
