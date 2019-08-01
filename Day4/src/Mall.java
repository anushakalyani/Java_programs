import java.util.Scanner;


public class Mall {

	public static void main(String[] args) {
         Games game= new Games();
         Shopping shop=new Shopping();
         Thread t1= new Thread(game,"Anusha");
         Thread t2= new Thread(shop,"Suman");
         t1.start();t2.start();
         }

}

class Shopping implements Runnable{
     Games g= new Games();
	@Override
	public void run() {
		synchronized (g.scan){
			if(g.amount<500){
				g.amount=1000;
				System.out.println(Thread.currentThread().getName()+"going to get notified");
			    g.scan.notify();
			}
		}
		System.out.println(Thread.currentThread().getName()+"Shopping in Levis");
	}//means this becomes the source class
	
}


class Games implements Runnable{
	Scanner scan =new Scanner(System.in);
	int amount;
	@Override
	public void run() {
		synchronized (scan){
			System.out.println("enter the price for entry ticket:");
			amount=scan.nextInt();
			try {
				scan.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
		System.out.println(Thread.currentThread().getName()+"You can enjoy the play station");
	}
	
}