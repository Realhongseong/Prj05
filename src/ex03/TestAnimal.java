package ex03;

class Dog{
	String name;
	void eat() {
		System.out.println(name + "가 먹는다");
	}
	void bark() {
		System.out.println(name + "가 멈무");
	}
}

class Cat{
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void meow() {
		System.out.println(name + "(이)가 먀묘");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		Dog chu = new Dog();	// 생성자 호출 -> 생성자 없음 : 자바가 기본생성자를 생성해줌
		chu.name = "츄";
		chu.eat();
		chu.bark();
		
		Cat nero = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();

	}

}








