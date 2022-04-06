/*
for循环基本和C语言的一样
*/

public class ForText
{
	public static void main(String[ ] args)
	{
		for(int i=1;i<5;++i)
		{
			System.out.println("haha");
		}
		//System.out.println(i);编译出错，说明i的作用域只在for循环里面 这和C语言不一样
		
		int i = 2;
		for(;i<10;++i)
		{
			System.out.println("kaka");//这样写不会报错
		}
		System.out.println(i); //输出结果为10  说明i可以访问
		
		int k;                //这样写也可以访问k的地址
		for(k=1;k<10;++k)
		{
			System.out.println("jjjj");//这样写不会报错
		}
		System.out.println(k);  
		
		
	}
}