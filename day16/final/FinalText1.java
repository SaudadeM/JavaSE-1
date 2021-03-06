/*
关于java语言当中final关键字
1、final关键字，表示最终的不可修改的
2、final修饰的类无法被继承
3、final修饰的方法无法被覆盖
4、final修饰的变量一旦赋值之后,不可重新赋值【不可二次赋值】
5、fina1修饰的实例变量,实例变量必须手动赋值不能使用系统默认值
6、fina1修饰的引用：因为引用u被final修饰，一单指向某个对象之后就不能再指向其他的对象 详见 FinalText2.java
*/

public class FinalText1
{
	//final int i; 编译报错，因为实例变量会自动赋默认值0，那么加了final之后就不能赋值
	final int i;
	//final int i = 3; 编译通过 第一种方法 
	
	int a;  //27行
	
	static final int g = 4;  //编译通过                                                            
	public static void main(String[ ] args)
	{
		final int i = 3;
		System.out.println(i);
		//i = 5; 编译报错 错误: 无法为最终变量i分配值 因为被final修饰的变量无法二次赋值
		
		//创建对象
		FinalText1 c = new FinalText1();
		//c.a = 78;
		System.out.println(c.a);  //实例变量也有默认值
	}
	public FinalText1()
	{
		this.i = 3;  //这样也可以编译通过，第二种方法  用构造方法也可以进行赋值  第一种和第二种事实上是一样的
	
	}/*
	public void m(int f)
	{
		f = i;
	}
	*/
}

/*final class a  final修饰的类无法被继承 编译报错 无法从最终a进行继承  
{
	
} 

class c extends a
{
	
}
*/
class b
{
	public final void f()
	{
		System.out.println("haha");
	} 
}

class e extends b
{
	/*public final void f()  //编译是会报错  错误: e中的f()无法覆盖b中的f()  因为 被final修饰的 方法是无法被覆盖的
	{
		System.out.println("www");
	}*/ 
}