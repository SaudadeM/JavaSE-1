/*
�ó�����һ���������,����һ�·������ص��ŵ�:
  ����Ա���÷�����ʱ��,�ȽϷ���,��Ȼ�����ǲ�ͬ�ķ���,���Ǿ͸о���ʹ��һ������һ��
  1.����Ҫ������෽����

  2����������

  ǰ��:�������Ƶ�ʱ��,������������ͬ  ****
  
*/
public class OverLoadText
{
	public static void main(String[ ] args)
	{
		int result1 = sum(2,3);
		System.out.println(result1);
		
		long result2 = sum(2L,3L);
		System.out.println(result2);
		
		double result3 = sum(2.0,3.0);
		System.out.println(result3);
	}
	
	public static int sum(int a,int b)
	{
		return a + b;
	}
	
	public static long sum(long a,long b)
	{
		return a + b;
	}
	
	public static double sum(double a,double b)
	{
		return a + b;
	}
}