/*
可以使用 static关键字来定义静态代码块
1、语法格式
statice
{
   java语句
}

2、静态代码块在类加载时执行,并且只执行一次。

3、静态代码块在一个类中可以编写多个,并且遵循自上而下的顺序依次执行。

4、静态代码块的作用什么?怎么用?用在哪儿?什么时候用?
一这当然和具体的需求有关,例如项目中要求在类加载的时刻时机执行代码完成日志的记录。
那么这段记录日志的代码就可以编写到静态代码块当中,完成日记录。
-静态代码块是jav为程序员准备一个特殊的时刻,这个特殊的时刻被称为类加载时刻。若
希望在此刻执行一段特殊的程序,这段程序可以直接放到静态代码块当中。I
*/
public class StaticText
{
	static
	{
		System.out.println("haha");
	}
	//静态代码块可以写多次，但一般只写一次
	static
	{
		System.out.println("haha");
	}
	
	public static void main(String[ ] args)
	{
		System.out.println("王二麻子");
	}
}