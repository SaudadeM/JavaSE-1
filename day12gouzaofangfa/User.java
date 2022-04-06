public class User
{
	
	int j;
	//构造方法
	public User()    //当你要创建对象，构造方法时就不用写void并且方法名和类名一样
	{
		System.out.println("haha");
	}
	public User(int i)   
	{
		System.out.println(i);
	}
	
	public User(double i)
	{
		System.out.println(i);
	}
	
	public User(String i)
	{
		System.out.println(i);
	}
	
	public User(byte i)
	{
		System.out.println(i);
	}
	
	
	public void f()  //这个不是构造方法他只是对象里面的东西
	{
		System.out.println("fff");
	}
}