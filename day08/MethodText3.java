/*
���´��벻ʹ�÷������ػ���,��ʹ��overload ����������ڵ�ȱ��?

1�� suInt, sunLong,sunDouble ��Ȼ���ܲ�ͬ�����ǹ������ƣ��������
�����³����й������Ƶķ���,�ֱ����˸���ͬ������,����ڳ���Ա��˵,���õ�ʱ�򲻷��㣬����Ա��Ҫ�������ķ�������������ɵ���

2�����벻����
��û��������һ�ֻ���:
������Ȼ��ͬ,���ǹ������Ƶ�ʱ��,��û��������һ�ֻ���,�����ó���Աʹ��
��Щ������ʱ�������ʹ��ͬһ������һ��,��������Ա�Ժ��д����ȽϷ���
Ҳ����Ҫ�������ķ�����������Ҳ�������
�����ֻ���:�������ػ���/ overload
*/

//���÷������ػ��� ����������������ֱܷ��ǣ�int���͵��������  long���͵��������  double���͵��������
public class MethodText3
{
	public static void main(String[ ] args)
	{
		int result1 = sumInt(2,3);
		System.out.println(result1);
		
		long result2 = sumLong(2L,3L);
		System.out.println(result2);
		
		double result3 = sumDouble(2.0,3.0);
		System.out.println(result3);
	}
	
	public static int sumInt(int a,int b)
	{
		return a + b;
	}
	
	public static long sumLong(long a,long b)
	{
		return a + b;
	}
	
	public static double sumDouble(double a,double b)
	{
		return a + b;
	}
}