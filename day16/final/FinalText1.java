/*
����java���Ե���final�ؼ���
1��final�ؼ��֣���ʾ���յĲ����޸ĵ�
2��final���ε����޷����̳�
3��final���εķ����޷�������
4��final���εı���һ����ֵ֮��,�������¸�ֵ�����ɶ��θ�ֵ��
5��fina1���ε�ʵ������,ʵ�����������ֶ���ֵ����ʹ��ϵͳĬ��ֵ
6��fina1���ε����ã���Ϊ����u��final���Σ�һ��ָ��ĳ������֮��Ͳ�����ָ�������Ķ��� ��� FinalText2.java
*/

public class FinalText1
{
	//final int i; ���뱨������Ϊʵ���������Զ���Ĭ��ֵ0����ô����final֮��Ͳ��ܸ�ֵ
	final int i;
	//final int i = 3; ����ͨ�� ��һ�ַ��� 
	
	int a;  //27��
	
	static final int g = 4;  //����ͨ��                                                            
	public static void main(String[ ] args)
	{
		final int i = 3;
		System.out.println(i);
		//i = 5; ���뱨�� ����: �޷�Ϊ���ձ���i����ֵ ��Ϊ��final���εı����޷����θ�ֵ
		
		//��������
		FinalText1 c = new FinalText1();
		//c.a = 78;
		System.out.println(c.a);  //ʵ������Ҳ��Ĭ��ֵ
	}
	public FinalText1()
	{
		this.i = 3;  //����Ҳ���Ա���ͨ�����ڶ��ַ���  �ù��췽��Ҳ���Խ��и�ֵ  ��һ�ֺ͵ڶ�����ʵ����һ����
	
	}/*
	public void m(int f)
	{
		f = i;
	}
	*/
}

/*final class a  final���ε����޷����̳� ���뱨�� �޷�������a���м̳�  
{
	
} 

class c extends a
{
	
}
*/
class b
{
	public final void f()
	{
		System.out.println("haha");
	} 
}

class e extends b
{
	/*public final void f()  //�����ǻᱨ��  ����: e�е�f()�޷�����b�е�f()  ��Ϊ ��final���ε� �������޷������ǵ�
	{
		System.out.println("www");
	}*/ 
}