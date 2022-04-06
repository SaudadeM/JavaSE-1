public class SuperText8
{
	public static void main(String[ ] args)
	{
		Cat c = new Cat();
		c.dong();
	}
}

class Animal
{
	public void move()
	{
		System.out.println("Animal move");
	}
}

class Cat extends Animal
{
	public void move()
	{
		System.out.println("Cat move");
	}
	
	public void dong()
	{
		this.move();
		move();
		super.move();  //输出结果为Animal move super.后面也可以写方法  当父类和子类中方法名相同时，如果想调用父类的方法就可以加super. 这和变量一样
	}
}