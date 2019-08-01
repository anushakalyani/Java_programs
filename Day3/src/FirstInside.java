
public class FirstInside {
 Integer count;	
 String org;
 double pack;
 public String toString(){
	 return org+" "+pack+" "+count;
 }
 static class Magno{
	 String tech;
	 public void detail(){
		 System.out.println(tech);
	 
 }
 
 }
	
	public static void main(String[] args) {
    FirstInside first=new FirstInside();
	first.org="Amazon";
	first.pack=13.5;
	first.count=1;
	System.out.println(first);
	FirstInside.Magno m=new FirstInside.Magno();
	m.tech="Spring";
	m.detail();
	
	}

}
