import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * ���빮��9 a�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�. "������ �Է��ϼ���?" ��� ������ �� 5���� ������
		 * �Ǹ�, ��� ������ �ջ��� �� 5���� ������ ���� ��հ��� ����ϼ��� ��� �޼�����"�ش������� ������?"��� ��, ���� ������ 40�� ����
		 * "������Դϴ�" ��� �� ���μ��� ���� 40�� �̻� �� ��� "�հ�" ��� (�߰�) "�Է��Ͻ� ���� ���� �����ּ���"��� ���� ���� ���
		 * �� �ش� ���� �� ��ŭ �ݺ����� ������ �Ǹ�, ���� �� ��ŭ ��հ��� ���� �Ǿ�� �մϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���");
		int c = sc.nextInt();
		int b;
		double score = 0;
		for (b = 1; b < 6; b++) {
			System.out.println("������ �Է��ϼ���?");
			int a = sc.nextInt();
			score += a;
			if (c == b) {
				break;
			}

		}
		double point = score / c;
		System.out.println("a �л��� ������ " + point);
		if (point <= 40) {
			System.out.println("�����");
		} else {
			System.out.println("�հ�");
		}
		sc.close();
		//while�� 
		/*Scanner sc1 = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���:");
		int subject = sc1.nextInt();
		int w = 1;
		int user;
		int total = 0;
		while (w <= subject) {
			System.out.println("������ �Է����ּ���:");
			user = sc1.nextInt();
			total += user;
			w++;
		}
		double avg = total / subject;
		String msg;
		if (avg < 40) {
			msg = "������Դϴ�.";
		} else {
			msg = "�հ��Դϴ�";
		}
		System.out.println("���� ��� ������" + avg + msg);*/
	}

}
