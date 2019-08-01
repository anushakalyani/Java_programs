import java.util.Scanner;
public class looping {

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String model="",answer="";
		Integer choice,emi;
		System.out.println("please enter the mention model:");
		model=sc.nextLine();
		switch(model){
		case "R15":
			System.out.println("there are two owners with prices 30000 and 40000");
			System.out.println("please enter the year you want the bike to be within!");
			choice=sc.nextInt();
			if(choice<2019){
				System.out.println("there are two bikes!");
			}
			else if(choice>2016&&choice<2018){
				System.out.println("there is only one bike");
				}
			else {
				System.out.println("there is no bike available!");
				
			}
			break;
		case "Enfield":
			System.out.println("there are two owners with 80000 and 90000!");
		    System.out.println("do you want the payment in emi?");
		    answer=sc.next();
		    emi=(80000+8000)/36;
		    switch(answer){
		    case "yes":
		    	System.out.println("emi is available at "+emi+" per month with 10%");
		    break;
		    case "no":
		    	System.out.println("emi is available at 8000 per month with 10%");
		    break;
		    }
			
			
			
			break;
		case "Avenger":
			System.out.println("there is one owner with 80000");
			System.out.println("sorry! no emi is available...it is a down payment");
			
			
		}
	}

}
