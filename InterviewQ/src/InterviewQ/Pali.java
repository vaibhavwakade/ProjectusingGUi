package InterviewQ;

public class Pali {
	
	public static void main(String[] args) {
		int num=121;
		int pal =num;
		int rev;
		int res =0;
		while(pal!=0) {
			rev=pal%10;
			res=res*10+rev;
			pal=pal/10;
			
			
		}
		if(num==res) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
	}

}
