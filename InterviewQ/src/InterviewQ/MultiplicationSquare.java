package InterviewQ;

public class MultiplicationSquare {
	int odd;
	 int even;
	 int sq;
	
	 public void checkeven(int num) {
		 int rem =num%10;
		    num=num/10;
		 
		 if(rem%2==0) {
			 even=num;
			 
		 }
		 else {
			 
			 System.out.println("number is not even");
		 }
		 
		 sq=even*even;
		 
		 sq=sq*sq;
		 
		 System.out.println(sq);
		 
		 
		 
		 
	 }
	 
	 public void checkodd(int num) {
		 if(num%2==1) {
			 odd=num;
			 
			 
		 }
		 
		 else {
			 System.out.println("num is not odd");
		 }
		  int add=odd*odd*odd;
		  System.out.println(add);
		  
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
		 MultiplicationSquare c= new MultiplicationSquare();
		 c.checkeven(25431678);
		 c.checkodd(7);
	}
	

}
