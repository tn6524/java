import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 * ���빮��10 ���� �̿����� ���� ���� ���α׷��� �����ϰ� �˴ϴ�. ���� �׸��� ���� 3�����̸�, ��� true�� ����Ǿ�߸� ����
		 * ���μ����� ������ �˴ϴ�. ����ڿ��� �����Ǵ� ������ ������ �����ϴ�. "�����׸� �����Ͻðڽ��ϱ�?"��� �޼����� ��� ������(1),
		 * ���Ǿ���(2) ���� �׸��� �Ѱ����� �������� ���� ��� "��� �����ϼž߸� ����˴ϴ�." ��� ����մϴ�. ��� ���� �Ͽ��� ���
		 * " ȸ�������� �Ϸ� �Ǿ����ϴ�" ��� ����մϴ�
		 */

		Scanner a = new Scanner(System.in);
		int b; // w
		int d = 3;
		for (b = 1; b < 4; b++) {
			System.out.println("���� �׸� �����Ͻðڽ��ϱ�?������(1), ���Ǿ���(2)");
			int c = a.nextInt();// agree
			if (c == 1) {
				d++;
				System.out.println("����");
				if (d == 6) {
					System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
					break;
				}
			} else if (c == 2) {
				d--;
				System.out.println("���Ǿ���");

			}

		}
		if (d < 3) {
			System.out.println("��� �����ϼž߸� ����˴ϴ�.");
		}
		/*Ǯ��
		 * Scanner sc = new Scanner(System.in);
		 * int w = 1;
		 * int agree; 
		 * boolean all_agree=false;
		 * do { System.out.println("�����׸� �����Ͻðڽ��ϱ�? ������(1), ���Ǿ���(2)"); 
		 * agree =sc.nextInt();
		 * if(agree==1)
		 *  { all_agree = false;
		 *   break;
		 *    } w++;
		 *     }while(w<=3);
		 * if(all_agree==false) {
		 *  System.out.println("��� ���� �ϼž߸� ����˴ϴ�.");
		 * }else {
		 * System.out.println("ȸ��������  �Ϸ�Ǿ����ϴ�."); }
		 */
	}
}