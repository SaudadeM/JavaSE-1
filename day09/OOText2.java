//������  �����ͼ
public class OOText2
{
	public static void main(String[ ] args)
	{
		//��������  u������  �Ǿֲ�����
		User u = new User();
		
		//��������ֵ
		System.out.println(u.no);//0
    System.out.println(u.name);//0
    System.out.println(u.addr);//null
    //��ֵ
    u.no = 110;
    u.name = "jack";  //���Ҳ�������16��һ����ֻ�������ü�new����ʵ���ϻ��ǻᴴ������
    u.addr = new Address();  // Ҫʹ��u.addr.��Ϊaddr���������ݣ�����Ҫʹ�����͵ô����������Դ�ʱu.addr�����ŵ��Ƕ���Address�ĵ�ַ
    u.addr.city = "�ߺ�";
    //u.addr.city = "�ߺ�";  //��û��addr��������֮ǰ��������д����Ϊ��ʱaddr��û�д�ŵ�ַ������Ҫ�ȴ�������ʹ���ŵ�ַ.����23�в������
    
    System.out.println(u.no);
    System.out.println(u.name);
    
    //System.out.println(u.addr.city);
    
    System.out.println(u.addr.city);
    
    
	}
}