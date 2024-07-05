package InterviewQ;

public class Stringpalindrome {
	
	public static void main(String[] args) {
	
		String str="mom";
		String str1="";
	      for(int i=str.length()-1;i>=0;i--) {
	    	  str1=str1+str.charAt(i);
	    	  
	    	  
	    	  
	      }
	      if(str1.equals(str1)) {
	    	  System.out.println("palindrome");
	      }
	      else {
	    	  System.out.println("not palindrome");
	      }

		
	}

}
