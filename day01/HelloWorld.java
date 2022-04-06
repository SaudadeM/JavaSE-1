//class后面的是类名   public表示公开的  class表示定义一个类  HelloWorld表示一个类名
public class HelloWorld    //定义一个公开的类，起名叫HelloWorld      public class HelloWorld l里面的就是类体
{  

    //static表示静态的
	//void表示空的
	//main表示方法名是main
	//(String[ ] args)是main方法的形参列表
	//以下的方法是一个程序的主方法，是程序执行的入口。这个格式是固定的
	 public static void main(String[ ] args)          //表示定义一个公开的静态的主方法    里面的就是方法体        
	{                                                                                           
           System.out.println("HelloWorld!");   //表示向控制台输出参数
		   System.out.println("好好“hhs”!");     //hhs的双引号必须要用中文的，如果用英文的话会与最后面的引号配对                               
	 }

}

//把public class HelloWorld里的public删掉也可以，这样你可以定义多个类
