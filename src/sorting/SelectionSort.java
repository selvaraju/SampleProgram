package sorting;

public class SelectionSort {
	
	public static void main(String arg[]) {
		
		int input[] = {5,3,6,1,4,8}; 
		//Selection sorting....
		
		System.out.println("Before Sorting");
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
		
		
		for(int i=0;i<input.length;i++) {
			
			 int index = i;
			 
			 for(int j=i;j<input.length;j++) {
				 
				 if( input[j] < input[index]){
					 
					 index = j;
				 }
			 }
			
			 int smallValue = input[index];
			 
			 input[index] = input[i];
			 
			 input[i] = smallValue;
			 	
			
		}
		System.out.println("\nBefore Sorting");
		
		
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
		
	}

}
