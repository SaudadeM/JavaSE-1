/*
在带有static的方法中不能直接调用实例变量和实例方法
因为实例变量需要对象的存在
而static中是没有this。也就是说当前对象不存在
*/
public class ThisText
{
	public static void main(String[ ] args)
	{
		ThisText tt = new ThisText();     //带有static的方法要调用没有static要先创建对象
		
		//通过  引用. 的方法调用
		tt.f();
		
		// this.f();  //这个this不能写在创建对象的那个方法里
		
		tt.m();
	}
	
	//实例方法  
	public void f()
	{
		System.out.println("9527");  //如果这个方法里面也创建一个对象那么this也不能出现在这个方法里
	}
	
	//实例方法
	public void m()
	{
		this.f();
		f();     //省略this不写也行
	}
}