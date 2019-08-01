
public class ThirdInside {
    int suit=42;
	public void root(long temp){
		long accno=temp;
		class React{
			public void display(){
				System.out.println(ThirdInside.this.suit);
			}
			}
		System.out.println(accno);
		React re=new React();
		re.display();
	}
	
	public static void main(String[] args) {
	
	}

}
