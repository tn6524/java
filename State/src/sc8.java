import java.util.Scanner;

public class sc8 {

	public static void main(String[] args) {
		/*���빮��
		 * ����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�
		 * ù��° ���ڰ��� �Է��ϼ���?
		 * �ι�° ���ڰ��� �Է��ϼ���?
		 * ù��° ���ڰ� * �ι�° ���ڰ� �� ���� ����� ����Ͻÿ�
		 * ��, �ش� ������� 100 ������ ��� ��¸޽���"100������ ������Դϴ�"��� �����Ͻð� 100 �̻��� ���"�ش� ���� 100�̻� ������Դϴ�."��� ����ϼ���
		 */

  Scanner a1 = new Scanner(System.in);
  System.out.println("ù��° ���� ���� �Է��ϼ���?");
  int b = a1.nextInt();
  System.out.println("�ι�° ���� ���� �Է��ϼ���?");
  int c = a1.nextInt();
  int d = b*c;
  if(d<100) {
	  System.out.println("100������ ������Դϴ�.");
  }
  else if(d>100){
		  System.out.println("�ش� ���� 100�̻� ��� ���Դϴ�.");
	  }
  a1.close();
  }

	}

