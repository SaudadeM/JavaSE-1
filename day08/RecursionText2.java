/*
用递归的方法求1-4的和  详见手机笔记/RecursionText2解析
*/
public class RecursionText2
{
	public static void main(String[ ] args)
	{
		int n = 4;
		int retValue = sum(4);
		System.out.println(retValue);
	}
	
	public static int sum(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		
		return n + sum(n-1);  //就是把3+2+1当做一个整体，然后再次调用函数再把2+1当做一个整体以此类推
	}
}
