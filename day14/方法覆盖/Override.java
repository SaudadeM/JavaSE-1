/*
关于java语言当中方法的覆盖
1、方法覆盖又被称为方法重写,英语单词 override【官方的】 overwrite

2、什么时候使用方法重写?
当父类中的方法已经无法满足当前子类的业务需求
子类有必要将父类中继承过来的方法进行重新编写,
这个重新编写的过程称为方法重写/方法覆盖

3、什么条件满足之后方法会发生重写呢?【代码满什么条件之后,就构成方法的覆盖呢?
方法重写发生在具有继承关系的父子类之间
方法重写的时候:返回值类型相同,方法名相同,形列表相同
方法重写的时候:访问权限不能更低,可以更高。  即当父类是public是那么子类就也只能写public，因为public是最高权限，若父类是private，那么子类可以写public，因为public比private权限高
方法重写的时候:抛出异常不能更多可以更少。以后讲,讲完异常之后才能解释】

4、建议方法重写的时候尽量复制粘贴,不要编,容易出错,导致没有产生覆盖。

5、注意:
私有方法不能继承,所以不能覆盖
构造方法不能继承,所以不能覆盖
静态方法不存在覆盖。【讲完多态之后解释】
覆盖只针对方法,不谈属性
*/
public class Override
{
	public static void main(String[ ] args)
	{
		Animal a = new Animal();
		a.move();
		
		Cat c = new Cat();
		c.move();
		
		Bird b = new Bird();
		b.move();
		
		//假设Anima里面有很多的方法，继承之后发现我想改其中的一个方法，因为cat是走猫步的，bird是飞的，所以想改move这个方法但是又不想改其他的（继承）
		//那么这时候就要方法覆盖率
	}
}