package p0206;

class Father{
	void work() {
		System.out.println("아빠가 일합니다.");
	}
}

// Overwriding , Father, Object
public class Overwriding extends Father{

	public static void main(String[] args) {
		Overwriding o = new Overwriding();
		o.work();
		Father f = new Overwriding();
		f.work();
		Object ob = new Overwriding();
		//ob.work(); 오류
		
	}
}
