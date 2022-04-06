public class ThisText2
{
	public static void main(String[ ] args)
	{
		User u = new User(9527,"梅子淇");
		System.out.println(u.getId());
		System.out.println(u.getName()); //
		//既然在创建对象的时候将值给改了，那么为什么还需要set 假如想修改这个对象里面的name但是又不想创建对象，那么这时就需要set
		
	}
}