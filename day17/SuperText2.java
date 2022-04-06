//在恰当的时间使用super（实参列表）  详见截图
/*

2、注意在构造方法执行过程中虽然一连串调用了父类的构造方法
父类的构造方法又继续向下调用它的父类的构造方法,但是实际上
对象只创建了一个

3、super(实参)到底是干啥的
super(实参)的作用是:初始化当对象的父类型特征。  把父类的特征继承过来，那么这部分特征就是自己的
并不是创建新对象实际上对象只创建了1个

4. supera关键字代表什么呀?
super关键字代表的就是“当前对象的那部分类型特征。
我继承了我父亲的一部分特征
例如:眼睛、皮肤等
uper代表的就是眼睛、皮肤等
眼睛、皮肤等〃然是继承了父亲的,但这部分是在我身上呢。
*/

public class SuperText2
{
	public static void main(String[ ] args)
	{
		CreditAccount u = new CreditAccount("王二麻子",9527,0.8);
		
		System.out.println(u.getActno() + "\n"+ u.getBalance()+"\n"+u.getCredit());
	}
}

class CreditAccount extends Account  //继承Account类 语法格式
{
	
	//信用度
	private double credit;
	
	//构造无参方法
	public CreditAccount()
	{
		 
	}
  //构造有参方法
	public CreditAccount(String actno,int balance,double credit)  //因为actno和balance都是私有属性不能被继承，但是想访问的话可以通过super去调用Acctno里的有参方法
	{
	   super(actno,balance);  //调用父类的有参方法  注意括号里不要写成字面值
	   this.credit = credit;
	}
	
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
	
}


class Account
{
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