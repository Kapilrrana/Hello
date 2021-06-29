package arrayS;

public class BubbleSort {

	public static void main(String[] args) {
		 
		 int a[] = {-2, 0, 1,5,7};//Static array
		 int n = a.length;	  //.length()
		 boolean sorted = true;   //Boolean vlaue
		
		//Loops for sorting of array
		
		//Loop1
		for(int i = 0; i < n-1; i++) {
			 //Loop 2
			 for(int j = 0; j < n-1-i; j++) {
				 
				 if(a[j+1] < a[j]) {
				
					 int temp = a[j+1];
					 a[j+1] = a[j];
					 a[j]  = temp;
					 
					 sorted = false;
				 }
			 }
		        if(sorted) break;
		 }

		 // using for each loop					 
		 for(int item : a) {
			 System.out.print(item + " ");
		 }
	
//		 for(int i = 0; i < n; i++) {
//				int item;
//			 item = a[i];
//			 System.out.print(item + " ");
//		 }
			 
	
	}
}
