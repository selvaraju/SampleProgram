package misc;

public class EqiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer c1 = new Customer();
		c1.setName("Sel");
		
		
		Customer c2 = new Customer();
		c2.setName("Sel");
		
		Customer c3 =c1;
		
		String p1 = "Selva";
		String p2 = "Selva";
		
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		
		System.out.println(p1==p2);
		
	}
	

}
