import java.util.Random;

public class Purpose {

	public static void main(String[] args) {
		
		String yet="123456789";
		try{
			System.out.println(yet.charAt(new Random().nextInt()));
			System.out.println("random generated!");
		}
		catch(StringIndexOutOfBoundsException obj){
			System.out.println(obj+"\n Range should be within"+yet.length());
			System.out.println(yet.charAt(new Random().nextInt(yet.length())));
		}
		finally{System.out.println("work is done!");}

	}

}
