public class ConstructorText2
{
	public static void main(String[ ] args)
  {
  	Account u1 = new Account();  //调用无参方法
  	System.out.println(u1.getBalance()); 
  	
  	//调用有参方法
  	Account u2 = new Account("9527"); 
  	System.out.println(u2.getActno());
  	System.out.println(u2.getBalance());
  	u2.setActno("110");  //这里也可以修改值
  	System.out.println(u2.getActno());
  	
  	//调用另一个
  	Account u3 = new Account("520",2000); 
  	System.out.println(u3.getActno());
  	System.out.println(u3.getBalance());
  	
  	
  }
}