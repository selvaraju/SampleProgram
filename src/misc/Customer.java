package misc;
/*
 * Hash Code Implementation
 */
public class Customer {

	
	
	private String name;
	
	private Integer id;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:"+name+";id:"+id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		 

		if(arg0 instanceof Customer){
		 	if (this.id.intValue() == ((Customer)arg0).id.intValue()){
			 
				return true;
			}else{
			 
				return false;
			}
		}else{
			return false;
		}
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash = 3;
		hash = 7 * hash + this.id.hashCode();
		
		return hash;
	}
}
