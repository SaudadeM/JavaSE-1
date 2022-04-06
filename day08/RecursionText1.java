/*
关于方法的递归调用：

不断重复的调用，会导致栈内存溢出

递归能不用的时候就尽量不用
*/
public class RecursionText1
{
	public static void main(String[ ] args)
  {
  	System.out.println("哈哈哈");
  	
  	doSome();
  }
  public static void doSome()
  {
  	System.out.println("梅子淇");
  	doSome();  //这就是递归，自己调用自己，只要没有停下来的条件，就会一直执行下去，导致下面的代码不能执行
  	System.out.println("龙仁杰");
  }
}