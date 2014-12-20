package misc;

public class Fibonacci {
	
	 

	public static void fibonacciNormal(int n){
		System.out.println("Factorial::"+n);
		
		if(n ==1 ){
			System.out.print(0);
		}else if(n ==2 ){
			System.out.print(0);
			System.out.print("\t"+1);
		}else{
			
			System.out.print(0);
			System.out.print("\t"+1);
			int feb1 = 1;
			int feb2 =1;
			int feb = 1;
			for(int i =3;i<=n;i++) {
				feb = feb1 + feb2;
				feb1 =feb2 ;
				feb2 = feb;		
			 	System.out.print("\t"+feb);
				
			}
		}
		
		 
	}
	
	
	public static void main(String arg[]){
		
		fibonacciNormal(10);
	}
}
