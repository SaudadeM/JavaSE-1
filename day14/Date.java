/*
this可以用在哪
  1.用在实例方法，代表当前对象  this.变量
  2.用在构造方法当中，通过当前的构造方法调用其他的构造方法  语法格式this（实参）
  this()只能出现在第一行
*/

public class Date
{
	//属性私有化
	private int yeah;
	private int month;
	
	//构造有参方法
	public Date(int yesh,int month)
	{
		this.yeah = yeah;
		this.month = month;
	}
	
	//需求：当调用无参方法时，默认创建的日期是 1992.1
	//构造无参方法
	public Date()
	{
	  //第一种方法  这种方法太麻烦，要写变量，假如有一百个变量就要写一百次
	  //this.yeah = 1992; //前面要加this，不然不会赋值
	  //this.month = 1;
	  //第二种方法 在不创建新对象的前提下调用有参方法
	  //new Date(1992,1)  这种不行因为创建了一个新对象
	  this(1993,1);  //相当于方法重载
	  System.out.println("ff");
	}
	
	public void setYeah(int yeah)
	{
		this.yeah = yeah;
	}
	public int getYeah()
	{
		return yeah;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	public int getMonth()
	{
		return month;
	}
}