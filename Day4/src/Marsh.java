
public class Marsh implements Cloneable{
	String bike;
	public static void main(String[] args) throws CloneNotSupportedException {
	Marsh m1=new Marsh();
	m1.bike="Avenger 220";
	Marsh m2=new Marsh();
	m2.bike="Splendor";
	System.out.println(m1.bike+" "+m2.bike);
	Marsh m3=new Marsh();
	m3.bike="passion x pro";
	Marsh m4=(Marsh)m1.clone();
	
	System.out.println(m3.bike+" "+m4.bike);
	System.out.println("\nM1"+m1.bike+"\nM2"+m2+"\nM3"+m3.bike+"\nM4"+m4.bike);
	m1.bike="Mahindra Java";
	System.out.println("\nM4"+m4.bike+"\nM1"+m1.bike);
		
	}

}
