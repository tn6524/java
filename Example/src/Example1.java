import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * ���빮�� while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ �����ϴ�. ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�. ��ǰ �� �ݾ�:
		 * 28000 �Դϴ�. ���� "7000 �����Ͻðڽ��ϱ�?" ��� ��µǸ� ���� 1�̶�� �Է��ϸ� �������� �ݾ׿� �߰� �Ǿ� ���ϴ�.
		 * ��,2 ��� �Է½� �������� �ݾ׿� �߰� �Ǿ����� �ȵ˴ϴ�.
		 * �� ���� Ƚ���� 4�� �Դϴ�. �������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�
		 */
Scanner a= new Scanner(System.in);
int b=1;
int c;
int total = 0;
while(b<5) {
	System.out.println(" ������ ���Ͻø� 1�� ������ ���Ͻ��� ������ 2���� �����ּ���");
	System.out.println("7000�����Ͻðڽ��ϱ� ");
	c=a.nextInt();
	if(c==1) {
		total+=7000*c;
		System.out.println("��ǰ�� �߰��˴ϴ�.");
	}else  { 
		System.out.println("��ǰ�� ��ҵ˴ϴ�."); 
		
	}
	b++;
}a.close();
System.out.println("�������� �ݾ���"+total+"�Դϴ�.");
	}

}
