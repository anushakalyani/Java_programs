
public class Buffet {

	public static void main(String[] args) {
		Veg v= new Veg();
		NonVeg non=new NonVeg();
		Thread t1=new Thread(non,"shubham");
		Thread t2=new Thread(v,"anu");
		Thread t3=new Thread(non,"sush");
		Thread t4=new Thread(v,"shru");
		t1.start();t2.start();t3.start();t4.start();		
		
	}

}

class Veg implements Runnable{

	@Override
	public void run() {
	    System.out.println(Thread.currentThread().getName()+" had Puliyogre");
	    System.out.println(Thread.currentThread().getName()+" had avalakkkibath");
	    if(Thread.currentThread().getName().equals("shubham"))
	    {
	    	try{System.out.println(Thread.currentThread().getName()+" gonna wait");
	    	Thread.sleep(1000);
	    	
	    	}catch(InterruptedException e){}
	    	
	    }
	    System.out.println(Thread.currentThread().getName()+"had desert");
	    
	}
	
}


class NonVeg implements Runnable{

	@Override
	public void run() {
	    System.out.println(Thread.currentThread().getName()+" had some non veg dish");
	    System.out.println(Thread.currentThread().getName()+"had non veg soup");
	    if(Thread.currentThread().getName().equals("shru"))
	    {Thread.currentThread().stop();}
	    System.out.println(Thread.currentThread().getName()+"had desert");
	    
	}
	
}

