package p0213;
//interface의 접근제어자는 public 메서드의 선언만 가능 구현 불가
//영역이 없어도 됨 오히려 영역설정시 오류
//메모리 생성 x ex)Action ac = new Action();X
public interface Action {
	void eat();
	void play();
	void work();
	
}
