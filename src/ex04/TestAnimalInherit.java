package ex04;

class Pet{
	String name;
	void eat() {
		System.out.println(name + "가 옴청 먹는다");
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

class Tiger extends Pet {
	void cry(){
		System.out.println(name + "(이)가 먀아오");
	}
}

public class TestAnimalInherit {
	
	// 상속 : Inherit -> Java : extends 로 처리
	// 다중상속 불가능 (상속은 한개만 가능 -> java,c#)
	public static void main(String[] args) {
	

		Dog dog = new Dog();
		work(dog,"츄");
		// dog.name = "츄";
		// dog.eat();
		// dog.bark();
		System.out.println("====================");
		
		Cat nero = new Cat();
		work(nero, "네로");
		// nero.name = "네로";
		// nero.eat();
		// nero.meow();
		System.out.println("====================");
		
		Tiger tiger = new Tiger();
		work(tiger, "큰냥이");
		
		Pet pet = new Pet();
		pet.name = "뻐끔이";
		pet.eat();
		
		// 가능
		//pet = dog;
		//pet.eat();
		// pet.bark(); // 불가능
		
		// 불가능 (자식=부모) -> casting 을 하면 가능
		// dog = pet;
		// dog.eat();
		
		// dog = (Dog) pet;
		// dog.eat();		

	}
	
	//한개의 work() 함수로 업무 처리
	public static void work(Pet pet, String name) {
		pet.name = name;
		System.out.println("Work:");
		pet.eat();
		
		if(pet instanceof Dog)
			((Dog) pet).bark();
		if(pet instanceof Cat)
			((Cat) pet).meow();
		if(pet instanceof Tiger)
			((Tiger) pet).cry();
	}
	
	/*
	private static void work(Cat nero, String name) {
		nero.name = name;
		System.out.print("work:");
		nero.eat();
		nero.meow();
	}

	private static void work(Dog dog, String name) {
		dog.name = name;
		System.out.print("work:");
		dog.eat();
		dog.bark();
	}
	*/

}
