package enum;

public class EnumState {
	
	private MacState sacState;
	 
	public MacState getSacState() {
		return sacState;
	}




	public void setSacState(MacState sacState) {
		this.sacState = sacState;
	}




	public static void main(String arg[]){
		
		EnumState enumState = new EnumState();
		enumState.setSacState(MacState.IDLE);
		
		System.out.println(enumState.getSacState());
		
	}

}
