//测试类  详见截图
public class OOText2
{
	public static void main(String[ ] args)
	{
		//创建对象  u是引用  是局部变量
		User u = new User();
		
		//输出对象的值
		System.out.println(u.no);//0
    System.out.println(u.name);//0
    System.out.println(u.addr);//null
    //赋值
    u.no = 110;
    u.name = "jack";  //这个也和下面的16行一样，只不过不用加new，但实际上还是会创建对象
    u.addr = new Address();  // 要使用u.addr.因为addr是引用数据，所以要使用他就得创建对象，所以此时u.addr里面存放的是对象Address的地址
    u.addr.city = "芜湖";
    //u.addr.city = "芜湖";  //在没给addr创建对象之前不能这样写，因为此时addr并没有存放地址，所以要先创建对象，使其存放地址.所以23行不会输出
    
    System.out.println(u.no);
    System.out.println(u.name);
    
    //System.out.println(u.addr.city);
    
    System.out.println(u.addr.city);
    
    
	}
}