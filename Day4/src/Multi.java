import java.util.Scanner;


public class Multi {

	public static void main(String[] args) {
			System.out.println("Employment services");
			String name=null;
			int exp[]={12,4,2,8,2},index=0;
			Scanner scan= new Scanner(System.in);
			System.out.println("please enter the name:");
			name=scan.next();
			try{
				System.out.println("mention the experience by index:");
				index=scan.nextInt();
				System.out.println("Selected exp:"+exp[index]);
				}
			catch(ArrayIndexOutOfBoundsException arr){
				System.out.println(arr+"\nIndex should be within"+exp.length);
				index=scan.nextInt();
				System.out.println("Selected experience"+exp[index]);
				System.out.println("enter only number within:");
				index=scan.nextInt();
				System.out.println("Selected experience"+exp[index]);
			}
	}
	
}
