import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		
		
		Scanner mid = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���");
		String m = mid.next();// ����ڰ� ���̵� �Է�
		
		Scanner mpass = new Scanner(System.in);
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String p = mpass.next(); //����ڰ� �н����� �Է�
		
		if (m.equals("jung")||m.equals("j1234")) {
			if (m.equals("su")&&p.equals("ssh"))
		System.out.println("�α��� �Ǽ̽��ϴ�");
		}
		else if(m.equals("su")&&p.equals("ssh"))
				System.out.println("�α��� �Ǽ̽��ϴ�");
		{
				
		}
		  
				System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���");
				{	
						System.out.println("���Ե������� ������Դϴ�.");
				}
				}
				{
}
		
	}


// System.out.printf("���̵�%s,�н�����%s",m,p);

/*
 * �α��� ���α׷� ȸ������ ���̵�� jung,su �н����� jung : j1234 su : ssh �ش� ���̵� �ܿ� ��������
 * "���Ե��� ���� ����� �Դϴ�." ��� ����մϴ� ���� �н����尡 Ʋ����� "ȸ�������� �ٽ� Ȯ���ϼ���"��� ����մϴ� ���̵� ��
 * �н����尡 ��� ������� "�α��� �Ǽ̽��ϴ�" ��� ����Ͻʽÿ�
 */
