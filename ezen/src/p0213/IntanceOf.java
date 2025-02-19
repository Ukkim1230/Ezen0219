package p0213;

import java.util.ArrayList;

interface Color{
	void printColor();
}
class Red implements Color{
	public void printColor() {
		System.out.println("빨강");
	}
	public void feature() {
		System.out.println("난 아주 새빨갱이");
	}
}
class Black implements Color{
	public void printColor() {
		System.out.println("검정");
	}
	void dark() {
		System.out.println("난 세상을 검게 만들지~");
	}
	
}
class White implements Color{
	public void printColor() {
		System.out.println("흰색");
	}
	void bright( ) {
		System.out.println("세상은 하얗고 밝게~");
	}
	
}
public class IntanceOf {//instaceof = ~라고 불러도되니?
	
	public static void main(String[] args) {
		ArrayList<Color> colors = new ArrayList<>();
		colors.add(new Red());
		colors.add(new Black());
		colors.add(new White());
		for(Color c:colors) {
			c.printColor();
			if(c instanceof Red) {
				Red r = (Red)c;
				r.feature();
			}
		}
	}

}
