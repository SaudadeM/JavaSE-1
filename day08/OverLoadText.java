/*
该程序还是一个体验程序,体验一下方法重载的优点:
  程序员调用方法的时候,比较方便,虽然调的是不同的方法,但是就感觉在使用一个方法一样
  1.不需要记忆更多方法名

  2。代码美观

  前提:功能相似的时候,方法名可以相同  ****
  
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