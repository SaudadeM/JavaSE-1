public class ChineseText
{
	public static void main(String[ ] args)
	{
		Chinese maZi = new Chinese(9527);
		System.out.println(maZi.id);
		System.out.println(Chinese.country);  //��̬�����ĵ����﷨  ����.������
		
		Chinese liSi = new Chinese(6363);
		System.out.println(liSi.id);
		System.out.println(Chinese.country);
	}
}