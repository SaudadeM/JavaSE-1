/*
  什么是变量
            变量包括三个部分：数据类型 变量名 字面值【数据】

			变量的定义和赋值【初始化】和C语言的一样

   访问一个变量有两种方式一种是读取，一种是修改
*/

public class VarText1  //var是变量的意思
{ 
	public static void main(String[ ] agrs)
	{
		int i = 2;
		System.out.println(i);//不用加双引号，HelloWorld程序里面加双引号是因为他是字符串
	   // float b = 3.14;   //这是错误的 从double转换到float可能会有损失   3.14是double类型  但是在3.14后面加F就不会出错
		double b = 3.14;
		System.out.println(b);
	
	}
}