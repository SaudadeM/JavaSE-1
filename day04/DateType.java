public class DateType
{
	public static void main(String[ ] args)
	{
		char c = 'a';
		System.out.println(c);
		c = '过';
		System.out.println(c);   //输出过，说明java一个中文占两个字节
		
		//char b = "w"; 不能这样写，因为b只能存放字符不能存放字符串
		//System.out.println(b);
	}
}