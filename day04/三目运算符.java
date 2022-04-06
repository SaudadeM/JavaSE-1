/*
  java的算术运算符和C语言的一样,三目运算符也一样
*/
//三目运算符
public class 三目运算符
{
	public static void main(String[ ] args)
	{
		int i = 7;
		System.out.println(++i);//输出结果是8  这个和三目运算符的等式一样即++i是前自增，那么等式就是想加之前的值
		System.out.println(i++);//输出结果为8  原理同上
		System.out.println(i);  //输出结果是9  记住这是相加之后的结果
	}
}