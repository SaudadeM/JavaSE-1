/*
���췽�������ã�1��������  2��ʵ��������ֵ

ʵ���������ڴ�ռ����ڹ��췽��ִ�е�ʱ����ɿ��ٵ�
*/

public class Account
{
	//�˻���
	//�˻���
	private String actno;  //˽�л�����
	
	//���
	private int balance;
	
	//��������췽��Ҳ�ǿ��Դ�����������ΪϵͳΪ��ȱʡ����
	
	//���췽��
	public Account()
	{
		//��ʼ��ʵ���������ڴ�ռ� ϵͳĬ��1��ֵ
		//actno = null; 
		//balance = 0;
	}
	
	//�вη���
	public Account(String a)
	{
		actno = a; //����Ҳ�����޸�ֵ  ���������ͬʱ��actno�����Լ������ֵ
		//balance = 0  ϵͳĬ�ϸ�ֵ
	}
	
	//�вη���
	public Account(String a,int i)
	{
		actno = a; //����Ҳ�����޸�ֵ
		balance = i;
	}
	
	
	//set actno
	public void setActno(String zhangHu)
	{
		actno = zhangHu;
	} 
	//get actno
	public String getActno()
	{
		return actno;
	}
	
	//set balance
	public void setBalance(int yuEr)
	{
		balance = yuEr;
	} 
	//get balance
	public int getBalance()
	{
		return balance;
	}
	
}