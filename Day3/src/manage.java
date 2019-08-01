
public class manage implements operator{
	Company[] comp=new Company[5];
	static int pos;
	public static void main(String[] args) {
		Company a=new Company("Anusha","Python",3,100000);
		Company b=new Company("Sush","Java",5,50000);
		Company c=new Company("Shruthi","Embeded systems",1,10000);
		Company d=new Company("Poo","JavaScript",4,10000);
		manage m=new manage();
		m.insert(a);
		m.insert(b);
		m.insert(c);
		m.insert(d);
	}
	public void insert(Company a) {
		for(int index=0;index<comp.length;index++)
		{
			if(comp[index]==null)
			{
				comp[index]=a;
				System.out.println(a.getCname()+" added");
				break;
			}
		}
	}
	
	public void search(String tech)
	{
		if(pos>=comp.length-1)
		{
			return;
		}
		else
		{
			if(comp[pos].getSkill().equalsIgnoreCase(tech))
			{
				System.out.println(comp[pos]);
			}
			pos++;
		}search(tech);
	}

}
