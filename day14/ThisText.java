/*
�ڴ���static�ķ����в���ֱ�ӵ���ʵ��������ʵ������
��Ϊʵ��������Ҫ����Ĵ���
��static����û��this��Ҳ����˵��ǰ���󲻴���
*/
public class ThisText
{
	public static void main(String[ ] args)
	{
		ThisText tt = new ThisText();     //����static�ķ���Ҫ����û��staticҪ�ȴ�������
		
		//ͨ��  ����. �ķ�������
		tt.f();
		
		// this.f();  //���this����д�ڴ���������Ǹ�������
		
		tt.m();
	}
	
	//ʵ������  
	public void f()
	{
		System.out.println("9527");  //��������������Ҳ����һ��������ôthisҲ���ܳ��������������
	}
	
	//ʵ������
	public void m()
	{
		this.f();
		f();     //ʡ��this��дҲ��
	}
}