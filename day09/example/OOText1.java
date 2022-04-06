/*
创建对象【因为要创建对象才能访问Student.java类里面的状态】
*/
public class OOText1
{
	public static void main(String[ ] args)
	{
			//通过一个类可以实例化多个对象
	   // 实例化对象的语法:new 类名()
		//new是java语言当中的一个运算符
		//new运算符的作用是创建对象,在堆内存当中开辟新的内存空间
		//方法区内存:在类加载的时候, class.字节码代码片段被加载到该内存空间当中
		//栈内存(局部变量):方法代码片段执行的时候,会给该方法分配内存空间,在栈内存中压栈
		//堆内存:new的对象在堆内存中存储  即Student.java的变量内存在堆中
		Student stu = new Student(); //创建对象  格式：new 类名()  stu存放的是类Student的地址，stu相当于指针，只不过没有了*。所以
		                             //要写成Student stu。因为存放的是Student类型的地址
		//System.out.println(stu); 不可以这样输出，要分开输出才可以
		//读取他的值
		System.out.println(stu.no); //stu里存的是Student的地址，所以可以通过stu.no找到no变量
		System.out.println(stu.addr);
		//修改值
		stu.no = 2343;
		System.out.println(stu.no);
		
		Student stude = stu;  //这样写并没有在创建一个对象，只是把stu里面的地址赋给了stude，Stude指向的还是Student这个类
		System.out.println(stude.no);
		
		
	}
}