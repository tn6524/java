
public class For2 {

	public static void main(String[] args) {

		/*int a;// for�� �ʱⰪ
		int b = 3; // ���꿡 ����� ����
		int c; // ������ ����� ���
		for (a = 1; a < 10; a++) {
			c = b * a; // ������� �۾�
			// System.out.print(c + ","); // ����� ������� �����
		}
		/*
		 * ���빮�� ���� ������� ���� �ڵ带 �ۼ��Ͻÿ�. 
		 * 45,40,35,30,25,20
		 *
		 */
		int e;
		int t = 5;
		int y;
		for (e = 9; e > 3; e--) {
			y = e * t;
			System.out.print(y + ",");
		}
		/*���빮��
		   ���� ��� ���� Ȯ�� �� �ڵ带 �����Ͽ� ����Ͻÿ�
		   11,22,33,44,55,66,77,88,99
		  */ 
		 
		int aa;
		int bb = 11;
		int cc;
		for (aa = 1; aa<10; aa++) {
			cc= aa*bb;
			System.out.print(cc+",");
			
			int z; //for
			int x; //�����
			
			for(z=1;z<10;z++) {
				x=11*z;
				
				System.out.print(x+",");
			}
		}

	}

}
