/*
����ͨ�����͵ݹ鷽����׳�

5�Ľ׳��� 5*4*3*2*1
*/

public class RecursionText3
{
	public static void main(String[ ] args)
	{
		int n = 5;
		int retValue = m1(n);
		System.out.println(retValue);
		
	}
	//�ݹ鷽��
	public static int m1(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		return n * m1(n-1);
	}
	
	/*public static int m1(int n)  //��ͨ����
	{
		int result = 1;//���ܵ���0
		for(int i=n;i>0;i--)
		{
			result = result * i;  //���������ﶨ���sum�����Ĺ�����һ���ģ�����������֮ǰ�����ݵ�
		}
		return result;
	}
	*/
}