/*
break的用法和C语言的一样
*/
public class BreakText
{
	public static void main(String[ ] args)
	{
		for1:for(int i=3;i<16;++i)
		{
			for2:for(int j=4;j<9;++j)
			{
				if(j>7)
				{ 
					break for1;     //默认情况下break终止的是最近的for循环，但是for循环加上名字之后就可以终止第一个for循环了
				}
				System.out.println("hahaha");
			}
		}
	}
}