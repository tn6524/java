import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * ���빮��3 ����ڰ� �ش� ���� �Է��մϴ�. �� ����ڰ� 2���� ���ڸ� �Է��ϵ� ù��° ���ڿ� �ι��� ���� ���� �ȿ� �ִ� ��� ���ڸ�
		 * ���ؼ� ������� �������� �����Ͻÿ�. ��, �ش� �ڵ�� do~while �ۼ��մϴ�. ����) ù��° ���� ���ڴ�? 5 �ι��� ���� ���ڴ�?
		 * 10 ���� ���� ��� �հ�� : 45 �Դϴ�.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int total = 0;
		System.out.println("ù��° ���� ���ڴ�?");
		int b = sc.nextInt();
		System.out.println("�ι�° ���� ���ڴ�?");
		int c = sc.nextInt();
		do {
			total += b;
			b++;
		} while (b <= c);
		System.out.println("��� �հ��:" + total);
		sc.close();
	}

}
