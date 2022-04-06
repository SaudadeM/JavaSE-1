/*
画出以下程序的在JVM中的执行流程  【详见手机/笔记/day08Methodtext1内存图】
在ultraedit中红色字体表示类的名字，所以String，System是类名，他们也会生成class文件

*/public class MethodText1
{
	public static void main(String[ ] args)
	{
		int a = 10;
		int b = 20;
		int retvlue = sumInt(a,b);
		System.out.println(retValue);
	}
	
	public static int suumInt(int i,int j)
	{
		int result = i + j;
		int num = 3;
		int retValue = divide(result,num);
		return retValue;
	}
	
	public static int divide(int x,int y)
	{
		int z = x/y;
		return z;
	}
}