/*
关于super
super:
super能出现在实例方法和构造方法中
super不能使用在静态方法中
super.大部分情况下是可以省略的
siper什么时候不能省略呢
supe()只能出现在构造方法第一行，通过当前的造方法去调用父类中的构造方法，目的是在创建子类对象时先初始化父类对象

4、重要的结论:
当个构造方法第一行
既没有this()又没有super()的话,默认会有一个 -super()
表示通过当前子类的构造方法调用父类的无参数构造方法
所以必须保证父类的无数构造方法是存在的
5、注意
this()和 super()不能共存,它们都是能出现在构造方法第一行
*/

public class SuperText1
{
	public static void main(String[ ] args)
	{
		new B();
	}
}

class A
{
	public A()
	{
		System.out.println("A类的无参数构造方法");
	}
	public A(int i)
	{
		System.out.println("A类的有参数构造方法");
	}
}

class B extends A
{
	public B()
	{
		//super(); 如果不写super这里有一个默认的super（），会去调用父类的无参方法
		//super(3); //这是调用父类的有参数构造方法  此时系统不在提供super() 所以 一个构造方法里面只能写一个super  最好把父类中的无参构造方法写上
		this("王二麻子"); //调用有参方法 有参方法中也默认有suoer(),所以会先执行A类的有参方法  得出结论，无论如何都会先执行父类的方法  
		//super();  会报错，因为与上面的this()冲突，this（）只能写在构造方法第一行，而super()也是，所以super和this()只能存在一个
		System.out.println("B类的无参数构造方法");
	}
	
	public B(String name)
	{
		//super()
		//super(8);
		System.out.println("B类的有参数构造方法");
	}
}

/*
class a
{
}
class b extends a
{
}
class c extends b
{
}

此时c里的super会去调用b类的构造方法，b构造方法里的super会去调用a类的super
其实a类构造方法里的super会去调用系统的object类里的构造方法，object是老祖宗
class object
{
   public object()
   {
   
   }
}



*/