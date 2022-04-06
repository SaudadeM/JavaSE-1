/*
布尔数据类型：在Java中boolean只有两个值即false和true，和C语言不一样，C语言可以用0和1表示真假
在实际存储中false的底层是0，true的底层是1
*/
public class DateType6
{
	public static void main(String[ ] args)
	{
		boolean i = true;
		if(i)  //括号里面不能写成1  会编译错误 错误: 不兼容的类型: int无法转换为boolean   if(1)
		  System.out.println(2 + 3);  //C语言不可以这样写
		else
		  System.out.println("哈哈");
	}
}