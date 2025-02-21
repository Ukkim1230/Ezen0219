package p0221;

public class GameInfoVO {
	
	public int giNum;
	public String giName;
	public int giPrice;
	@Override
	public String toString() {
		return "GameInfoVO [giNum=" + giNum + ", giName=" + giName + ", giPrice=" + giPrice + ", giGenre=" + giGenre
				+ ", giDesc=" + giDesc + "]";
	}
	public int getGiNum() {
		return giNum;
	}
	public void setGiNum(int giNum) {
		this.giNum = giNum;
	}
	public String getGiName() {
		return giName;
	}
	public void setGiName(String giName) {
		this.giName = giName;
	}
	public int getGiPrice() {
		return giPrice;
	}
	public void setGiPrice(int giPrice) {
		this.giPrice = giPrice;
	}
	public String getGiGenre() {
		return giGenre;
	}
	public void setGiGenre(String giGenre) {
		this.giGenre = giGenre;
	}
	public String getGiDesc() {
		return giDesc;
	}
	public void setGiDesc(String giDesc) {
		this.giDesc = giDesc;
	}
	public String giGenre;
	public String giDesc;
}