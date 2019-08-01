import java.io.IOException;


public class Compile { 

	
	public static void main(String[] args) throws IOException, InterruptedException {
       Runtime run=Runtime.getRuntime();
       Process pro=null;
       pro=run.exec("notepad");
       Thread.sleep(5000);
       pro=run.exec("calc");
       
	}

}
