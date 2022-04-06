/*
构造方法的作用：1创建对象  2给实例变量赋值

实例变量的内存空间是在构造方法执行的时候完成开辟的
*/

public class Account
{
	//账户类
	//账户名
	private String actno;  //私有化属性
	
	//余额
	private int balance;
	
	//如果不构造方法也是可以创建对象，是因为系统为你缺省构造
	
	//构造方法
	public Account()
	{
		//初始化实例变量的内存空间 系统默认1赋值
		//actno = null; 
		//balance = 0;
	}
	
	//有参方法
	public Account(String a)
	{
		actno = a; //这里也可以修改值  创建对象的同时给actno赋你自己输入的值
		//balance = 0  系统默认赋值
	}
	
	//有参方法
	public Account(String a,int i)
	{
		actno = a; //这里也可以修改值
		balance = i;
	}
	
	
	//set actno
	public void setActno(String zhangHu)
	{
		actno = zhangHu;
	} 
	//get actno
	public String getActno()
	{
		return actno;
	}
	
	//set balance
	public void setBalance(int yuEr)
	{
		balance = yuEr;
	} 
	//get balance
	public int getBalance()
	{
		return balance;
	}
	
}