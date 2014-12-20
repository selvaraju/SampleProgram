package sorting;

public class InsertionSort {

	
public static void main(String arg[]) {
		
		int input[] = {5,3,6,1,4,8}; 
		//Selection sorting....
		
		System.out.println("Before Sorting");
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
		
		int j;
		int newValue = 0;
		 int temp = 0;
	    for( int i=1;i<input.length;i++){
	    	
	    	newValue = input[i];
	    	j = i;
	    	
	    	while(j>0 && input[j-1] > newValue){
	    		
	    		temp = input[j-1];
	    		input[j-1] = input[j];
	    		input[j] = temp;
	    	   
	    		j--;
	    	}
	    	
	    	
	    }
		
		System.out.println("\nBefore Sorting");
 		
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
		
	}
}
