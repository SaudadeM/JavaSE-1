/*
在java当中整数型字面值【即整数】会被当做int类型处理，要想这个整形字面值被当做 long 来处理就在这个整形字面值
后面加l/L建议用大写的L

要表示八进制就在这个数字前面加0
要表示十六进制就在前面见0x
*/

public class DateType3
{
	public static void main(String[ ] args)
	{
		int i = 3;
		int j = 023;
		int t = 0x275;
		System.out.println(i);
		System.out.println(j);
		System.out.println(t);
		int k = 7;//系统默认7是一个整形，而k也是整型。所以不存在类型转换
		long b = 366;//366是整型，而b是long型，系统会自动将整形转换成long类型，即低精度转换成高精度
		System.out.println(b);
		//long g = 2147483648;
		//System.out.println(g);  编译错误 错误: 过大的整数: 2147483648   long g = 2147483648;  因为整型最大只能存储2147483647
		long g = 2147483648L;  //这样才对，先把2147483648转换成long才可以输出
		System.out.println(g);
	}
}