package sample;

public class Inheritance {

	void eat() {
		System.out.println("eating");
	}
}

class cat extends Inheritance {
	void bark() {
		System.out.println("meaw");
	}

	public static void main(String[] args) {

		cat c = new cat();
		c.bark();
		c.eat();

	}
}
