import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/*
		 * ���빮�� �� 2���� ������ �ϰ� �˴ϴ�. ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� scanne�� �����Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b;
		int total = 0;
		while (a < 3) {
			System.out.println(a + "��°" + "���ڸ� �����ּ���");
			b = sc.nextInt();
			total += b;
			a++;
		}
		System.out.println("�μ��� ����:" + total);
		sc.close();
	}

}
