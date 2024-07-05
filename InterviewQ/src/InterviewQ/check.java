package InterviewQ;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class check {
 public static void main(String[] args) {
     
     int num =121;
     int pal=num;
 int res=0;
     int rev=0;
   	while(pal !=0) {
			 res = pal % 10 ;
			rev = (rev * 10)+res;
			pal = pal / 10;
		}
     
     if(rev==num){
         System.out.println("palindrome");
     }
     else{
                     System.out.println(" not  palindrome");

     }
     
 }
}
