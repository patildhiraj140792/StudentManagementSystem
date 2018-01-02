package sample;

public class WrraperClass {

	public static void main(String[] args) {
		
//		int a=20;
//		
//		Integer i = Integer.valueOf(a);
//		Integer j = a;
//		
//		System.out.println(a+" "+i+" "+j);
		
		
		Integer a = new Integer(3);
		int i = a.intValue();
		int j = a;
		
		System.out.println(a+" "+i+" "+j);
	}

}
