
public class SecondInside {
    String product;
    float monitorsize;
    class Enquiry{
    	int price;
    	public void show(){
    		System.out.println("this  is inside the SecondInside:"+product+" "+monitorsize+" "+price);
    	}
    	public void greetings(){
    		System.out.println("this is inside the enquiry block"+"products are: "+product);
    	}
    	
    }
	public static void main(String[] args) {
		SecondInside si=new SecondInside();
		si.product="Sony";
		si.monitorsize=45;
		Enquiry en=si.new Enquiry();
	    en.price=4000;
	    en.show();
	    en.greetings();
	   
	}

}
