public class ConstructorText2
{
	public static void main(String[ ] args)
  {
  	Account u1 = new Account();  //�����޲η���
  	System.out.println(u1.getBalance()); 
  	
  	//�����вη���
  	Account u2 = new Account("9527"); 
  	System.out.println(u2.getActno());
  	System.out.println(u2.getBalance());
  	u2.setActno("110");  //����Ҳ�����޸�ֵ
  	System.out.println(u2.getActno());
  	
  	//������һ��
  	Account u3 = new Account("520",2000); 
  	System.out.println(u3.getActno());
  	System.out.println(u3.getBalance());
  	
  	
  }
}