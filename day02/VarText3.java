/*
    java中的变量作用域
	     作用域就是指变量的作用范围
    只要记住一句话就行出了大括号{}就不可以用了，这个大括号是指离得最近的大括号 类比于C语言的函数
*/

public class VarText3
{   
     
	 static int k = 7;       //这就相当于C语言的全局变量,所以在doSome方法体中可以用，在main中也可以 ,但是不能在aaa类中用因为大括号
     public static void main(String[ ] args)    //i的作用域是main
	{
				 int i = 7;       
				 System.out.println(i);
				 for(int j = 3;k<8;++k)
				{
				 
				 }
                 //System.out.println(j);    //for循环里面的变量只能在for循环里面使用，这和C语言不一样，所以不会输出      

	 }

	 public static void doSome()
	{                                            
          //System.out.println(i);   超出了i的作用域所以不可以用
           System.out.println(k);//输出7
	 }
}

/*
class aaa
{      
	    public static void main(String[ ] args)
	    {
              System.out.println(k);
		}
        
}
*/