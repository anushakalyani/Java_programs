import java.util.Random;


public class otp_example {
	public static void main(String[] args) {
	  StringBuilder build=new StringBuilder();
	  Random ran=new Random();
      int digit=1;//iteration variable
      while(digit<=4){
    	  build.append(ran.nextInt(10));
    	  digit++;
      }
      System.out.println("Your OTP is:"+build.toString());
	}

}
