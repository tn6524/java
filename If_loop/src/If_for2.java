
public class If_for2 {

	public static void main(String[] args) {
		// 1~100���� ���� �� 80�̻��� ���ڸ� ���
		int f;
		for (f = 1; f < 101; f++) {
			if (f > 79) {
				// System.out.println(f+" ");
			}
		}

		/*
		 * 200~300���� ���� �� 240 ������ ���ڸ� ����Ͻÿ�
		 * 
		 */
		int sc;
		for (sc = 200; sc < 301; sc++) {
			if (sc < 241) {
				System.out.println(sc + " ");
			}
		}

		final int a = 6;
		int w;
		for (w = 1; w < 11; w++) {
			if (w % a == 0) {
				// System.out.println(w+" ");
			}

		}

		// ���빮�� ������ �� 2���� �ݺ��մϴ�. ��, 2�� ����� �� 10 �̻� ���ڸ� ����մϴ�
		final int b = 2;
		int t;
		int c;
		for (t = 1; t < 10; t++) {

			c = b * t;
			if (c > 9) {
				// System.out.println(""+c);
			}
		}
		/*
		 * ���빮�� ���� ������� ���� �ش� ���� ��� �ǵ��� �ڵ带 �����Ͻÿ� 18 36 54 72 
		 */
		final int g = 18;
		int q;
		int p=0;
		for (q = 1; q < 5; q++) {
			p = q * g;
			// System.out.println(p+" ");
		}

		// ���빮�� ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ� 1~20������ ���� �Դϴ�. 6 14 17 19
		int aa;
		for (aa = 1; aa < 21; aa++) {
			if (aa == 6 || aa == 14 || aa == 17 || aa == 19) {
				System.out.println(aa + " ");

			}
		}
	}
}