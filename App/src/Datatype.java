
public class Datatype {

	public static void main(String[] args) {
		//String : ���� "" ������ ���
		String a = "1234";
		System.out.println(a);
		/* ������ */
		byte b = 127;  //byte : -128~127
		System.out.println(b);
		
		short c = 32767;  //short : -32,768 ~ 32,767
		System.out.println(c);
		
		int d = 100000; //int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long f = 99999999999999L; //long ���� ���� L ����ؾ��� ����Ʈ�� Ǫ�� ��� �޸� �Ҵ��� �þ
		//long -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 �⺻�޸� �Ҵ翡�� �߰������ ���ɹ����� �þ
		System.out.println(f);
		/* ������ ��*/
		
		/* �Ǽ��� */
		float z = 3.5f; //float : 3.424....+38 (f�� ������ ��� �ؾ���)
		System.out.println(z);
		
		double k = 44.5178d; //double : 1.784...+308 (d�� ��/�� ��ε�)
		System.out.println(k);
		/* �Ǽ��� �� */
		
	}

}
