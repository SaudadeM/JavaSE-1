public class Cat extends Animal  //继承Animal类
{
	public void move() //这一行的要和父类的一样 
	{
		System.out.println("猫再走猫步");
	}
	//假设Anima里面有很多的方法，继承之后发现我想改其中的一个方法，因为cat是走猫步的，bird是飞的，所以想改move这个方法但是又不想改其他的（继承）
	//那么这时候就要方法覆盖率
}