
public class App {

	public static void main(String[] args) {
		// ���� 1 25+31*4+12
		// ���� 2 15*3+9+14
//�ջ� ��� ���� �� ���� ���� ����Ͻÿ�

		int a = 25 + 31 * 4 + 12;
		int b = 15 * 3 + 9 + 14;
		if (a < b) {
			System.out.println("a�� ����" + a + "�� b�� ����" + b + "�� �� ���� �� �۽��ϴ�.");
		}
		else if (a > b)
			System.out.println("b�� ����" + b + "�� a�� ����" + a + "�� �� ���� �� �۽��ϴ�.");
		else {
			System.out.println("�� ���� �����ϴ�.");
		}

		/* �ش� ���� 2������ ¦�� , Ȧ���� Ȯ���ϱ� */
		int c = b % 2; // %��ȣ�� ���� 0�Ǵ� 1�� ������ ���� ����� �˴ϴ�.
		if (c == 0) {
			System.out.println("¦�� �Դϴ�.");
		} 
		else {
			System.out.println("Ȧ�� �Դϴ�.");
		}
	}

}
