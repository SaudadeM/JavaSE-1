/*
用另一种方法写OOText2中的u.addr = new Address();
*/
public class OOText3
{
	public static void main(String[ ] args)
	{
		User u = new User();
		Address a = new Address();
		u.addr = a;
		System.out.println(u.addr.city);//一样可以
		
		a.city = "芜湖";
		System.out.println(u.addr.city);
	}
}