import java.util.Scanner;

public class Test1 {

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

		  
		  /*Scanner sc = new Scanner(System.in);
		  System.out.println("ù��° ���� ���� �Է��ϼ���?");
		  int user1 = a1.nextInt();
		  Scanner sc2 = new Scanner(System.in);
		  System.out.println("�ι�° ���� ���� �Է��ϼ���?");
		  int user2 = sc.nextInt();
		  int user3 = user1*user2;
		  if(d<100) {
			  System.out.println("100������ ������Դϴ�.");
		  }
		  else {
				  System.out.println(" 100�̻� ��� ���Դϴ�.");
			  }
		  sc.close();
		  sc2.close();*/
	}

}
