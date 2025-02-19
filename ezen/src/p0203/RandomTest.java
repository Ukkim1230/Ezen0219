package p0203;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		//난수
		Random r = new Random();
		int rNum = r.nextInt(100); //0-99
		
		double db = Math.random() * 100 ; // 0.0-99.999999999999
		
		rNum = (int)db; // 0-99
	}
}
