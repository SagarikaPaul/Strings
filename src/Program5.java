// Java program for swaping first and last character

class Program5 { 

	// Function that swap first and 
	// the last character of a string 
	public static String 
	swapFirstAndLast(String str) 
	{ 

		// Check if the string has only 
		// one character then return 
		// the string 
		if (str.length() < 2) 
			return str; 

		// Converting the string into 
		// a character array 
		char[] ch = str.toCharArray(); 

		// Swapping first and the last 
		// character of a string 
		char temp = ch[0]; 
		ch[0] = ch[ch.length - 1]; 
		ch[ch.length - 1] = temp; 

		// Converting character to 
		// string and return 
		return String.valueOf(ch); 
	} 

	
	public static void
	main(String args[]) 
	{ 
		// Given String str 
		String str = "GeeksForGeeks"; 

		// Function Call 
		System.out.println( 
			swapFirstAndLast(str)); 
	} 
}
