
public class If2 {

	public static void main(String[] args) {
		String mid1 = "Hong";
		String mid2 = "Kim";
		String mpass = "a123456";
		/* �ش� ���ǹ��� ���ڷ� Ȯ���ϴ� �������� �̸� else���� ����Ǵ� �κ� */
		if (mid1 == "Hong") {
			System.out.println("ȯ���մϴ�.");
		} else if (mid1 == "Park") {// �߰��� �񱳴���� ���� ���
			System.out.println("ȯ���մϴ�.");
		} else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");

		}
		/* ���̵� �� �н����带 ��� �����ϴ� ���� ���ǹ� */
		if (mid2 == "kim") { //ū if��
			
			// ���� if��
			if (mpass == "a123456") {
				System.out.println("�α��� �ϼ̽��ϴ�.");
			} else {
				System.out.println("�н����尡 Ʋ���ϴ�.");
			}

		} else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}
		
		
	}
}