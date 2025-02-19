package p0205;

public class MethodTest5 {
	static int money = 100;
	
	static void saveMoney(int money) {
		MethodTest5.money += money;
	}
	
	int num = 1000;
	void addNum(int num) {
		this.num += num;
	}
	public static void main(String[] args) {
		saveMoney(10);
		System.out.println(MethodTest5.money);
		MethodTest5 mt = new MethodTest5();
		mt.addNum(10);
		System.out.println(mt.num);
		
	}
}
