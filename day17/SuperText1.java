/*
����super
super:
super�ܳ�����ʵ�������͹��췽����
super����ʹ���ھ�̬������
super.�󲿷�������ǿ���ʡ�Ե�
siperʲôʱ����ʡ����
supe()ֻ�ܳ����ڹ��췽����һ�У�ͨ����ǰ���췽��ȥ���ø����еĹ��췽����Ŀ�����ڴ����������ʱ�ȳ�ʼ���������

4����Ҫ�Ľ���:
�������췽����һ��
��û��this()��û��super()�Ļ�,Ĭ�ϻ���һ�� -super()
��ʾͨ����ǰ����Ĺ��췽�����ø�����޲������췽��
���Ա��뱣֤������������췽���Ǵ��ڵ�
5��ע��
this()�� super()���ܹ���,���Ƕ����ܳ����ڹ��췽����һ��
*/

public class SuperText1
{
	public static void main(String[ ] args)
	{
		new B();
	}
}

class A
{
	public A()
	{
		System.out.println("A����޲������췽��");
	}
	public A(int i)
	{
		System.out.println("A����в������췽��");
	}
}

class B extends A
{
	public B()
	{
		//super(); �����дsuper������һ��Ĭ�ϵ�super��������ȥ���ø�����޲η���
		//super(3); //���ǵ��ø�����в������췽��  ��ʱϵͳ�����ṩsuper() ���� һ�����췽������ֻ��дһ��super  ��ðѸ����е��޲ι��췽��д��
		this("��������"); //�����вη��� �вη�����ҲĬ����suoer(),���Ի���ִ��A����вη���  �ó����ۣ�������ζ�����ִ�и���ķ���  
		//super();  �ᱨ����Ϊ�������this()��ͻ��this����ֻ��д�ڹ��췽����һ�У���super()Ҳ�ǣ�����super��this()ֻ�ܴ���һ��
		System.out.println("B����޲������췽��");
	}
	
	public B(String name)
	{
		//super()
		//super(8);
		System.out.println("B����в������췽��");
	}
}

/*
class a
{
}
class b extends a
{
}
class c extends b
{
}

��ʱc���super��ȥ����b��Ĺ��췽����b���췽�����super��ȥ����a���super
��ʵa�๹�췽�����super��ȥ����ϵͳ��object����Ĺ��췽����object��������
class object
{
   public object()
   {
   
   }
}



*/