/*
��չ�ำֵ�������+=  -=  *=  /=  %=
*/

//��չ�ำֵ�������C���Ե�����
public class OperatorText3
{
	public static void main(String[ ] args)
	{
		byte i = 13;
		//i = i + 4; ����������Ϊi+4�����Ľ����int����
		i = (byte)(i+4);//������û����
		
		byte x = 6;
	  x += 5;
	  System.out.println(x);//x += 5  �ȼ��� x = x+5 ���������˵��Ӧ�ò��ܱ��룬��ȴ�ɹ����룬˵���������������ȼ�x += 5Ӧ�õȼ���(byte)(x+5)
	                        //ע����ʱ�����ʧ����
	}
}