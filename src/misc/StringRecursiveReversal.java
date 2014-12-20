package misc;

public class StringRecursiveReversal {

	
		public static String reverse(String s) {
			
			if (s.length() == 1) 
				return s;
			else 
				return reverse(s.substring(1)) + s.charAt(0);
		}
		
		public static void main(String[] args) {
			System.out.println(reverse("Hello World"));
			System.out.println(normalReverse("Hello World"));
		}
		
		public static String normalReverse(String str) {
			StringBuilder sb  = new StringBuilder();
			for(int i=(str.length()-1);i>=0;i-- ){
				sb.append(str.charAt(i))	;
			}
			return sb.toString();
		}
		
		
}
