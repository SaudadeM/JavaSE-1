/*
2021��10��25��11:54:52

��1-100�����������������

�ܽ᣺1��ǵ���Ҫ��
      2.ͳ�Ƶķ���
*/
public class SuShu
{
	public static void main(String[ ] args)
	{

		for(int i=2;i<=100;++i) //2��һ��
		{
			boolean isSuShu = true; //ע�����ֻ�ܷ��ڷ�ѭ����ߡ�  ������Ǳ�ǣ��ڿ����о����õ�
			for(int j=2;j<i;++j)
			{
				if(i % j == 0)
				{
					isSuShu = false;  //������Ǳ��
					break;  //ע�����breakҪ�������棬������������� 
				}
				
			}
			if(isSuShu)  //ʹ�ñ��
				{
					System.out.println(i);
				}
		}
	}
}
