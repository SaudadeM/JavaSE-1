public class SuperText4
{
	public static void main(String[ ] args)
	{
		Vip c = new Vip("王二麻子");
		c.f();
	}
}

class Customer
{
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
	public Vip()
  {
  	
  }
  public Vip(String name)
  {
  	super(name);
  }
  //super和this都不能出现在静态方法中  
  public void f()
  {
  	System.out.println(this.name+"正在购物"); //Customer对象里只有一个name，那么this指向的和super指向的是同一个
  	System.out.println(super.name+"正在购物");//super是this指向的那个对象的其中一个空间
  	System.out.println(name+"正在购物");
  }
}
//详见手机.笔记.day17SuperText4