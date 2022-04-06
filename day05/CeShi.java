public class CeShi
{
	public static void main(String[ ] args)
	{
		int i = 4;
		System.out.printf("%d\n",i);
		System.out.printf("%d",i);
		//System.out.println("%d",i);  编译错误，不能写%d。可能是System.out.println的源代码里就有了输出十进制的代码，在写%d就会报错
		System.out.println("" + 'a'+1);//a1  是因为字符串和a相加还是字符串，字符串在和1相加也是字符串，所以输出a1
		System.out.println('a' + 1);//98
		System.out.println("");
		System.out.println('a');//a  当只有字符的时候后输出的是字符，当时'a'+1的时候则会把a换成ASCII相加
	}
}