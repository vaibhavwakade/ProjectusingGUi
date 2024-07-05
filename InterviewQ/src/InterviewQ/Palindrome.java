package InterviewQ;

public class Palindrome {
	
	
	
	
	
		int  num =143;
		int pal = num;
		public void display() {
			this.pal = pal;
			int rev = 0;
			while(pal !=0) {
				int res = pal % 10 ;
				rev = (rev * 10)+res;
				pal = pal / 10;
			}
			if (rev == num) {
				System.out.println("Given number is palindrome");
			}else {
				System.out.println("Not palindrome");
			}
			System.out.println(rev);
		}
		public static void main(String[] args) {
//			
			Palindrome p = new Palindrome();
			p.display();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

