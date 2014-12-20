package search;

public class BinarySearch {

	public static int binarySearch(int arr[],int value,int left,int right){
		
		  if (left > right)
			  return -1;
		
		int middle = (left + right) / 2;
		
		if(arr[middle] == value)
			return arr[middle];
		
		if(value > arr[middle]) {
			
			return binarySearch(arr,value,middle+1,right);
		}else{
			
			return binarySearch(arr,value,left, middle-1);
		}
		
		
		
	}
	
public static void main(String arg[]) {
		
		int input[] = {1,3,6,7,8,9}; 
		//Selection sorting....
		
		System.out.println("Before Sorting");
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
		 
		System.out.println("Find Str" +binarySearch(input,6,1,5));
		
	}


}
