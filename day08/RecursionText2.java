/*
�õݹ�ķ�����1-4�ĺ�  ����ֻ��ʼ�/RecursionText2����
*/
public class RecursionText2
{
	public static void main(String[ ] args)
	{
		int n = 4;
		int retValue = sum(4);
		System.out.println(retValue);
	}
	
	public static int sum(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		
		return n + sum(n-1);  //���ǰ�3+2+1����һ�����壬Ȼ���ٴε��ú����ٰ�2+1����һ�������Դ�����
	}
}