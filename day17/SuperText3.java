public class SuperText3
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
//������Ϊ��������
//          ��������
/*
�ܽ᣺nameȷʵ��Customer��ģ�ֻ������Ϊsuper()һ��ʼname��null����������Ϊthis.name�ָ���name��ֵ   �ڴ�ͼ
����ֻ�.�ʼ�.day17SuperText3
*/
	