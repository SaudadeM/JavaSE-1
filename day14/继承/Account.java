public class Account
{
	//账户类
	//账户名
	private String actno;  //无法继承
	
	//余额
	private int balance;   //无法继承
	
	//构造方法
	public Account()    //无法继承,只能通过super调用
	{
		
	}
	
	
	//有参方法   //无法继承,只能通过super调用  super（形参列表）  
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