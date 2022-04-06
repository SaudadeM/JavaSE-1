public class CeShi
{
	public static void main(String[ ] atgs)
	{
		int i = 10;
		CeShi a = new CeShi();  //一个类中没有任何构造方法的话，系统默认提供一个无参数构造器
		//怎么调用
		a.add(3);
		
		a.aff(4);
	}
	//这是普通方法不是构造方法 所以不用遵循不加返回值类型，但是你要调用没有Static的方法的话就要创建对象
	public void add(int i)
	{
		i++;
		System.out.println(i);
	}
	//普通方法
	public void aff(int j)
	{
		System.out.println(j);
	}
}
//别把构造方法和普通方法弄混了就懂了  构造方法没有void 且方法名必须和类名一致  上面两个都是普通方法