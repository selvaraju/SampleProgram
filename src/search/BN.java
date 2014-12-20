package search;

public class BN {
	
 
	public static int binarySerch(int arr[],int value,int left, int right){
		
		if(left > right)
			return -1;
		
		int middle = (left + right ) /2 ;
		if(arr[middle] == value){
			return value;
		}
		
		if( value > arr[middle]) {
			return binarySerch(arr, value,middle+1,right);
			
		}else{
			return binarySerch(arr, value,left,middle-1);
			
		}
		
		
	}
	public static void main(String[] args) {
		int input[] = {1,3,6,7,8,9,9}; 
		//Selection sorting....
		
		System.out.println("Before Sorting");
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
		 
		System.out.println("RES FOUND"+binarySerch(input,6,0,input.length));

	}

}
