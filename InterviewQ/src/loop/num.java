package loop;

public class num {
	
	
	int r=5;
	int c=5;
	public static void main(String[] args) {
		for(int i=0; i<4;i++) {
			for(int j=i+1;j<=i+4;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
			
		}
	}

}
