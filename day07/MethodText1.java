/*
java�еķ�����C���Ժ������ƣ�����Ϊ�˽��ͬ���͵Ĺ�������Ƶġ���Ҫʹ��������ܵ�ʱ�򣬾͵����������

�����п��Զ����������壬����û���Ⱥ�˳��C�������еġ�

���������治���ٶ��巽��

*/

public class MethodText1
{
  public static void fangfa(int a,int b)   //�������������main��������Ҳ����
  {
     int c = a + b;
     System.out.println(a+"+"+b+"="+c);  	
  }
  
  public static int f()  //������������ʱ��������ʲô������д����Ҫ������дvoid
  {
  	return 3;
  }	
	
	public static void main(String[ ] args)
	{
		MethodText1.fangfa(2,4);
		MethodText1.fangfa(9,4);
		MethodText1.fangfa(2,99);
		int i;
		i = MethodText1.f();
		System.out.println(i);
		return;
	}
}