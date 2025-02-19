package p0204;

interface Eat{
	public void eat();
}
class Person implements Eat{

	@Override
	public void eat() {
		System.out.println("사람이 밥을 먹는다.");
	}
	
}
class Animal implements Eat{
	public void eat() {
		System.out.println("동물이 밥을 먹는다.");
	}
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}

public class Exam{
	
	public static void main(String[] args) {
		Eat[] eats = new Eat[3];
		eats[0] = new Dog();
		eats[1] = new Cat();
		eats[2] = new Person();
		
		for(int i=0;i<eats.length;i++) {
			eats[i].eat();
		}
	}

}
