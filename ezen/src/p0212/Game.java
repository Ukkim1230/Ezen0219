package p0212;

public class Game {
	private String name;
	private int price;
	private String genre;
	//getter,setter,toString
	
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
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	public String toString() {
		return "[name=" + name + ",price=" + price + ",genre=" + genre + "]";
	}
	
	public static void main(String[] args) {
		
	}

}
