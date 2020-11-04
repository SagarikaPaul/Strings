// Java program for the above approach
class Program4 {

	// Function that prints the middle
	// character of a string
	public static void
	printMiddleCharacter(String str)
	{
		// Finding string length
		int len = str.length();

		// Finding middle index of string
		int middle = len / 2;

		// Print the middle character
		// of the string
		System.out.println(str.charAt(middle));
	}

		public static void
	main(String args[])
	{
		// Given string str
		String str = "Sagarika";

		// Function Call
		printMiddleCharacter(str);
	}
}
