/*
关于java语言当中的继承:
1、继承是面向对象三大特征之一,三大特征分别是:封装、继承、多态

2、继承基本的作用是:代码复用。但是继承最重要的作用是:有了继承才有了以后方法的覆盖和多态机制

3、继承语法格式:
[修饰符列表] class类名 extends父类名(
类体=属性+方法

4、java语言当中的继承只支持单继承,一个类不能同时继承很多类,只能继承一个类。在C+中支持多继承。

5、关于继承中的一些术语:
B类继承A类,其中:
A类称为:父类、基类、超类、superclass
B类称为:子类、派生类、subclass

6、在java语言当中子类继承父类都继承哪些数据呢?
私有的不支持继承
构造方法不支持继承
其它数据都可以被继承

7、虽然java语言当中只支持单继承,但是一个类也可以间接继承其它类,例如
C extends B
{
}
B extends A
{
}
A extends T
{
}

8、java语言中假设一个类没有显示的继承任何类,类默认承 JavasEl库当中提供的java.ang. Objecta类
   java语言中任何一个类中都有 object类的特征。
*/
public class CreditAccount extends Account  //继承Account类 语法格式
{
	//信用卡账户类
	//账户名
	//private String actno;  
	
	//余额
	//private int balance;
	//信用度
	private double credit;
	
	//构造方法
	public CreditAccount()
	{
		super();  //super必须放在构造方法里而且是第一个语句  不写super的话默认写super()  所以必须在Account.java里面写上一个无参构造方法
		//super("9527",37);  如果写成这样那么就是调用Account里的有参方法
	}
	//继承了Account里的东西那么就可以少写一点代码
	
	//set credit
	public void setCredit(double xy)
	{
		credit = xy;
	} 
	//get credit
	public double getCredit()
	{
		return credit;
	}
	public void m()
	{
		//balance = 23;
		
	}
	
	
}
//super并不会创建父类的对象，他只是调用构造方法
//在创建子类对象时，会把父类里的成员变量和方法也加载进子类对象的内存（因为要加载进内存，所以要看下这些数据是怎么初始化的，所以调用了父类的构造，仅此而已，并不是去创建了父类对象），
//然后用this和super这两个引用来区分是父类的还是子类的，但是这个内存区域是子类的内存区域，
//绝不是父类的 this不仅指向了父类可继承的成员变量和可继承的方法外，它还指向了子类的成员变量和方法
// 而super仅仅只是指向了子类对象中从父类继承的成员变量和方法。