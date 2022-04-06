/*
字符串连接运算符：  “+”作用除了进行加法运算还有一个作用就是字符串连接【就是将两边的东西连接起来，就这一个作用】
                    怎么区别是进行加法运算还是字符串连接：只要加号有一边是字符串就是进行字符串连接
                    连接运算之后的结果还是字符串
*/

public class OperatorText4
{
	public static void main(String[ ] args)
	{
		//比如我要输出我的年龄  age = 35
		int age = 35;
		System.out.println("age = "+age);//注意双引号里边的age不会编译成35。此时的+就是把两边的东西连在一起  输出结果为age=35 类比于C语言
		                                 //printf("age = %d",age);
		//输出  我的年龄35岁了
		System.out.println("我的年龄"+age+"岁了");
		int a = 10;
		int b = 20;
		System.out.println(a + "+ b =" + (a+b) );//是输出结果为 10+b=30
		System.out.println(10 + (20 + "30"));//输出结果为102030.就是因为连接运算之后的结果还是字符串
	}
}