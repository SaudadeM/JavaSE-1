/*
java中的方法和C语言函数类似，都是为了解决同类型的功能所设计的。当要使用这个功能的时候，就调用这个方法

类体中可以定义多个方法体，而且没有先后顺序【C语言是有的】

方法体里面不能再定义方法

*/

public class MethodText1
{
  public static void fangfa(int a,int b)   //把这个方法放在main方法下面也可以
  {
     int c = a + b;
     System.out.println(a+"+"+b+"="+c);  	
  }
  
  public static int f()  //当不传递数据时括号里面什么都不用写，不要在里面写void
  {
  	return 3;
  }	
	
	public static void main(String[ ] args)
	{
		MethodText1.fangfa(2,4);
		MethodText1.fangfa(9,4);
		MethodText1.fangfa(2,99);
		int i;
		i = MethodText1.f();
		System.out.println(i);
		return;
	}
}