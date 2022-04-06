public class Text
{
	int num = 12;
	public static void main(String[ ] args)
	{
		//System.out.println(num); 编译报错，因为num是实例变量 要创建对象才能访问
		//创建对象
		Text t = new Text();
		System.out.println(t.num);
	}
}