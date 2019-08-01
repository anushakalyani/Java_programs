
public class simple_parsing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(args.length);
		int deposited=0,months=0;
		float interest=0;
	    char type='\0';	
	    deposited=Integer.parseInt(args[0]);
	    months=Integer.parseInt(args[1]);
	    interest=Float.parseFloat(args[2]);
	    type=args[3].charAt(0);
	    deposited+=((deposited*months)*interest)/100;
	    System.out.println("deposited:"+deposited);
	    
	}

}
