/*
return语句只要执行，所在的方法执行结束
在 *同一个作用域* 当中，return语句下面不能编写语句 不能编写语句是指return外露是即
public static void main(String[ ] args)
	{
		System.out.println(m());
		return;
		System.out.println("4");  此时上面的return外露，所以这行的代码会报错【在同一个作用域当中】
	}
当return在for或者if里面是下面还可以写代码38-45行
*/

public class MenthodText5
{
	public static void main(String[ ] args)
	{
		System.out.println(m());
	}
	
	public static int m()
	{
		/*int a = 10;
		if(a>3)
		{
			return 1;   编译出错，因为在编译器，计算机认为这个语句可能执行也可能不执行，但是你写的是返回一个整型值，所以会编译出错
		}*/
		
		/*int a = 10;
		if(a>3)
		{
			return 1;
		}
		else   //编译不会出错，因为即使上面的return不执行，下面的也会执行
		{
			return 0;
		}*/
		
		int a = 1;
		if(a>3)
		{
			return 1; 
		}
		System.out.println("HHHH");  //因为和上一个return不在同一个作用域当中，所以这行不会报错
		return 7;  //上一个的代码太冗长，可以这样写
	}
	
}