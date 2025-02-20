package p0220;

public class FoodInfoVO {
	private int finum;
	private String fiName;
	private int fiPrice;
	public int getNum() {
		return finum;
	}
	public void setFiNum(int finum) {
		this.finum = finum;
	}
	public String getFiName() {
		return fiName;
	}
	public void setFiName(String fiName) {
		this.fiName = fiName;
	}
	public int getFiPrice() {
		return fiPrice;
	}
	public void setFiPrice(int fiPrice) {
		this.fiPrice = fiPrice;
	}
	@Override
	public String toString() {
		return "FoodInfoVO [finum=" + finum + ", fiName=" + fiName + ", fiPrice=" + fiPrice + "]";
	}
}
