public class SuperText6
{
	public static void main(String[ ] args)
	{
		Wwe w = new Wwe();
		w.m();
	}
}

class Customer
{
	int i;
	String name;
	public Customer()
	{
	}
	
	public Customer(String name)
	{
		this.name = name;
	}
}

class Vip extends Customer
{
	int i;
	public void m()
  {
  	
  	System.out.println(super.i); 
  	
  }
 
}

class Wwe extends Vip
{
	int i;
	public Wwe()
	{
		
	}
}