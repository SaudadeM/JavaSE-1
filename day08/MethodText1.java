/*
�������³������JVM�е�ִ������  ������ֻ�/�ʼ�/day08Methodtext1�ڴ�ͼ��
��ultraedit�к�ɫ�����ʾ������֣�����String��System������������Ҳ������class�ļ�

*/public class MethodText1
{
	public static void main(String[ ] args)
	{
		int a = 10;
		int b = 20;
		int retvlue = sumInt(a,b);
		System.out.println(retValue);
	}
	
	public static int suumInt(int i,int j)
	{
		int result = i + j;
		int num = 3;
		int retValue = divide(result,num);
		return retValue;
	}
	
	public static int divide(int x,int y)
	{
		int z = x/y;
		return z;
	}
}