/*
     根据变量的位置来分可以分为局部变量和成员变量
	     局部变量就是方法体里面的变量
		 成员变量就是在方法体之外类之内的变量
         在不同的方法体当中变量名是可以相同的
          在同一个方法体当中变量名是不可以相同的（类比C语言函数）

*/

public class VarText4
{
    static int i = 12;     //类体中不能写java语句，但是可以定义变量  

	public static void main(String[ ] args)
	{
		int i = 6;         //局部变量
		System.out.println(i);    //输出i=6 说明此时的i是1局部变量，即就近原则。类比C语言
	}
	public static void doSome()
	{
		int i = 13;       //在不同的方法体当中变量名是可以相同的
	}
}
/*
*ssc
*ccc
*cccac
*/