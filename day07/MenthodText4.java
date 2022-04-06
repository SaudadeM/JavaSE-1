/*
当方法的返回值不是void的时候和C语言的类似，不一样的是  当不传递数据时 方法名 后面的括号里面什么都不用写，不要在里面写void

当方法有返回值的时候你也可以选择不接受 

*/
public class MenthodText4
{
	
	public static int chufa(int a,int b)
	{
		int c = a/b;
		return c;
	}
	
	public static int m1(int a,int b)
	{
		int c = a+b;
		System.out.println("hhhh");
		return c;  //return语句必须写在最后面，不然会报错。return的作用还可能是终止方法java:20: 错误: 无法访问的语句  System.out.println("hhhh");  MenthodText4.java:22: 错误: 缺少返回语句
	}
	
	public static int f()  //当不传递数据时括号里面什么都不用写，不要在里面写void
  {
  	return 24;
  }	
	
	public static void main(String[ ] args)
	{
		int a = chufa(10,2);
		System.out.println(a);
		System.out.println(chufa(6,2));  //也可以这样打印输出结果
		
		m1(3,6);  //这样就是选择不接受返回值，但还是会输出 hhhh
		
		int i;
		i = MethodText1.f();
		System.out.println(i);
		
	}
}