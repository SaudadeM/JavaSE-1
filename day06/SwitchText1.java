 /*
java�е�switch��C���Ե�һ������������������
    1.switch()����������˿���дintҲ����дString���ַ���������case����Ҳ����дString����ֵ  ��Ȼcase��switch����
    Ҳ����дbyte��short��char  ��Ϊ�����Զ�����ת������ס������дlong����Ϊ�����Զ�����ת��,v���Ҫд�Ļ�Ҫ����ǿ������ת��
    case��switch����Ҳ����д �ַ�����
    2.switch�����case���Ժϲ�
      int j = 2
      switch(j)
      
          {
               case 2:case 3:case 5:
                   Sysem.out.println("ggg")           
          }
          ִ��case 2ʱ�����ggg ��j=3��ʱ�����ggg ��j=5��ʱ�����ggg   ��ֻ���һ��ggg��ֻ��j���������ֵ�Ż��ٴ����ggg
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
    	 case "hh":      //ע������Ҫ��˫����
    	 
    	   System.out.println("lll");
    }
     
	}
}