import java.math.BigInteger;
import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * ���빮��7 ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� ǥ���ϴ� ���μ��� �����մϴ�. "ù��° �Է°� ��(1~10����)
		 * �Դϴ�. "�ι�° �Է°� ��(1~10����) �Դϴ�. "����° �Է°� ��(1~10����) �Դϴ�.
		 * "������ �����Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�:" +,-,*,/, �ش� �����ȣ�� �°� ������� �����Ͽ� ��������
		 * ��½�Ű�ÿ�
		 */
		int total = 0;
		double total3=0;
		int total1 = 1;
		BigInteger total2 = new BigInteger("1");
		Scanner a = new Scanner(System.in);
		System.out.println("ù��° �Է°��� �����ּ���(1~10����)");
		int b = a.nextInt();
		System.out.println("�ι�° �Է°��� �����ּ���(1~10����)");
		int c = a.nextInt();
		System.out.println("����° �Է°��� �����ּ���(1~10����)");
		int d = a.nextInt();
		System.out.println("�ش� ������ ���� ���� �����ȣ�� �����ּ���");
		/*String ms =a.next();
		 * if(ms.eq){
		 */
		
		String e = a.next();
		if (e.equals("+")) {
			total += b + c + d;
			System.out.println("�����ȣ�� ������ ��������:" + total);
		} else if (e.equals("-")) {
			total3 -= b - c - d;
			System.out.println("�����ȣ�� ������ ��������:" + total3);
		} else if (e.equals("*")) {
			total1 *= b * c * d;
			System.out.println("�����ȣ�� ������ ��������:" + total1);
		} else if (e.equals("/")) {
			total2 = total2.multiply(BigInteger.valueOf(c));
			System.out.println("�����ȣ�� ������ ��������:" + total2);
		}a.close();
	}
}
