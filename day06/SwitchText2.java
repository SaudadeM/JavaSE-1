/*
2021��10��24��20:03:31
case�ϲ�����
*/
/*
�����û�����1�������һ������2������ڶ�......
*/

public class SwitchText2
{
	public static void main(String[ ] args)
	{
		System.out.println("����������");
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		
		switch(num)
		{
			case 1 : case 2:
			   System.out.println("����һ");
			   break;
			case 3:
			   System.out.println("������");
			   break;
			case 4:
			   System.out.println("������");
			   break;
			case 5:
			   System.out.println("������");
			   break;
			case 6:
			   System.out.println("������");
			   break;
			case 7:
			   System.out.println("������");
			   break;
			default:  //ע��˫����
			   System.out.println("�Բ���û���������");
		}
		
	}
}