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
		super.move();  //������ΪAnimal move super.����Ҳ����д����  ������������з�������ͬʱ���������ø���ķ����Ϳ��Լ�super. ��ͱ���һ��
	}
}