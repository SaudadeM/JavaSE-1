public class SuperText4
{
	public static void main(String[ ] args)
	{
		Vip c = new Vip("��������");
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
  //super��this�����ܳ����ھ�̬������  
  public void f()
  {
  	System.out.println(this.name+"���ڹ���"); //Customer������ֻ��һ��name����ôthisָ��ĺ�superָ�����ͬһ��
  	System.out.println(super.name+"���ڹ���");//super��thisָ����Ǹ����������һ���ռ�
  	System.out.println(name+"���ڹ���");
  }
}
//����ֻ�.�ʼ�.day17SuperText4