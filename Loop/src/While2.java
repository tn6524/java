
public class While2 {

	public static void main(String[] args) {
		
		  int a = 1; int b = 4; int c; while (a < 10) { c = a * b;// �������
		  System.out.print(c + ",");
		  
		  a++;// ���� �ø���� ���� �ٸ� �� ���
		  
		  } /* ���빮�� 56,49,42,35,28,21, �ش� ������� Ȯ���Ͽ� �ݺ������� �ڵ带 �ۼ��Ͻÿ�*/
		 
		int d = 8;
		int e = 7;
		int h;
		while (d > 2) {
			h = e * d;
			 System.out.print(h + ",");

			d--;

		}
		/*
		 * ���빮��2 ���� ��� ���� Ȯ�� �� �� �ش� ��� ���� �´� �ڵ带 �ۼ��Ͻÿ� 4,7,10,13,16,19,22
		 */
		int p = 1;
		int q = 3;
		int u;
		while (p < 8) {
			u = p * q + 1;
			System.out.println(u);

			p++;
		}

	}

}
