/*
���ڷ����ĵݹ���ã�

�����ظ��ĵ��ã��ᵼ��ջ�ڴ����

�ݹ��ܲ��õ�ʱ��;�������
*/
public class RecursionText1
{
	public static void main(String[ ] args)
  {
  	System.out.println("������");
  	
  	doSome();
  }
  public static void doSome()
  {
  	System.out.println("÷���");
  	doSome();  //����ǵݹ飬�Լ������Լ���ֻҪû��ͣ�������������ͻ�һֱִ����ȥ����������Ĵ��벻��ִ��
  	System.out.println("���ʽ�");
  }
}