/*
什么情况下this.不能省略
当用来区分实例变量和局部变量时this就不能省
*/
public class User
{
	private int id;
	private String name;
	
	//构造方法
	public User(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id) //想在这里也写成id
	{
		this.id = id;  //要想这两个id表示不是同一个变量 就要在前面的id上加this表示这个id是实例变量
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name) 
	{
		this.name = name;  //要想这两个name表示不是同一个变量 就要在前面的name上加this表示这个name是实例变量
	}
	public String getName()
	{
		return name;
	}
}