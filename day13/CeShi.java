public class CeShi
{
	public static void main(String[ ] atgs)
	{
		int i = 10;
		CeShi a = new CeShi();  //һ������û���κι��췽���Ļ���ϵͳĬ���ṩһ���޲���������
		//��ô����
		a.add(3);
		
		a.aff(4);
	}
	//������ͨ�������ǹ��췽�� ���Բ�����ѭ���ӷ���ֵ���ͣ�������Ҫ����û��Static�ķ����Ļ���Ҫ��������
	public void add(int i)
	{
		i++;
		System.out.println(i);
	}
	//��ͨ����
	public void aff(int j)
	{
		System.out.println(j);
	}
}
//��ѹ��췽������ͨ����Ū���˾Ͷ���  ���췽��û��void �ҷ��������������һ��  ��������������ͨ����