package browsing;

import java.util.Scanner;

public class DecToBin {

	
//	int bin[] = new int[100],i=0;
//	 
//	void binary(int num)
//	{
//		if(num > 0)
//		{
//			bin[i++]=num%2;
//			num=num/2;
//			binary(num);
//		}
//		for(i=i-1;i>=0;i--)
//		{
//			System.out.println(bin[i]);
//		}
//	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number");
		String n= sc.nextLine();
		System.out.println(Integer.parseInt(n,2));
		
		
//		DecToBin db = new DecToBin();
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter Decimal Number");
//		int n=sc.nextInt();
//		System.out.println("Binary Number is= ");
//		db.binary(n);
		
	}

}
