/*
����ʲô�����ſ���ʹ�÷�������
   1.��ͬһ������
   2.��������ͬ
   3.�����б���ͬ
       ������ͬ  �������Ͳ���ͬ  ˳��ͬ
       
����ֵ���Ͳ�ͬ�ǲ�����ʹ�÷������ء����η��б�ͬҲ������ʹ�÷�������
*/

public class OverLoadText2
{
	public static void main(String[ ] args)
	{
		m1();
		m1(10);
		m1(2,4);
		m2(2.0);
		m2(2);
		m3(3,3.0);
		m3(3.0,3);
	}
	//�����������ɷ������ء���һ�������ſ��ԡ�
	public static void m1(int i)
	{
	}
	public static void m1()
	{
	}
	public static void m1(int i,int b)
	{
	}
	//�����������ɷ�������
	public static void m2(double i)
	{
	}
	public static void m2(int i)
	{
	}
	//�����������ɷ�������
	public static void m3(int i,double j)
	{
	}
	public static void m3(double j,int i)
	{
	}
	//���·������ܹ��ɷ������أ����Ƿ����ظ�
	public static void m4(int i,int j)
	{
	}
	public static void m4(int j,int i)
	{
	}
	
}