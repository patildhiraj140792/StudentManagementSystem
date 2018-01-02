package sample;

public class ThisKeyword {

	int roll_no;
	String name;
	float fee;
	
	ThisKeyword(int roll_no, String name, float fee)
	{
		this.roll_no=roll_no;
		this.name = name;
		this.fee = fee;
	}
	
	void display()
	{
		System.out.println(roll_no+" "+name+" "+fee);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword t1 = new ThisKeyword(11,"Dhiraj",12345.55f);
		ThisKeyword t2 = new ThisKeyword(12,"Patil",3456.55f);
	
		t1.display();
		t2.display();
		

	}

}
