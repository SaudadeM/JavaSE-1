public class jisuanqi
{
	public static void main(String[ ] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("����������");
		double a = s.nextInt();
		
		System.out.println("�������������");
		String yunSuanFuHao = s.next();
		
		System.out.println("���ٴ���������");
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
			  System.out.println("��Ч����");
			
		}
		
	}
}