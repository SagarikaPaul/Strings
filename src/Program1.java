// Java Program to Reverse a String using Stack 
  
import java.io.*; 
import java.util.*; 
  
class Program1 { 
  
    public static String ReverseString(String str) 
    { 
        char[] reverseString = new char[str.length()]; 
        
        Stack<Character> stack = new Stack<Character>(); 
  
        // Traverse the String and push the character one by 
        // one into the Stack 
        for (int i = 0; i < str.length(); i++) { 
        // push the character into the Stack 
            stack.push(str.charAt(i)); 
        } 
  
        // Now Pop the Characters from the stack until it 
        // becomes empty 
  
        int i = 0; 
        while (!stack.isEmpty()) { 
        	// popping element until 
            // stack become empty 
            // get the character from the top of the stack 
            reverseString[i++] = stack.pop(); 
        } 
        // return string object 
        return new String(reverseString); 
    } 
  
   
    public static void main(String[] args) 
    { 
        String str1 = "Sagarika"; 
        
        // call the function 
        System.out.println(str1 + " <- Reverse -> "
                           + ReverseString(str1)); 
        
        String str2 = "artimana"; 
        
        // call the function 
        System.out.println(str2 + " <- Reverse -> "
                           + ReverseString(str2)); 
    } 
}