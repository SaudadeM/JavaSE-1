public class FinalText2
{
	public static void main(String[ ] args)
	{ 
		final User u = new User(); //����ͨ��
		u = new User(6,7);  //���뱨�� ��Ϊ����u��final���Σ�һ��ָ��ĳ������֮��Ͳ�����ָ�������Ķ���
	}
}

class User
{
	int i;
	int t;
	
	public User()
	{
		
	}
	
	public User(int i,int j)
	{
		this.i = i;
		this.t = j;
	}
}