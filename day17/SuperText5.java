/*
super.在大部分情况下都可以省略
super.在什么情况下不能省略呢
     如果子类有父类也有，如果想在子类中访问父类的特征，那么super.就不能省
*/

public class SuperText5
{
	public static void main(String[ ] args)
	{
		Vip c = new Vip("王二麻子");
		c.f();
		//c.m();
		
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
	
	/*public void m()
  {
  	System.out.println(this.name+"正在购物"); 
  	//System.out.println(super.name+"正在购物");  //这里编译错误的原因是，对于Customer这个类来说他的父类是Object，那么super就指向 
  	System.out.println(name+"正在购物");         //了Object这个系统的类，但是系统的类并没有name所以会报错。在SuperText6里就可以因为父类
  	                                             //的父类里有int i
  }*/
  
}

class Vip extends Customer
{
	String name;
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
  	System.out.println(this.name+"正在购物"); //输出null正在购物 此时的name是子类中的name
  	System.out.println(super.name+"正在购物");//super是this指向的那个对象的其中一个空间
  	System.out.println(name+"正在购物");//输出null正在购物  此时的name是子类中的name
  }
}

