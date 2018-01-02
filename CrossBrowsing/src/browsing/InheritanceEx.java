package browsing;

public class InheritanceEx {

	void eat()
	{
		System.out.println("Eating");
	}
}

class dog extends InheritanceEx
{
	void bark()
	{
		System.out.println("barking");
	}
	
	public static void main(String[] args) {

	dog d = new dog();
	d.bark();
	d.eat();

	}

}
