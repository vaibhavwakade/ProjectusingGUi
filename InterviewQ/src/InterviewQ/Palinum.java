package InterviewQ;

public class Palinum {
	
	int pal=141;
	int num =pal;
	
	
	public   void check1() {
		int rev=0;

		while(pal !=0) {
			int res = pal % 10 ;
			rev = (rev * 10)+res;
			pal = pal / 10;
		}
		if(rev ==num) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		Palinum p =new Palinum();
		p.check1();
	}
	

}
