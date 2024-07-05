package InterviewQ;

public class palipratice {
	public static void main(String[] args) {
		int num=121;
		int pal=num;
		int rev=0;
		
		while(pal!=0) {
			int res=pal%10;
			rev=rev*10+res;
			pal=pal/10;
		}
		
		
		if(rev==num) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}
	
}
