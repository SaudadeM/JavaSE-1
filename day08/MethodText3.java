/*
以下代码不使用方法重载机制,不使用overload 分析程序存在的缺点?

1、 suInt, sunLong,sunDouble 虽然功能不同，但是功能相似，都是求和
在以下程序当中功能相似的方法,分别起了个不同的名子,这对于程序员来说,调用的时候不方便，程序员需要记忆更多的方法名，才能完成调用

2、代码不美观
有没有这样的一种机制:
功能虽然不同,但是功能相似的时候,有没有这样的一种机制,可以让程序员使用
这些方法的时候就像在使用同一个方法一样,这样程序员以后编写代码比较方便
也不需要记忆更多的方法名。代码也会很美观
有这种机制:方法重载机制/ overload
*/

//不用方法重载机制 设计三个函数，功能分别是，int类型的数据相加  long类型的数据相加  double类型的数据相加
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