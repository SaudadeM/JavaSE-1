/*
   逻辑运算符：
              &：逻辑与【并且】
              |：逻辑或【或者】
              !：逻辑非 取反，！true是false  ！false是true
              ^：逻辑异或  只要两边的结果不一样那么他就是true
              
              ||:短路或，和C语言的一样 最后的运算结果和逻辑或是一样的
              &&:短路与，和C语言的一样 最后的运算结果和逻辑与是一样的
             
   逻辑与与短路与运算结果是一样的，只不过短路与存在短路现象           
*/

public class OperatorText2
{
	public static void main(String[ ] args)
	{
		int i = 3;
		int j = 5;
		//逻辑或运算
		System.out.println(i > 2 | i++>24);//输出结果是true
		System.out.println(i); //输出结果是 4   说明 | 右边的不等式也计算了所以i才会等于4
		//短路或运算
		System.out.println(j > 2 || j++>24);//输出结果是true
		System.out.println(j);//输出结果是5
		/*
		逻辑或与短路或的区别就在于后面的表达式运不运算，逻辑或是当得出结果后后面的表达式还运算，而短路或是不运算的，相对来说短路或更加智能
		但是有时候还是会用到逻辑或
		*/
	}
}