/*
需求：不同的人购物显示不同的名字
关于java中的this关键字  this里面存放的是所创建对象的地址 详见截图day13Cusmoter
于java语言当中的this关键字:
1、this是一个关键字,翻译为:这个
2、this是个引用,this是个变量,this变量中保存了内存地址指向了自身,this存储在内存java对象内部。
3、创建100个java对象,每一个对象都有thi,也就说有100个不同的this
4、this可以出现在实例方法当中,this指向当前正在执行这个动作的对象。(this代表当前对象)

*/
public class Cusmoter
{
	String name;
	//构造无参方法
	public Cusmoter()
	{
		
	}
	
//不带有 static关键字的一个方法
//顾客购物的行为
//每一个顾客购物最终的结果是不一样的
//所以购物这个行为是属于对象级别的行为
//由于每一个对象在执行购物这个动作的时候最终结果不同,所以购物这个动作必须有“对象的参与
//重点:没有 static关键字的方法被称为实例方法”,实例方法怎么访问? 引用.〃
//重点:没有 static关键字的变量被称为实例变量
//注意:当一个行为/动作执行的过程当中是需要对象参与的,那么这个方法一定要定义为实例法,不要带 'static'关键字
//以下方法定义为实例方法,因为每一个顾客在真正购物的时候,最终的结果是不同的。所以这个动作在完成的时候必须有对象的参与
	//普通方法 
	public void shopping()
	{
		//System.out.println(name + "在购物");  //这是省略了this的写法 因为name是实例变量，所以要使用他要通过 引用. 的方法访问 所以说不完整
		//上面的不是完整的写法，完整写法应该是
		System.out.println(this.name + "在购物");  //每个this都是自己这个对象
	}
	
	//带有static的方法访问name  调用此方法是 类名.方法名(形参)
	/*public static void m()
	{
		System.out.println(name);  //此时会报错，因为name是实例变量要创建对象才可以访问
		System.out.println(this.name);//即使加上this也不行，因为上下文当中并没有当前对象，自然就没有this
	}*/
	
	//那么有static的方法如何调用name呢
	public static void m()
	{
		//创建对象
		Cusmoter w = new Cusmoter();
		System.out.println(w.name);
	}
}