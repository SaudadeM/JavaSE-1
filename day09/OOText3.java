/*
����һ�ַ���дOOText2�е�u.addr = new Address();
*/
public class OOText3
{
	public static void main(String[ ] args)
	{
		User u = new User();
		Address a = new Address();
		u.addr = a;
		System.out.println(u.addr.city);//һ������
		
		a.city = "�ߺ�";
		System.out.println(u.addr.city);
	}
}