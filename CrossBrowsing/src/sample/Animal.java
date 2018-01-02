package sample;

public class Animal {

	void eat() {
		System.out.println("eating....");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}

}

class Babydog extends Animal {
	void meow() {
		System.out.println("meowing...");
	}
}

class TestInheritance {
	public static void main(String[] args) {

		Babydog c = new Babydog();
		
		c.meow();
		c.eat();
	}

}
