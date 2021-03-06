/*
2021年10月21日17:30:57
java中的整型（int byte short long）
*/
public class DateType4
{
	public static void main(String[ ] args)
	{
		long x = 100L;
		System.out.println(x);
		
		//int i = x;  高精度不能向低精度转
		//System.out.println(i);  编译错误  错误: 不兼容的类型: 从long转换到int可能会有损失  int i = x;
		
		int i = (int)x;  //要强制类型转换才行，但是有时候会损失精度
		System.out.println(i);
		/*
		强转原理
		   原始数据： 00000000 00000000 00000000 00000000 00000000 00000000 00000000 01100100
		   转换之后的数据：00000000 00000000 00000000 01100100  即把前面四个字节的数据砍掉，但这次数据没有改变
		*/
		
		long j = 	2147483648L;
		int h = (int)j;
		System.out.println(h);  //输出结果为-2147483648。精度损失严重
		/*
      原始数据 00000000 00000000 00000000 00000000 100000000 00000000 00000000 00000000
      装换之后的数据：10000000 00000000 00000000 00000000
      原码与补码的知识 		
		*/
		
		byte b1 = 50;
		byte b2 = 120;//理论上高精度转换成低精度会报错，但是b1和b2并没有报错
		//byte b3 = 128;//错误: 不兼容的类型: 从int转换到byte可能会有损失 当大于127是会报错，sum公司可能对byte类型有特殊的优化
		              //只要不超过范围就行
		              
		System.out.println("--------------------------------------");
                
		char b5 = 98;
		System.out.println(b5);//
		
		/*
		char  short  byte 类型当在数字面值没有超过这几个数据类型所定义的范围时不会出错
		*/
		
	}
}