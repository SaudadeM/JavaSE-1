/*
调用方法有时候前面的类名可以不写。  什么时候可以不写呢  
当方法和调用在同一个类体的时候可以不写，不在同一个类体的时候就必须要写类名

建议在一个java文件当中定义一个class

*/
public class MethodText3
{
	
	public static void m1()
	{
		System.out.println("哈哈哈");
		
	}
	public static void main(String[ ] args)
	{
		m1(); //不加类名也可以输出 哈哈哈
		
		//m2();//掉用不在同一个类体中的方法是不加类名会编译出错  错误: 找不到符号  m2();  符号:   方法 m2()  位置: 类 MethodText3
		lei2.m2();  //加上类名输出张三
	}
}

class lei2 //可以不写主方法
{
	
	public static void m2() //可以不写主方法,但是不会运行，因为主方法是程序的入口
	{
		System.out.println("张三");
	}
}