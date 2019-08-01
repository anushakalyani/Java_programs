

public class Company {
	private String cname,skill;
	private int exp,pay;
	
	public Company(String cn,String sk,int ex, int py)
	{
		cname=cn;
		skill=sk;
		exp=ex;
		pay=py;
	}
	
	public String tostring()
	{
		return cname+" "+skill+" "+exp+" "+pay;
	}

	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public int getPay() {
		return pay;
	}


	public void setPay(int pay) {
		this.pay = pay;
	}


	public static void main(String[] args) {
		
	}

}
