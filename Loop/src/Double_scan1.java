import java.util.Scanner;

public class Double_scan1 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ����ڰ� �� 3���� ���ڸ� �Է��մϴ� 3�� ���ڸ� ��� ���Ͽ� �� �հ� ���� ����Ͻÿ�
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b;
		/* long */double total = 1;// long�� �Է½� ����������� -���� �߻���
		do {
			System.out.println("���ڸ� �Է����ּ���");
			b = sc.nextInt();
			total *= b;
			a++;
		} while (a < 4);

		System.out.println("�� �հ��" + total + "�Դϴ�.");
		sc.close();
	}

}
