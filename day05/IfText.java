public class IfText
{
	public static void main(String[ ] args)
	{
		System.out.print("����������");//д��print����λ�þͻ���������������
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		if(num>=0 && num<=5)
		  System.out.println("����");
		else if(num>=6 && num<=10)
		    System.out.println("�ٶ�");
		else if(num>=11 && num<=18)
		   System.out.println("������");
		else if(num>=19 && num<=35)
		   System.out.println("����");
		else if(num>=36 && num<=55)
		   System.out.println("����");
		else
		   System.out.println("����");
	}
}