package sample;

public class StaticMethod {

	int roll_no;
	String name;
	static String college = "RCPIT";
	
	static void change()
	{
		college="JSPM";
	}
	
	StaticMethod(int i, String n)
	{
		roll_no=i;
		name=n;
	}
	
	
	public void display()
	{
		System.out.println(roll_no +" "+ name +" "+ college);
	}
	
	public static void main(String[] args) {

		StaticMethod.change();
		
		StaticMethod s1 = new StaticMethod(12, "Dhiraj");
		StaticMethod s2 = new StaticMethod(11, "Akshay");
		
		s1.display();
		s2.display();
		
	}

}
