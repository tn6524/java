import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * ���빮��. ���ǹ� �ڵ带 �ۼ� �Ͻÿ�. ���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�. ���� �⺻ �ڻ�ݾ��� :
		 * 100000 "1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�." ��� �޼����� ���� ���� ���� �Ǿ�� �մϴ�. 1����
		 * �Է½�"�ش� �ݾ��� �Է��ϼ���" ����ڰ� �Է��� �ݾ� + �⺻ �ڻ�ݾ��� ���� �� �ڻ�ݾ��� ����Ͻø� �˴ϴ�. 2����
		 * �Է½�"����� �ݾ��� �Է��ϼ���" �⺻�ڻ� �ݾ�-����ڰ� �Է��� �ݾ��� ����Ͽ� ����ϸ� �˴ϴ�.
		 * 
		 */
		int total = 100000;
		Scanner a = new Scanner(System.in);
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
		int b = a.nextInt();
		if (b == 1) {
			System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
		} else if (b == 2) {
			System.out.println("����� �ݾ��� �Է��ϼ���");
		} else {
			System.out.println("��ȣ�� Ȯ�� �� �ٽ� �����ּ���");
		}
		
		Scanner r = new Scanner(System.in);
		int t = r.nextInt();
		if (b == 1) {
			System.out.println("�Ա� �� �����ܾ���"+(total + t) + "���Դϴ�.");
		} else if (b == 2) {
			System.out.println("��� �� �����ܾ���"+ (total - t) + "���Դϴ�.");
		}

		
		a.close();
		r.close();

		
		
		
		 /* int money = 100000;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�.");
		  int work = sc.nextInt();
		  int total; 
		  Scanner cal = new Scanner(System.in);
		  if(work==1){
		  System.out.println("�Ա� �ݾ��� �Է��ϼ���:");
		  total = cal.nextInt();
		  money= money+total;
		  }
		  else if(work==2)
		  System.out.println("��� �ݾ��� �Է��ϼ���:");
		  total = cal.nextInt();
		  money=money+total;
	       else{
		  System.out.println("�������� �ڵ尡 �ƴմϴ�.");
		  }*/
	}

}
