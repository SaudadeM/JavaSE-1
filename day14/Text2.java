public class Text2
{
	public static void main(String[ ] args)
	{
		//����method2
		Text2 u = new Text2();
		u.method2();
	}
	public void doOther()
	{
		System.out.println("do Other");
	}
	
	public void method2()
	{
		//����doOther
		this.doOther();  //���ﲻ�ô�����������Ϊthis�����������������ĵ�ַ this�ܳ�����ʵ�������͹��췽����
		this.method3();  //��ʹ��6��24ע��Ҷû�б�����Ϊmethod2��ʵ��������doOtherҲ��ʵ����������Ҫ�����method2Ҫ����������ô��ʱ��this����ָ�����Ǹ�������Ҳ����Ϊʲôʵ�������������дthis��������static�ķ������У���Ϊ���ô���static�ķ��������ô������������������û��this
	}  //����this��ָ24�е�this����6�е�this�� ˭ȥ����method2��ôthis����˭
	
	public static void method1()
	{
		//����doOther
		Text2 u = new Text2(); //��Ϊ���Ǵ���static�ķ���Ҫ���þͱ��봴������main��Ķ��������ﲻ�����ã�������static�ķ���ȥ����û��static�ķ���ʱ����Ҫ��������  
		//u.doOther();
		//this.doOther();
	}
	
	public static void doSome()
	{
		System.out.println("do some");
	}
	
	public void method3()
	{
		
		
	}
	
	public static void method4()
	{
		//u.doOther();
	}
}