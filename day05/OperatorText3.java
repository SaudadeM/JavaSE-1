/*
拓展类赋值运算符：+=  -=  *=  /=  %=
*/

//拓展类赋值运算符和C语言的区别
public class OperatorText3
{
	public static void main(String[ ] args)
	{
		byte i = 13;
		//i = i + 4; 会编译出错，因为i+4运算后的结果是int类型
		i = (byte)(i+4);//这样就没问题
		
		byte x = 6;
	  x += 5;
	  System.out.println(x);//x += 5  等价于 x = x+5 按照上面的说法应该不能编译，但却成功编译，说明他们两个并不等价x += 5应该等价于(byte)(x+5)
	                        //注意有时候会损失精度
	}
}