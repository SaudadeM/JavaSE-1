public class CeShi
{
	public static void main(String[ ] args)
	{
		int i = 4;
		System.out.printf("%d\n",i);
		System.out.printf("%d",i);
		//System.out.println("%d",i);  ������󣬲���д%d��������System.out.println��Դ��������������ʮ���ƵĴ��룬��д%d�ͻᱨ��
		System.out.println("" + 'a'+1);//a1  ����Ϊ�ַ�����a��ӻ����ַ������ַ����ں�1���Ҳ���ַ������������a1
		System.out.println('a' + 1);//98
		System.out.println("");
		System.out.println('a');//a  ��ֻ���ַ���ʱ�����������ַ�����ʱ'a'+1��ʱ������a����ASCII���
	}
}