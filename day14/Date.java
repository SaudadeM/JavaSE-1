/*
this����������
  1.����ʵ������������ǰ����  this.����
  2.���ڹ��췽�����У�ͨ����ǰ�Ĺ��췽�����������Ĺ��췽��  �﷨��ʽthis��ʵ�Σ�
  this()ֻ�ܳ����ڵ�һ��
*/

public class Date
{
	//����˽�л�
	private int yeah;
	private int month;
	
	//�����вη���
	public Date(int yesh,int month)
	{
		this.yeah = yeah;
		this.month = month;
	}
	
	//���󣺵������޲η���ʱ��Ĭ�ϴ����������� 1992.1
	//�����޲η���
	public Date()
	{
	  //��һ�ַ���  ���ַ���̫�鷳��Ҫд������������һ�ٸ�������Ҫдһ�ٴ�
	  //this.yeah = 1992; //ǰ��Ҫ��this����Ȼ���ḳֵ
	  //this.month = 1;
	  //�ڶ��ַ��� �ڲ������¶����ǰ���µ����вη���
	  //new Date(1992,1)  ���ֲ�����Ϊ������һ���¶���
	  this(1993,1);  //�൱�ڷ�������
	  System.out.println("ff");
	}
	
	public void setYeah(int yeah)
	{
		this.yeah = yeah;
	}
	public int getYeah()
	{
		return yeah;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	public int getMonth()
	{
		return month;
	}
}