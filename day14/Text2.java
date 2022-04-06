public class Text2
{
	public static void main(String[ ] args)
	{
		//调用method2
		Text2 u = new Text2();
		u.method2();
	}
	public void doOther()
	{
		System.out.println("do Other");
	}
	
	public void method2()
	{
		//调用doOther
		this.doOther();  //这里不用创建对象是因为this里面就是所创建对象的地址 this能出现在实例方法和构造方法中
		this.method3();  //即使把6和24注释叶没有报错，因为method2是实例方法，doOther也是实例方法，你要想调用method2要创建对象，那么此时的this就是指向了那个对象，这也就是为什么实例方法里面可以写this，而带有static的方法不行，因为调用带有static的方法并不用创建对象，所以它里面就没有this
	}  //关于this是指24行的this还是6行的this。 谁去调用method2那么this就是谁
	
	public static void method1()
	{
		//调用doOther
		Text2 u = new Text2(); //因为这是带有static的方法要调用就必须创建对象，main里的对象在这里不起作用，反正带static的方法去调用没有static的方法时就是要创建对象  
		//u.doOther();
		//this.doOther();
	}
	
	public static void doSome()
	{
		System.out.println("do some");
	}
	
	public void method3()
	{
		
		
	}
	
	public static void method4()
	{
		//u.doOther();
	}
}