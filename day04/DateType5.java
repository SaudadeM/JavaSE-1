/*
关于浮点数据类型：
      所占字节数和C语言的一样
      其实double的精度也不算高，因此sun公司给java设计了另一个精度跟高的数据类型，这种数据类型叫引用数据类型
      
      在java中所有的浮点数都当做double类型来处理【类比于整数类型】
      要想该数字被当做float来处理就在字面值后面加F/f   E:\java-上课敲的代码\day02\VarText1.java的错误原因就在于此
      java和C语言一样浮点数都不能准确存储
*/

public class DateType5
{
	public static void main(String[ ] args)
	{
		double i = 3.14;
		System.out.println(i);//可以输出没有问题
		//float j = 3.12;  不能输出因为3.12是double类型，高精度不能转换成低精度
		//System.out.println(j);
		float j = 3.12F;  //这样写不会精度损失，因为并不是强制类型转换
		System.out.println(j);
		/*
		float g = (float)2.12;  这样是强制类型转换，会损失精度
		System.out.println(g);
		*/
	}
}

