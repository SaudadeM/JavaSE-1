/*
关系运算符：和C语言的类似 
            > >= < <=  == !=   =是赋值运算符不是关系运算符
            关系运算符的运算结果一定是布尔类型
*/

public class operator1
{
	public static void main(String[ ] args)
	{
		int a = 5;
		int b = 3;
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		/*
		输出结果是true
							true
							false
							false
		*/
	}
}