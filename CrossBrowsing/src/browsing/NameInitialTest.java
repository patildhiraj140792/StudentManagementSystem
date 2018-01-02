package browsing;

public class NameInitialTest {

	public static void main(String[] args) {
		String name = "sikandar siraj momin"; // input String
		
		String [] results = name.split(" ");  // splitt by space 
		
		// take last name and make this first character capital 
		String lastname = results[2].toUpperCase().charAt(0) + results[2].substring(1); 
				
		// append last name with fname and middle names initial letters
		String result = lastname + " " +results[1].toUpperCase().charAt(0)+". " 
						+ results[0].toUpperCase().charAt(0)+".";
		
		System.out.println(result); // print result
	}

}
