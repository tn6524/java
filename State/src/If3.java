
public class If3 {

	public static void main(String[] args) {

		// boolean : true, false �� �����ϰ� �˴ϴ�.
	/*	boolean od = true;
		if (od = true) {
			System.out.println("ȸ�������� ���� �˴ϴ�.");
		}
		else {
			System.out.println("�̿����� �����ϼž߸� ���� �˴ϴ�.");
		}*/

		String id = "park";
		String pass = "a1234";

		// && : �Ѱ��� ���� �̻� ��� ���� ���
		// || : �Ѱ��� ���� �̻󿡼� �Ѱ��� ���� ���

		if (id == "park" && pass == "a1234") {
			System.out.println("�α��� �ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���");
		}
		if (id == "Lee" || id == "kim") {
			//if(id=="park"||id=="kim" �� �����߿� �Ѱ����� ���� ��� )
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
		}
	}

}




