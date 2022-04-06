/*
   基本数据类型之间的转换：详见  E:\截图  第一，三张
   
   注意编译是编译运行是运行要把他们分开  列如：byte i = 6; short j = 3;   long t = i/j; i和j都转换成int型所以他们相处的结果也是
   整型，但是整型不能赋给long(假设是不能运行的)，所以会编译出错，但是你这样想：六除二等于三，把三赋给t没毛病。这样想是错的，因为你想的是运行阶段
   连编译阶段都过不了怎么可能过运行阶段呢
*/
public class DateType7
{
	public static void main(String[ ] args)
	{
		byte i = 6;
		short j = 3;
		long t = i/j;
		System .out.println(t);
	}
}