package InterviewQ;

public class SortArr {
	
	public static void main(String[] args) {
		int temp = 0;
		int arr[]= {10,300,33,40,58};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp=	arr[i];
			arr[i]=arr[j];	
			
			arr[j]=temp;
					
					
				}
			}
			System.out.print(arr[i]);

		}
	}

}
