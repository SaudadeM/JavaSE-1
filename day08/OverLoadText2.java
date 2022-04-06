/*
满足什么条件才可以使用方法重载
   1.在同一个类中
   2.方法名相同
   3.参数列表不相同
       数量不同  数据类型不相同  顺序不同
       
返回值类型不同是不可以使用方法重载。修饰符列表不同也不可以使用方法重载
*/

public class OverLoadText2
{
	public static void main(String[ ] args)
	{
		m1();
		m1(10);
		m1(2,4);
		m2(2.0);
		m2(2);
		m3(3,3.0);
		m3(3.0,3);
	}
	//以下三个构成方法重载【不一定两个才可以】
	public static void m1(int i)
	{
	}
	public static void m1()
	{
	}
	public static void m1(int i,int b)
	{
	}
	//以下两个构成方法重载
	public static void m2(double i)
	{
	}
	public static void m2(int i)
	{
	}
	//以下两个构成方法重载
	public static void m3(int i,double j)
	{
	}
	public static void m3(double j,int i)
	{
	}
	//以下方法不能构成方法重载，这是方法重复
	public static void m4(int i,int j)
	{
	}
	public static void m4(int j,int i)
	{
	}
	
}