package InterviewQ;

public class SortString {
	
    
        public static void main(String[] args) {
            String str="acdeb";
            char temp=' ';

            char ch[]=str.toCharArray();
            for(int i=0;i<ch.length;i++) {
            	for(int j=i+1;j<ch.length;j++) {
            		
            		if(ch[i]>ch[j]) {
            			temp=ch[i];
            			ch[i]=ch[j];
            			ch[j]=temp;
            			
            		}
            	}
            	System.out.println(ch[i]);
            }

		}      
    
}
