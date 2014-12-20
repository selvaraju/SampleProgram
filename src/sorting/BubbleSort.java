package sorting;

public class BubbleSort {
	
public static void main(String arg[]) {
		
		int input[] = {5,3,6,1,4,8}; 
		//Selection sorting....
		
		System.out.println("Before Sorting");
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
		
	
		boolean swapped = true;
		int temp = 0;
		while(swapped) { 
			swapped = false;
			
			for(int i=1;i<input.length; i++){
				
				if(input[i-1] > input[i]) {
					
					temp = input[i-1];
					input[i-1] = input[i];
					input[i] = temp;
					swapped= true;
					
				}
				
			} 
			
		}
		 
		System.out.println("\nBefore Sorting"); 
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
		
	}
	

}
