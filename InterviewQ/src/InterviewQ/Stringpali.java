package InterviewQ;

public class Stringpali {
	
	public static void main(String[] args) {
		String str="moml";
		String newstr="";
		for(int i=str.length()-1;i>=0;i--) {
			newstr=newstr+str.charAt(i);
			

				
			}
		if(str.equals(newstr)) {
			System.out.println("String is palindrome");
		}
		
		else {
			System.out.println("String is not palindrome");
		}
		}
	}


