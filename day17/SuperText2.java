//��ǡ����ʱ��ʹ��super��ʵ���б�  �����ͼ
/*

2��ע���ڹ��췽��ִ�й�������Ȼһ���������˸���Ĺ��췽��
����Ĺ��췽���ּ������µ������ĸ���Ĺ��췽��,����ʵ����
����ֻ������һ��

3��super(ʵ��)�����Ǹ�ɶ��
super(ʵ��)��������:��ʼ��������ĸ�����������  �Ѹ���������̳й�������ô�ⲿ�����������Լ���
�����Ǵ����¶���ʵ���϶���ֻ������1��

4. supera�ؼ��ִ���ʲôѽ?
super�ؼ��ִ���ľ��ǡ���ǰ������ǲ�������������
�Ҽ̳����Ҹ��׵�һ��������
����:�۾���Ƥ����
uper����ľ����۾���Ƥ����
�۾���Ƥ���ȡ�Ȼ�Ǽ̳��˸��׵�,���ⲿ�������������ء�
*/

public class SuperText2
{
	public static void main(String[ ] args)
	{
		CreditAccount u = new CreditAccount("��������",9527,0.8);
		
		System.out.println(u.getActno() + "\n"+ u.getBalance()+"\n"+u.getCredit());
	}
}

class CreditAccount extends Account  //�̳�Account�� �﷨��ʽ
{
	
	//���ö�
	private double credit;
	
	//�����޲η���
	public CreditAccount()
	{
		 
	}
  //�����вη���
	public CreditAccount(String actno,int balance,double credit)  //��Ϊactno��balance����˽�����Բ��ܱ��̳У���������ʵĻ�����ͨ��superȥ����Acctno����вη���
	{
	   super(actno,balance);  //���ø�����вη���  ע�������ﲻҪд������ֵ
	   this.credit = credit;
	}
	
	//set credit
	public void setCredit(double xy)
	{
		credit = xy;
	} 
	//get credit
	public double getCredit()
	{
		return credit;
	}
	
}


class Account
{
	//�˻���
	private String actno;  //�޷��̳�
	
	//���
	private int balance;   //�޷��̳�
	
	//���췽��
	public Account()    //�޷��̳�,ֻ��ͨ��super����
	{
		
	}
	
	
	//�вη���   //�޷��̳�,ֻ��ͨ��super����  super���β��б�  
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