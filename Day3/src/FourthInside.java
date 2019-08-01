
public class FourthInside {
      
	public static void main(String[] args) {
        new Merchant().gets();
        new Merchant().get(2);
        
	}

}


class Merchant{
	int[] price={12000,4500,2000,5000};
	public void get(int index){
		System.out.println(price[index]);
		}
	public void gets(){
		for(int k:price){
			System.out.println(k);
		}
	}
}