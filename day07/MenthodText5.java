/*
return���ֻҪִ�У����ڵķ���ִ�н���
�� *ͬһ��������* ���У�return������治�ܱ�д��� ���ܱ�д�����ָreturn��¶�Ǽ�
public static void main(String[ ] args)
	{
		System.out.println(m());
		return;
		System.out.println("4");  ��ʱ�����return��¶���������еĴ���ᱨ������ͬһ���������С�
	}
��return��for����if���������滹����д����38-45��
*/

public class MenthodText5
{
	public static void main(String[ ] args)
	{
		System.out.println(m());
	}
	
	public static int m()
	{
		/*int a = 10;
		if(a>3)
		{
			return 1;   �����������Ϊ�ڱ��������������Ϊ���������ִ��Ҳ���ܲ�ִ�У�������д���Ƿ���һ������ֵ�����Ի�������
		}*/
		
		/*int a = 10;
		if(a>3)
		{
			return 1;
		}
		else   //���벻���������Ϊ��ʹ�����return��ִ�У������Ҳ��ִ��
		{
			return 0;
		}*/
		
		int a = 1;
		if(a>3)
		{
			return 1; 
		}
		System.out.println("HHHH");  //��Ϊ����һ��return����ͬһ���������У��������в��ᱨ��
		return 7;  //��һ���Ĵ���̫�߳�����������д
	}
	
}