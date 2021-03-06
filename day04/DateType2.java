 /*
java中的char： 转义字符   转义字符出现在特殊字符之前会将特殊字符转义成普通字符
*/

public class DateType2
{
	public static void main(String[ ] args)
	{
     char a = 'w';
     //按理来说应该是错的，但是编译没有报错。所以在java中\n是一个字符而不是字符串，把\n当做一个整体，/ 具有转义的功能
     //这是一个换行符，具有换行的功能
     char b = '\n';
     System.out.print("hello");  //ln具有换行的功能
     System.out.println("world"); //输出结果为helloworld，说嘛ln具有换行的功能
     
     System.out.print("ss");
     System.out.print(b);     
     System.out.println("mei");
     /*
			输出结果为helloworld
								ss
								mei
		 说明\n具有换行的功能
     */
     //键盘上的tab是制表符，虽然功能是一样的，但是实现的方式不一样，因为他们的ASCII码不同
     char c = 't';  //这是一个普通的t字符没有任何的功能
     char d = '\t';
     System.out.print(a);
     System.out.print(d);
     System.out.println(c); //输出结果为：w       t 
     
     //输出一个普通的单引号字符
     //char e = ''';   z这样写是错误的，因为第一个单一号会和第二个配对
     //System.out.println(e);
     
     char f = '\'';  //  '\'具有转义功能，会将第二个单引号转义成一个普通的单引号
     System.out.println(f);                		       
	}
}