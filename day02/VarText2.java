/*
方法体中的代码是自上而下执行的
*/

public class VarText2
{
	public static void main(String[ ] agrs)
	{

		int i = 3;
		System.out.println(i);
		/*
		System.out.println(k);   这里有错误是因为方法体里面代码自上而下执行
		int k = 4;
        */
       //int i = 4;
	   //System.out.println(i);这里会错是因为 你定义了两个相同的变量println不知道输出哪个 C语言里也是一样的        
	     //错误: 已在方法 main(String[])中定义了变量 i  int i = 4;  

	}
}