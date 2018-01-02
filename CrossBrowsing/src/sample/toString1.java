package sample;

public class toString1 {

	int rollno,mobno;
	String Name,city,state;
	
	
	public toString1(int rollno, int mobno,String Name, String city, String state)
	{
		this.Name=Name;
		this.rollno=rollno;
		this.city=city;
		this.state=state;
		this.mobno=mobno;
	}
	
	public String toString()
	{
		return rollno+" "+mobno+" "+Name+" "+city+" "+state;
	}
	
	public static void main(String[] args) {

		toString1 t = new toString1(12345678,11,"Shirpur","Maharashtra","Dhiraj");
		System.out.println(t);
	}

}
