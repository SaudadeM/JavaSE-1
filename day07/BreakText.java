/*
break���÷���C���Ե�һ��
*/
public class BreakText
{
	public static void main(String[ ] args)
	{
		for1:for(int i=3;i<16;++i)
		{
			for2:for(int j=4;j<9;++j)
			{
				if(j>7)
				{ 
					break for1;     //Ĭ�������break��ֹ���������forѭ��������forѭ����������֮��Ϳ�����ֹ��һ��forѭ����
				}
				System.out.println("hahaha");
			}
		}
	}
}