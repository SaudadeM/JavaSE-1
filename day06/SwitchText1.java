 /*
java中的switch和C语言的一样，但是有两点区别
    1.switch()括号里面除了可以写int也可以写String即字符串，所以case后面也可以写String字面值  当然case和switch后面
    也可以写byte。short。char  因为可以自动类型转换，记住不可以写long，因为不能自动类型转换,v如果要写的话要加上强制类型转换
    case和switch后面也可以写 字符类型
    2.switch里面的case可以合并
      int j = 2
      switch(j)
      
          {
               case 2:case 3:case 5:
                   Sysem.out.println("ggg")           
          }
          执行case 2时会输出ggg 当j=3的时候输出ggg 当j=5的时候输出ggg   是只输出一遍ggg，只有j变成了其他值才会再次输出ggg
*/
public class SwitchText1
{
	public static void main(String[ ] args)
	{
		byte j = 2;
    switch(j)
      
      {
           case 3:case 2:case 5:
               System.out.println("ggg");           
      }
      
    long i = 3;
    switch((int)i)
      {
      }
    
    String k = "hh";
    switch(k)
    { 
    	 case "hh":      //注意这里要加双引号
    	 
    	   System.out.println("lll");
    }
     
	}
}