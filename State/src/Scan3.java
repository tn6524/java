import java.util.Scanner;

public class Scan3 {
//���� �ش� ������ Ȯ�� �� �ڵ带 �ۼ��Ͻÿ�.
	// Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���?
	// ������� : ¦��, Ȧ�� ���Դϴ�. ��� ���
	public static void main(String[] args) {

		Scanner u = new Scanner(System.in);
		System.out.println("Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���? ");
		int k = u.nextInt();
		// %�� ���� �����鼭 ���������� Ȯ���ϴ� ���ı�
		if (k % 2 == 0) {
			System.out.println(k + "��¦���Դϴ�");
		} else {
			System.out.println(k + "��Ȧ���Դϴ�");
		}
		u.close();
	}

}
