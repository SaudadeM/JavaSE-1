public class ExtendsText
{
	public static void main(String[ ] args)
	{
		CreditAccount u = new CreditAccount();
		u.setActno("9527");  //虽然actno和balance不能被被继承但是可以通过set。get去访问
		u.setBalance(666);
	  u.setCredit(0.9);
		System.out.println(u.getActno() + "\n"+ u.getBalance());
	}
}