import java.util.Scanner;

public class For_Scan1 {

	public static void main(String[] args) {
		/*
		 * int a = 5; 
		 * System.out.println(a++); 
		 * System.out.println(++a);
		 * 
		 * int b = 10;
		 * int c = 10;
		 * int d = b+c++;
		 * System.out.println(d);
		 */
		
		Scanner sc = new Scanner(System.in); //�Է¿���
		int jumsu; // ����� �Է�
		int  f; //�ݺ���
		int total=0;//����ڰ� �Է��� ���� ���� �հ� 
		for(f=1;f<4;f++) {
			System.out.println("������ �Է����ּ���:");
			jumsu = sc.nextInt(); // ����ڰ� �Է��� ��
			total+= jumsu;// ����ڰ� �Է��� ���� �հ躯���� �̰�
			
		}
		sc.close(); // ��������
		System.out.println("�������� ����:"+total); // �հ�
	}

}
