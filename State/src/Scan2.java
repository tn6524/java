import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���");
		String f = e.next();
		// System.out.println(d);
		if (f.equals("kim") || f.equals("hong")) {
			// ���ڿ� ���´� Scanner�̿�� equals��� �Լ��� ����մϴ�.
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		} else {
			System.out.println("Ȯ�ε��� �ʽ��ϴ�.");
		}
		e.close();
	}

}
