/*
��java��������������ֵ�����������ᱻ����int���ʹ�����Ҫ�������������ֵ������ long ���������������������ֵ
�����l/L�����ô�д��L

Ҫ��ʾ�˽��ƾ����������ǰ���0
Ҫ��ʾʮ�����ƾ���ǰ���0x
*/

public class DateType3
{
	public static void main(String[ ] args)
	{
		int i = 3;
		int j = 023;
		int t = 0x275;
		System.out.println(i);
		System.out.println(j);
		System.out.println(t);
		int k = 7;//ϵͳĬ��7��һ�����Σ���kҲ�����͡����Բ���������ת��
		long b = 366;//366�����ͣ���b��long�ͣ�ϵͳ���Զ�������ת����long���ͣ����;���ת���ɸ߾���
		System.out.println(b);
		//long g = 2147483648;
		//System.out.println(g);  ������� ����: ���������: 2147483648   long g = 2147483648;  ��Ϊ�������ֻ�ܴ洢2147483647
		long g = 2147483648L;  //�����Ŷԣ��Ȱ�2147483648ת����long�ſ������
		System.out.println(g);
	}
}