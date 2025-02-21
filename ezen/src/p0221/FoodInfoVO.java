package p0221;

public class FoodInfoVO {
	
	public int fiNum;
	public String fiName;
	public int fiPrice;
	public int getNum() {
		return fiNum;

}
	@Override
	public String toString() {
		return "FoodInfoVO [fiNum=" + fiNum + ", fiName=" + fiName + ", fiPrice=" + fiPrice + "]";
	}
	public int getFiNum() {
		return fiNum;
	}
	public void setFiNum(int fiNum) {
		this.fiNum = fiNum;
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
}
