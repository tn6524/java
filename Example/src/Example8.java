import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * ���빮��8 ����� �н������ a1234�Դϴ�. ����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ�̻� ���н� ������ ���� ��� �ǵ��� �մϴ�.
		 * "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�." ��, �н����尡 ���� ��� " �α��� �ϼ̽��ϴ�" ��� ��µǾ��մϴ�.
		 */
		String a = "a1234";
		Scanner b = new Scanner(System.in);
		int c;
		int g=3;
		System.out.println("�н����带 �Է��ϼ���");
		for (c = 1; c < 4; c++) {
			String pass = b.next();
			if (pass.equals(a)) {
				System.out.println("�α��� �ϼ̽��ϴ�.");
				break;
				
			} else {
				System.out.println("�н����带 �ٽ� �Է��ϼ���");

			}
			g--;
			if(g==0) {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
			}b.close();

		}
		/*/final String pw = "a1234";
		int q = 3;
		Scanner sc = new Scanner(System.in);
		int w = 1;
		String msg = "�н����带 �Է����ּ���";
		while(w<4) {
			System.out.println(msg);
			String userpw =sc.next();
			if(pw.equals(userpw))
			System.out.println("�α��� �Ǿ����ϴ�.");
			break;
		}
		else {
			msg = "�ùٸ� �н����带 �־��ּ���";
			q--;
			if(q==0) {
				System.out.println("�н����� Ƚ���������� ����� ������ �湮�ϼž� �մϴ�.");
		}
		w++;
	}*/
	}
}
