/*
�������ķ���ֵ����void��ʱ���C���Ե����ƣ���һ������  ������������ʱ ������ �������������ʲô������д����Ҫ������дvoid

�������з���ֵ��ʱ����Ҳ����ѡ�񲻽��� 

*/
public class MenthodText4
{
	
	public static int chufa(int a,int b)
	{
		int c = a/b;
		return c;
	}
	
	public static int m1(int a,int b)
	{
		int c = a+b;
		System.out.println("hhhh");
		return c;  //return������д������棬��Ȼ�ᱨ��return�����û���������ֹ����java:20: ����: �޷����ʵ����  System.out.println("hhhh");  MenthodText4.java:22: ����: ȱ�ٷ������
	}
	
	public static int f()  //������������ʱ��������ʲô������д����Ҫ������дvoid
  {
  	return 24;
  }	
	
	public static void main(String[ ] args)
	{
		int a = chufa(10,2);
		System.out.println(a);
		System.out.println(chufa(6,2));  //Ҳ����������ӡ������
		
		m1(3,6);  //��������ѡ�񲻽��ܷ���ֵ�������ǻ���� hhhh
		
		int i;
		i = MethodText1.f();
		System.out.println(i);
		
	}
}