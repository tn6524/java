import java.util.Scanner;

public class sc9 {

	public static void main(String[] args) {
		/*
		 * ���빮��. ���ǹ� �ڵ带 �ۼ� �Ͻÿ�. ���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�. ���� �⺻ �ڻ�ݾ��� :
		 * 100000 "1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�." ��� �޼����� ���� ���� ���� �Ǿ�� �մϴ�. 
		 * 1���� �Է½�"�ش� �ݾ��� �Է��ϼ���" ����ڰ� �Է��� �ݾ� + �⺻ �ڻ�ݾ��� ���� �� �ڻ�ݾ��� ����Ͻø� �˴ϴ�. 
		 * 2���� �Է½�"����� �ݾ��� �Է��ϼ���" �⺻�ڻ� �ݾ�-����ڰ� �Է��� �ݾ��� ����Ͽ� ����ϸ� �˴ϴ�.
		 * 
		 */
		Scanner a = new Scanner(System.in);
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
		int b = a.nextInt();
		if (b == 1) {
			System.out.println("�ش� �ݾ��� �Է��ϼ���");
		} else if (b == 2) {
			System.out.println("����� �ݾ��� �Է��ϼ���");
		}
		else {
			System.out.println("��ȣ�� Ȯ�� �� �ٽ� �����ּ���");
		}
		Scanner e = new Scanner(System.in);
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ���"
				+ " �Դϴ�.");
		int y = e.nextInt();
		if (y == 1) {
			System.out.println("�ش� �ݾ��� �Է��ϼ���");
		} else if (y == 2) {
			System.out.println("����� �ݾ��� �Է��ϼ���");
		}
		Scanner r = new Scanner(System.in);
		int t = r.nextInt();
		if (y == 1) {
			System.out.println(10000 + t + "���Դϴ�.");
		} else if (y == 2) {
			System.out.println(10000 - t + "���Դϴ�.");
		}
		
		
			a.close();
			e.close();
			r.close();
			
		}
	}


