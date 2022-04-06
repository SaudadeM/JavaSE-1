/*
2021年10月24日20:03:31
case合并例子
*/
/*
需求：用户输入1输出星期一，输入2输出星期二......
*/

public class SwitchText2
{
	public static void main(String[ ] args)
	{
		System.out.println("请输入数字");
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		
		switch(num)
		{
			case 1 : case 2:
			   System.out.println("星期一");
			   break;
			case 3:
			   System.out.println("星期三");
			   break;
			case 4:
			   System.out.println("星期四");
			   break;
			case 5:
			   System.out.println("星期五");
			   break;
			case 6:
			   System.out.println("星期六");
			   break;
			case 7:
			   System.out.println("星期日");
			   break;
			default:  //注意双引号
			   System.out.println("对不起，没有这个数字");
		}
		
	}
}