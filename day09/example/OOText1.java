/*
����������ΪҪ����������ܷ���Student.java�������״̬��
*/
public class OOText1
{
	public static void main(String[ ] args)
	{
			//ͨ��һ�������ʵ�����������
	   // ʵ����������﷨:new ����()
		//new��java���Ե��е�һ�������
		//new������������Ǵ�������,�ڶ��ڴ浱�п����µ��ڴ�ռ�
		//�������ڴ�:������ص�ʱ��, class.�ֽ������Ƭ�α����ص����ڴ�ռ䵱��
		//ջ�ڴ�(�ֲ�����):��������Ƭ��ִ�е�ʱ��,����÷��������ڴ�ռ�,��ջ�ڴ���ѹջ
		//���ڴ�:new�Ķ����ڶ��ڴ��д洢  ��Student.java�ı����ڴ��ڶ���
		Student stu = new Student(); //��������  ��ʽ��new ����()  stu��ŵ�����Student�ĵ�ַ��stu�൱��ָ�룬ֻ����û����*������
		                             //Ҫд��Student stu����Ϊ��ŵ���Student���͵ĵ�ַ
		//System.out.println(stu); ���������������Ҫ�ֿ�����ſ���
		//��ȡ����ֵ
		System.out.println(stu.no); //stu������Student�ĵ�ַ�����Կ���ͨ��stu.no�ҵ�no����
		System.out.println(stu.addr);
		//�޸�ֵ
		stu.no = 2343;
		System.out.println(stu.no);
		
		Student stude = stu;  //����д��û���ڴ���һ������ֻ�ǰ�stu����ĵ�ַ������stude��Studeָ��Ļ���Student�����
		System.out.println(stude.no);
		
		
	}
}