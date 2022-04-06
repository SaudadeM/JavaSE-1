public class SuperText7
{
	int i = 3;
	public static void main(String[ ] args)
  {
  	SuperText7 a = new SuperText7();
  	a.doSome();
  	
  }
  
  public void doSome()
  {
  	System.out.println(this);  //输出SuperText7@15db9742  这是对象的地址
  	//System.out.println(super);//报错 说明super不存放内存地址 super只是代表当前对象内部的父类特征
  	//System.out.println(super.i);//报错 可参见Text4的内存图 super指向的是父类即object，但是这个类里面没有int i
  }
}

