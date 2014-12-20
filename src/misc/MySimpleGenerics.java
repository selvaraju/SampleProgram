package misc;

public class MySimpleGenerics {

	 public static void main(String a[]){
         
	        //we are going to create SimpleGeneric object with String as type parameter
	        SimpleGeneric<String,Boolean> sgs = new SimpleGeneric<String,Boolean>("JAVA2NOVICE",true);
	        sgs.printType();
	        //we are going to create SimpleGeneric object with Boolean as type parameter
	        SimpleGeneric<Boolean,String> sgb = new SimpleGeneric<Boolean,String>(Boolean.TRUE,"Hi..");
	        sgb.printType();
	    }
	 
}


class SimpleGeneric<T,V>{
    
    //declaration of object type T
    private T objReff = null;
    private V objReff1 = null;
     
    //constructor to accept type parameter T
    public SimpleGeneric(T param,V param1){
        this.objReff = param;
        this.objReff1 = param1;
        if(param instanceof String){
        	
        	
        	String s = (String) param;
        	
        	System.out.println(s);
        }
    }
     
    public T getObjReff(){
        return this.objReff;
    }
     
    //this method prints the holding parameter type
    public void printType(){
        System.out.println("Type: "+objReff.getClass().getName() + ":" +objReff1.getClass().getName());
    }
    
}