/*
super.�ڴ󲿷�����¶�����ʡ��
super.��ʲô����²���ʡ����
     ��������и���Ҳ�У�������������з��ʸ������������ôsuper.�Ͳ���ʡ
*/

public class SuperText5
{
	public static void main(String[ ] args)
	{
		Vip c = new Vip("��������");
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
  	System.out.println(this.name+"���ڹ���"); 
  	//System.out.println(super.name+"���ڹ���");  //�����������ԭ���ǣ�����Customer�������˵���ĸ�����Object����ôsuper��ָ�� 
  	System.out.println(name+"���ڹ���");         //��Object���ϵͳ���࣬����ϵͳ���ಢû��name���Իᱨ������SuperText6��Ϳ�����Ϊ����
  	                                             //�ĸ�������int i
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
  //super��this�����ܳ����ھ�̬������  
  public void f()
  {
  	System.out.println(this.name+"���ڹ���"); //���null���ڹ��� ��ʱ��name�������е�name
  	System.out.println(super.name+"���ڹ���");//super��thisָ����Ǹ����������һ���ռ�
  	System.out.println(name+"���ڹ���");//���null���ڹ���  ��ʱ��name�������е�name
  }
}
