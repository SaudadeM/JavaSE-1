 /*
java�е�char�� ת���ַ�   ת���ַ������������ַ�֮ǰ�Ὣ�����ַ�ת�����ͨ�ַ�
*/

public class DateType2
{
	public static void main(String[ ] args)
	{
     char a = 'w';
     //������˵Ӧ���Ǵ��ģ����Ǳ���û�б�����������java��\n��һ���ַ��������ַ�������\n����һ�����壬/ ����ת��Ĺ���
     //����һ�����з������л��еĹ���
     char b = '\n';
     System.out.print("hello");  //ln���л��еĹ���
     System.out.println("world"); //������Ϊhelloworld��˵��ln���л��еĹ���
     
     System.out.print("ss");
     System.out.print(b);     
     System.out.println("mei");
     /*
			������Ϊhelloworld
								ss
								mei
		 ˵��\n���л��еĹ���
     */
     //�����ϵ�tab���Ʊ�������Ȼ������һ���ģ�����ʵ�ֵķ�ʽ��һ������Ϊ���ǵ�ASCII�벻ͬ
     char c = 't';  //����һ����ͨ��t�ַ�û���κεĹ���
     char d = '\t';
     System.out.print(a);
     System.out.print(d);
     System.out.println(c); //������Ϊ��w       t 
     
     //���һ����ͨ�ĵ������ַ�
     //char e = ''';   z����д�Ǵ���ģ���Ϊ��һ����һ�Ż�͵ڶ������
     //System.out.println(e);
     
     char f = '\'';  //  '\'����ת�幦�ܣ��Ὣ�ڶ���������ת���һ����ͨ�ĵ�����
     System.out.println(f);                		       
	}
}