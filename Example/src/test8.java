import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {

		/*
		 * {"���=2000","����=1500","Ű��=2500"}
		 * 
		 * 
		 * 
		 * �ش� ��ǰ�� ������ �ּ���? [1.���, 2.����,3.Ű��]2
		 * 
		 * 
		 * 
		 * �ش� ��ǰ ������ �Է��� �ּ���? 5
		 * 
		 * 
		 * 
		 * �����Ͻ� �� ������ �� ������ 7500���Դϴ�.
		 * 
		 * 
		 * 
		 * abstract ���
		 * 
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int b = 0;

		int a = 0;

		System.out.println

		("�ش� ��ǰ�� ������ �ּ���? [1.���, 2.����,3.Ű��]");

		a = sc.nextInt();

		System.out.println("�ش� ��ǰ ������ �Է����ּ���?");

		b = sc.nextInt();

		apple ap = new apple();

		ap.fruit(a, b);

	}

}

abstract class shape {

	public abstract void fruit(int a, int b);

	int apple = 2000;

	int berry = 1500;

	int kiwi = 2500;

	int total = 0;

}

class apple extends shape {

	@Override

	public void fruit(int a, int b) {

		for (int w = 1; w < 4; w++) {

			if (a == 1) {

				this.total = this.apple * b;

			} else if (a == 2) {

				this.total = this.berry * b;

			} else {

				this.total = this.kiwi * b;

			}

		}

		System.out.println("�����Ͻ� �� ������ �� ������:" + this.total + "���Դϴ�.");

	}

}