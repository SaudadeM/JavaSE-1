/*
ʲô�����this.����ʡ��
����������ʵ�������;ֲ�����ʱthis�Ͳ���ʡ
*/
public class User
{
	private int id;
	private String name;
	
	//���췽��
	public User(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id) //��������Ҳд��id
	{
		this.id = id;  //Ҫ��������id��ʾ����ͬһ������ ��Ҫ��ǰ���id�ϼ�this��ʾ���id��ʵ������
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name) 
	{
		this.name = name;  //Ҫ��������name��ʾ����ͬһ������ ��Ҫ��ǰ���name�ϼ�this��ʾ���name��ʵ������
	}
	public String getName()
	{
		return name;
	}
}