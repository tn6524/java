import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		/*
		 * ������ȣ �߼ۿ� ���� ��ȣ ���ڵ� Q. �������� ��ȣ�� �Է��ϼ���? ���� 220524
		 * 
		 * ����ڰ� ���� 220524�� �ܿ� �Է½� "������ȣ�� Ʋ���ϴ�" ��� ����Ͻð� ������ ������ȣ ���ڸ� �Է½� "����Ȯ�� �Ǽ̽��ϴ�" ���
		 * ����մϴ�. ��, 220524�� java���� �� ���� ���� ����Ǵ� ������ ó�� �ϼ���
		 */
		int sc = 220524;
		//System.out.println("������ȣ��"+sc+"�Դϴ�.");
		Scanner mail = new Scanner(System.in);
		System.out.println("�������� ��ȣ�� �Է��ϼ���");
		int t = mail.nextInt();
		if (t == sc) {
			System.out.println("����Ȯ�� �Ǽ̽��ϴ�.");
		} else {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		}
		mail.close();
	}

}


/*if(����)
 * �ش� ������ ������� ����Ǵ� �ڵ�
 * else if(if �ܿ� �ٸ�����)
 * �ش� ������ ������� ����Ǵ� �ڵ�
 * else
 * if�� �ݴ� �Ǵ� ������ �ϳ��� �����ִ� ���
 * boolean a =true, false ("��� ����)
 * Scanner a = new Scanner(System.in); 
 * System.out.println("������ �Է��� �ּ���?);
 * int aa = a.nextInt();
 * 
 */


