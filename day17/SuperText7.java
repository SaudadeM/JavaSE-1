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
  	System.out.println(this);  //���SuperText7@15db9742  ���Ƕ���ĵ�ַ
  	//System.out.println(super);//���� ˵��super������ڴ��ַ superֻ�Ǵ���ǰ�����ڲ��ĸ�������
  	//System.out.println(super.i);//���� �ɲμ�Text4���ڴ�ͼ superָ����Ǹ��༴object���������������û��int i
  }
}

