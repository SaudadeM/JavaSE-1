public class FinalText2
{
	public static void main(String[ ] args)
	{ 
		final User u = new User(); //编译通过
		u = new User(6,7);  //编译报错。 因为引用u被final修饰，一单指向某个对象之后就不能再指向其他的对象
	}
}

class User
{
	int i;
	int t;
	
	public User()
	{
		
	}
	
	public User(int i,int j)
	{
		this.i = i;
		this.t = j;
	}
}