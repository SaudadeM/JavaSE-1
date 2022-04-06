/*
画出以下程序在JVM的内存图  详见手机/笔记本/MenthodText2
*/

public class MenthodText2
{
	public static void main(String[ ] args)
	{
		int i = 10;
		method(i);
		System.out.println(i);
	}
	
	public static void method(int i)
	{
		i++;
		System.out.println(i);
	}
}