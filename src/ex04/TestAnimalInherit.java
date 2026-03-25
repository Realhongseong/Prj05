package ex04;

class Pet{
	String name;
	void eat() {
		System.out.println(name + "가 먹는다");
	}

}

class Dog extends Pet{
		void bark() {
		System.out.println(name + "가 멈무");
	}
}

class Cat extends Pet{
	
	void meow() {
		System.out.println(name + "(이)가 먀묘");
	}
}

public class TestAnimalInherit {
	
	// 상속 : Inherit -> Java : extends 로 처리
	// 다중상속 불가능 (상속은 한개만 가능 -> java,c#)
	public static void main(String[] args) {
	
		Pet pet = new Pet();
		pet.name = "뻐끔이";
		pet.eat();

		Dog dog = new Dog();
		dog.name = "츄";
		dog.eat();
		dog.bark();
		
		Cat nero = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();

	}

}
