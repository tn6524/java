import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		byte a = 10;
		if (a < 10) {
			System.out.println("�Է��� ���� 10�̻� ���ڸ� �Է��ϼ���.");

		} else if (a >= 10 || a <= 22) { // ���ǹ��� ������ �����Ͽ� �����
			System.out.println("��÷ �Դϴ�.");

		} else {
			System.out.println("���� ���� ���� �Դϴ�.");
		}
		/*
		 * ���빮�� Q. 1~45���� ���� �ϳ��� �Է��ϼ��� 
		 * error���� 
		 * 0�� �Է� : ���� �Է��� �߸� �Ǿ����ϴ�. 
		 * 45���� ū ���ڸ� �Է� : ���ڴ� 1~45������ �Է� �����մϴ�.
		 * 7, 12, 14 ������ ���ڰ� �Է½� ��÷�Դϴ�. ��� ���
		 * �� �ܿ� ���ڽ� ������ȸ�� �����ϼ��� ��� ���
		 */

		Scanner c = new Scanner(System.in);
		System.out.println();
		int f = c.nextInt();
		if (1 <= f && f <= 6&& f<=11&&f==13&&f<=45) {
			System.out.println("Q. 1~45���� ���� �ϳ��� �Է��ϼ���");
		} else if (f == 0) {
			System.out.println("���� �Է��� �߸� �Ǿ����ϴ�.");
		}
		else if (f==7||f==12||f==14) {
			System.out.println("��÷�Դϴ�.");
		}else if(f<1||45<f) {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		} else {
			System.out.println("������ȸ�� �����ϼ���");
		}
		c.close();
	}
}





/*Ǯ��
 * Scanner c = new Scanner(System.in);
 
System.out.println("Q. 1~45���� ���� �ϳ��� �Է��ϼ���");
int f = c.nextInt();
if ( f == 0) {
	System.out.println("���� �Է��� �߸� �Ǿ����ϴ�.");
}
else if (f>45) {
	System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
}
else if (f == 7 || f == 12 || f == 14) {
	System.out.println("��÷�Դϴ�.");
}
else if(f==41) {
	System.out.println("50% ���� ��÷�Դϴ�.");
}
else {
	System.out.println("������ȸ�� �����ϼ���");
}

}
}
*/