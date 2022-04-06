public class SuperText3
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
	//String name;
	public Vip()
  {
  	
  }
  public Vip(String name)
  {
  	super();
  	this.name = name;
  }
  public void f()
  {
  	System.out.println(this.name);
  	System.out.println(super.name);
  }
}
//输出结果为王二麻子
//          王二麻子
/*
总结：name确实是Customer里的，只不过因为super()一开始name是null，但是又因为this.name又给了name赋值   内存图
详见手机.笔记.day17SuperText3
*/
	