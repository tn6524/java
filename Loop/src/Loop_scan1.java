import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		// for�� + Scanner

		Scanner a = new Scanner(System.in); // �Է¿��� �ε�
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���");// ��������
		int b = a.nextInt();// ����ڰ� �Է��� ����
		int c;// �ݺ����� ����ϴ� ����
		int d; // �ݺ����� ������� ��� ��
		for (c = 1; c < 10; c++) {
			d = b * c;// �������
			System.out.println(d);// ���
			a.close();// ����
		}
	}
}