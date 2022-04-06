/*
while循环2021年10月24日23:32:38
*/
public class WhileText
{
	public static void main(String[ ] args)
	{
		/*while(true)  死循环
		{ 
			System.out.println("哈哈");
		} 
		
		System.out.println("vv");   无法编译，因为while是死循环
		*/
		
		int i = 3;
		int j = 5;
		while(j>i)   //死循环
		  {
		  	System.out.println("呵呵");
		  }
		System.out.println("JJ");  //可以编译  是因为在编译期间只检查语法错误，不知道j>i是真还是假 而上面的第七行已经知道了是真的1所以编译报错
		
		
	}
}