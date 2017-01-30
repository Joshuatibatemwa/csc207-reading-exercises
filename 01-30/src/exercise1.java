
public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		endsWithRep("foobarbar", "bar", 2); /* returns true */
		endsWithRep("foobarbar", "baz", 1);

	
	 }
	 public static boolean endsWithRep(String s1, String s2, int n)
	 {
	  int counter=0;
	  int length=s2.length();
	  for (int i=0;i<=s1.length()-length;i++)
	  { 
	 if(s1.substring(i,length)==s2)
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

	