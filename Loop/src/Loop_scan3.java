import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/* Scanner�� �Բ� do~while������ ����ڰ� �Է��ϴ°����� ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.
		 * 
		 */

		Scanner sc =new Scanner(System.in);
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		
		int b = 1;
		int aws;
		do {
		aws= a*b;
		System.out.println(a + "x" + b + "=" +aws  + ",");
		b++;
		}
		while(b<10); {
			{
			}
			
		}
				sc.close();
		
		
	}
}	
	



