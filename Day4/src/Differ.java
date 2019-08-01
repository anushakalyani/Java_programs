import java.util.Scanner;


public class Differ {

	public static void main(String[] args) {
      Counter count=new Counter();
      Thread t1=new Thread(count,"Anu");
      Thread t2=new Thread(count,"Shru");
      Thread t3=new Thread(count,"Sush");
      Thread t4=new Thread(count,"poo");
      t1.start();t2.start();t3.start();t4.start();	}

}


class Counter extends Thread{ 
	int amount,available=10000;
	Scanner scan=new Scanner(System.in);
	
	public void withdraw()
	{
		System.out.println("please enter the withdrawl amount");
		amount=scan.nextInt();
		if(amount>available){
			System.out.println("Your balance is not sufficient!");
			available-=amount;
			System.out.println("your available balance is:"+available);
			}
		else{
		System.out.println("You can withdraw the amount!");
		available-=amount;
		System.out.println("your available balance is:"+available);
		}
		
		
	}
	
	synchronized public void run(){
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
		withdraw();
	}
	
	}
