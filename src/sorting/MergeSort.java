package sorting;

import java.util.Arrays;

public class MergeSort {
private int leftCount;
private int rightCount;
public static void main(String arg[]) {
		
		int input[] = {5,3,6,1,4,8,7,3,55,55,12}; 
		//Selection sorting....
		
		System.out.println("Before Sorting");
		for(int i=0;i<input.length;i++) {
			
			System.out.print(input[i] +" ");
			
		}
		
		MergeSort mergeSort = new MergeSort();
		
		mergeSort.sort(input);
		  System.out.println("after:  " + Arrays.toString(input));
	}
	
   
  public void sort(int array[]){
	  
	  if(array.length > 1) {
		  
		  int [] left = leftHalf(array);
		  int [] right = rightHalf(array);
		  sort(left);
		  sort(right);
		  //merge(array, left, right);
	  }
	 
	  
  }
  
  public int[] leftHalf (int array[]) {
	  
	  int  size1 = array.length /2;
	  int[] left = new int[size1];
	  for (int i = 0; i < size1; i++) {
          left[i] = array[i];
      }
	  System.out.print("\n");
	  for(int i=0;i<left.length;i++){
		  System.out.print(left[i] +" ");
	  }
	  leftCount++;
      return left;
	  
  }

  
  public int[] rightHalf (int array[]) {
	  System.out.print("\n");
	  
	  int  size1 = array.length /2;
	  int  size2 = array.length - size1 ;
	  int[] right = new int[size2];
	  for (int i = 0; i < size2; i++) {
		  right[i] = array[i+size1];
      }
	  for(int i=0;i<right.length;i++){
		  System.out.print(right[i] +" ");
	  }
	  rightCount++;
      return right;
  }
  
  public void merge(int[] result, 
          int[] left, int[] right) {
	  System.out.println("Merge:::");
	  int i1 = 0; //left
	  int i2 = 0; // right
	  
	  
	  for (int i = 0; i < result.length; i++) {
           
		  if(i2>=right.length || (i1<left.length && left[i1] <= right[i2])){
			  result[i] = left[i1];
			  i1++;
		  }else{
			  
			  result[i] = right[i2]; 
			  i2++;
		  }
		  
      }
	  
  }
}
