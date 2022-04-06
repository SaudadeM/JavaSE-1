public class IfText
{
	public static void main(String[ ] args)
	{
		System.out.print("请输入年龄");//写成print光标的位置就会在请输入年龄后边
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		if(num>=0 && num<=5)
		  System.out.println("幼年");
		else if(num>=6 && num<=10)
		    System.out.println("少儿");
		else if(num>=11 && num<=18)
		   System.out.println("青少年");
		else if(num>=19 && num<=35)
		   System.out.println("青年");
		else if(num>=36 && num<=55)
		   System.out.println("中年");
		else
		   System.out.println("老年");
	}
}