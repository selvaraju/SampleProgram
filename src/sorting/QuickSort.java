package sorting;

public class QuickSort {
	
	public static int partition(int arr[],int left,int right){
		
		int i = left; int j= right;
		
		int pivot = arr[((left+right)/2)];
		
		int temp;
		
		while(i<=j){
			

			while(arr[i] < pivot)
					i++;
			
			while(arr[j]>pivot)
				   j--;
			
			if(i<=j){
				
				temp = arr[j];
				arr[j]=arr[i];
				arr[i] = temp;
				
				i++;
				j--;
				
			}
			
			
			
			
		}
		
		
			
			
		
		return i;
	}

	public static void quickSort(int arr[],int left,int right){
		
	
		
		int index = partition(arr,left,right);
		
		if(left < index - 1 ){
			
			quickSort(arr,left,index -1);
		}
		
		if(index < right){
			
			quickSort(arr,index,right);
		}
		
	
		
	}
	
	
	
public static void main(String arg[]) {
		
		int input[] = {5,3,6,1,4,8,56,24,13,9}; 
		//Selection sorting....
		
		System.out.println("Before Sorting");
		
		
		
	
		
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
		
		quickSort(input,0,9);
		
		System.out.println("\nAfter Sorting");
		
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
	}
	
	
}
