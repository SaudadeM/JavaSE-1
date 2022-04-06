/*
用普通方法和递归方法求阶乘

5的阶乘是 5*4*3*2*1
*/

public class RecursionText3
{
	public static void main(String[ ] args)
	{
		int n = 5;
		int retValue = m1(n);
		System.out.println(retValue);
		
	}
	//递归方法
	public static int m1(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		return n * m1(n-1);
	}
	
	/*public static int m1(int n)  //普通方法
	{
		int result = 1;//不能等于0
		for(int i=n;i>0;i--)
		{
			result = result * i;  //这个和求和里定义的sum变量的功能是一样的，都是用来存之前的数据的
		}
		return result;
	}
	*/
}