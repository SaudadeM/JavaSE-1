/*
final���ε�ʵ������һ���static����ʹ�ã�����Ϊ����
*/

public class FinalText3
{
	public static void main(String[ ] args)
	{ 
		//Chinese.country = "����";
		//System.out.println(Chinese.country);
		
		System.out.println(Chinese.GUO_JI);
		//Chinese.GUO_JI = "hh";  ���� ��Ϊ����final
	}
}

class Chinese
{
	//����Ҫ��������й������ҹ������ɱ�
	//static String country = "�й�";  //��ʱ�Ĺ�����Ȼ���Ա�
	public static final String GUO_JI = "�й�"; //��ʱ�Ͳ����Ըı��������������static�Ͳ�����ô���ڴ棬���ô�������Ϳ��Է��ʣ���ΪGUO_JI��������Ƿ��ڷ������ڴ�
	/*

		finall���ε�ʵ�������ǲ��ɱ��,���ֱ�����static����ʹ�ñ���Ϊ����
		
		�����Ķ����﷨��ʽ:
		                   public static fina �������� ������ = ֵ
		
		java�淶��Ҫ�����г���������ȫ����д,ÿ������֮��ʹ���»�������
	*/
}


