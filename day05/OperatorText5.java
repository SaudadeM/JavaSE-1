/*
  三目运算符：语法规则 布尔类型 ？表达式1：表达式2
         执行原理：如果布尔类型是真则执行表达式1，假则执行表达式2
*/
public class OperatorText5
{
	public static void main(String[ ] args)
	{
		boolean sex = true;
		char j = sex ? '男' : '女';//变量右边可以写三元运算符
		System.out.println(j);
		//j = sex ? '男' : "女"；不能这样写 错误: 非法字符: '\uff1b'  j = sex ? '男' : "女"； 因为有字符串而你定义的是char类型
		//System.out.println(j);
	}
}
