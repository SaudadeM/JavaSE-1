public class CusmoterText
{
	public static void main(String[ ] args)
	{
		//创建u对象
		Cusmoter u = new Cusmoter();
		u.name = "王二麻子";
		u.shopping();
		//创建w对象
		Cusmoter w = new Cusmoter();
		w.name = "李二麻子";
		w.shopping();
		//调用m方法
		Cusmoter.m();
	}
}