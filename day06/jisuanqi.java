public class jisuanqi
{
	public static void main(String[ ] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("请输入数字");
		double a = s.nextInt();
		
		System.out.println("请输入运算符号");
		String yunSuanFuHao = s.next();
		
		System.out.println("请再次输入数字");
		double b = s.nextInt();
		
		switch(yunSuanFuHao)
		{
			case "+":
			  System.out.println(a+"+"+b+"="+(a+b));  
			  break;
			  
			case "-":
			  System.out.println(a+"-"+b+"="+(a-b));
			  break;
			
			case "*":
			  System.out.println(a+"*"+b+"="+(a*b));
			  break;
			
			case "/":
			  System.out.println(a+"/"+b+"="+(a/b));
			  break;
			
			case "%":
			  System.out.println(a+"%"+b+"="+(a%b));
			  break;
			
			default:
			  System.out.println("无效数字");
			
		}
		
	}
}