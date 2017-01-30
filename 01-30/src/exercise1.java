import java.util.Objects;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(endsWithRep("foobarbar", "bar", 2)); /* returns true */
		System.out.println(endsWithRep("foobarbar", "baz", 1));/* returns false */
		System.out.println(endsWithRep("foobarbar", "barbar", 1));/*returns true*/
		System.out.println(endsWithRep("tibatemwa", "tiba", 1));/*returns true*/
		System.out.println(endsWithRep("monkiy", "monke", 1));/*returns false*/
	 }
	 public static boolean endsWithRep(String s1, String s2, int n)
	 {
	  int counter=0; // initialize counter to check how many times s2 appears in s1
	  int length=s1.length();
	  int length2= s2.length();
	  for (int i=0;i<=length-length2;i++) // check at each character of s1 if s2 appears as a substring beginning from that character
	  { 
	if(i==length-length2 && Objects.equals(s1.substring(i),s2))// Due to the nature of how substring works at the last substring the length of s2, the only parameter for substring is the beginning index
	{
		counter++;
	}
		  
	else if (i==length-length2){} // If the above condition does not hold do nothing or terminate the program
	
	else if(Objects.equals(s1.substring(i,(length2+i)),s2))// Transverse the string s1 with s2  moving from one character to another and checking if a substring is present
	  counter++;
	   
	  }
	  if (counter==n)
	  {
	   return true;
	   }
	  else {
	   return false;
	  }
	 }
	 
	}

	