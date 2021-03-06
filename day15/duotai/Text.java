/*
关于java语言当中的多态语法机制:【只是多态的基础语法,多态的作用在后续的例子中讲解】
1、Anima、Cat、ird三个类之间的关系
   Cat承 Anima
   Bird承 Anima1
   Cat和Bird之间没有任何继承关系

2、面向对象三大特征:封装、继承、多态

3、关于多态中涉及到的几个概念:
   向上转型( upcasting)
   子类型->父类型
   又被称为:自动类型转换。
   向下转型( downcasting)
   父类型->子类型
   又被称为:强制类型转换。【需要加强制类型转换符】
需要记忆:
无论是向上转型还是向下转型,两种类型之间必须要有继承关系。
没有继承关系,程序是无法编译通过的
*/

public class Text
{
	public static void main(String[ ] args)
	{
		
		//Anima和Cat之间存在继承关系, Anima是父类,Cat是子类
    //2、 Cat is a Animal【合理的】
    //3、 new cat()创建的对象的类型是cat,2这个引用的数据类型是 Animal,可见它们进行了类型转换
        //子类型转换成父类型,称为向上转型/ upcasting,或者称为自动类型转换
    //4、Java中允许这种语法:父类型引用指向子类型对象
		//子类型对象转换为父类 自动类型装换
		Animal a = new Cat(); //这样写并没有报错 
		
		//Cat b = new Bird() 这样会编译报错因为Cat和Bird没有继承关系
		
		//在编译阶段，编译器会认为a是Animal对象会在Animal类中找这个方法，发现有这个方法，那么编译通过，但是在运行阶段
		//这个move()是指在cat里面的move()方法,因为你的底层对象是Cat
		a.move();//当把Cat里面的move()方法注释后输出 动物在移动  因为只是一个继承，即使把它注释了还是有move（）方法
		
		//此时会编译报错，多态就是指java分为编译阶段和运行阶段.在编译阶段，编译器会认为a是Animal对象会在Animal类中找这个方法
		//但是Animal中并没有这个方法，所以会报错
		//a.dongCi();  
		
		/*
		需求:
					假设想让以上的对象执行 dongCi() 这个子类特有的方法,怎么办?
					a是无法直接调用的,因为a的类型是 Anima, Anima.中没有 dongCi()方法。
					我们可以将a强制类型转换为Cat类型。
					a的类型是 Anima1(父类),转换成Cat类型(类),被称为向下转型/ downcasting/强制类型转换
					注:向下转型也需要两种类型之间必须有继承关系。不然编译报错。强制类型转换需要加强制类型转换符。
					什么时候需要使用向下转型呢?
					当调用的方法是子类型中特有的,在父类型当中不存在,必须进行向下转型。
		*/
		
		//  当要调用子类中特有的方法时就要用到向下转型
		//调用Cat中的dongCi()方法
		Cat c = (Cat)a;  //因为在编译的时候a是Animal类型，c是Cat类型，这两个是继承关系。运行时：事实上底层中a指向的是Cat对象，而c也是Cat所以运行也没问题 
		c.dongCi();    //
		
		Animal b = new Bird();
		//编译没有错，运行出错 java.lang.ClassCastException 编译时编译器认为b是指向Animal对象，Animal和Cat有继承关系，所以没错
		//运行时：b事实上指向的是Bird对象，Bird和Cat没有指向关系，所以运行出错
		//Cat a1 = (Cat)b;
		
		//应该这样写 这是一种规范，你也可以直接写 Brid a1 = (Bird)b 而不写instanceof 你可以理解为instanceof是用来检测向下转换时可以调用哪个累的方法
		/*
		1、以上异常只有在强制类型转换的时候会发生,也就是说下转型存在隐患(编译过了,但是运行错!)
		2、向上转型只要编译通过,运行一定不会出问题: nimal a- new cat
		3、向下转型编译通过,运行可能错误: Animal a3=ne
		4、怎么避免向下转型出现的 ClassCastExceptionl呢?
		使用 instanceof运算符可以避免出现以上的异常
		5、 instanceof运算符怎么用?
		5.1、语法格式
		(引用 instanceof 数据类型名)
		5.2、以上运算符的执行结果类型是布尔类型,结果可能是rue/ false
		5.3、关于运算结果true/ false
					假设:( a instanceof Animal)
					true表示:
					a这个引用指向的对象是一个 Anima1类型
					false表示:
					a这个引用指向的对象不是一个 Anima1类型。
		*/
		
		if(b instanceof Bird)
	  {
	  	Bird a1 = (Bird)b;
	  	a1.fly();
	  }
	  else if(b instanceof Cat)
	  {
	  	Cat a2 = (Cat)b;
	  	a2.dongCi();
	  }
		  
	}
}