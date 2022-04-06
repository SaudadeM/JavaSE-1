/*
2021年10月25日11:54:52

求1-100的素数并将他们输出

总结：1标记的重要性
      2.统计的方法
*/
public class SuShu
{
	public static void main(String[ ] args)
	{

		for(int i=2;i<=100;++i) //2到一百
		{
			boolean isSuShu = true; //注意这个只能放在否循环里边。  这个就是标记，在开放中经常用到
			for(int j=2;j<i;++j)
			{
				if(i % j == 0)
				{
					isSuShu = false;  //这个就是标记
					break;  //注意这个break要放在下面，放上面编译会出错 
				}
				
			}
			if(isSuShu)  //使用标记
				{
					System.out.println(i);
				}
		}
	}
}
