import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 2 ����ڰ� �Է��� ���ڿ� ���缭 �������� �ۿ�Ǹ�, ������ ����� ����Ͽ� ¦�� ���� Ȧ�� ������ ����ϼ���
		 * "�����ܿ� ���� ���ڸ� �Է��ϼ���?" ��� �޼����� ��µǸ� �ش� ���ڿ� ���缭 ��� ����� ���ϸ�, ���� ���� ���� ¦�� ���� Ȧ��
		 * ������ ����Ͻø� �˴ϴ�. ��, �ش� �ݺ����� for~ do while������ �Ѱ����� �����Ͽ� �ۼ��Ͻÿ�
		 */
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("���ϴ� ���� �Է����ּ���"); int
		 * a = sc.nextInt(); int b; int total = 0; sc.close();
		 * 
		 * for (b = 1; b < 10; b++) { System.out.println(a + "x" + b + "=" + a * b);
		 * total += a * b; } System.out.println(total);
		 * 
		 * if (total % 2 == 0) { System.out.println("¦���Դϴ�."); } else {
		 * System.out.println("Ȧ���Դϴ�."); }
		 */
		/*Ǯ��*/Scanner sc = new Scanner(System.in);
		String msg = "�����ܿ� ���� ���ڸ� �Է��ϼ���";
		String msg2; // �޼��� ����
		System.out.println(msg);
		int user = sc.nextInt();
		int f = 1;
		int t = 0;
		do {
			t += user * f;
			f++;
		} while (f < 10);
		// System.out.println(t);
		if (t % 2 == 0) {
			msg2 = "¦��";
			System.out.println(msg2 + "�Դϴ�.");
		} else {
			msg2 = "Ȧ��";
			System.out.println(msg2 + "�Դϴ�.");
		}
		sc.close();
	}
}
