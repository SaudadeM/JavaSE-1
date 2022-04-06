/*
final修饰的实例变量一般和static联合使用，被称为常量
*/

public class FinalText3
{
	public static void main(String[ ] args)
	{ 
		//Chinese.country = "冰岛";
		//System.out.println(Chinese.country);
		
		System.out.println(Chinese.GUO_JI);
		//Chinese.GUO_JI = "hh";  报错 因为加了final
	}
}

class Chinese
{
	//需求：要求国籍是中国，而且国籍不可变
	//static String country = "中国";  //此时的国籍仍然可以变
	public static final String GUO_JI = "中国"; //此时就不可以改变国籍，并且有了static就不用那么费内存，不用创建对象就可以访问，因为GUO_JI这个变量是放在方法区内存
	/*

		finall修饰的实例变量是不可变的,这种变量和static联合使用被称为常量
		
		常量的定义语法格式:
		                   public static fina 数据类型 常量名 = 值
		
		java规范中要求所有常量的名字全部大写,每个单词之间使用下划线连接
	*/
}


