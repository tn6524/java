
public class Example6 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 6 1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�. ��, 1~5������ ��� ���� ���ϰ�, 6~10������ ��� ���� ���մϴ�.
		 * �ش� �ΰ��� ���� ���Ͽ� ���Ѱ��� ū��, ���� ���� ū���� ����� ����Ͻÿ�
		 */
		// for��
		int a;
		int b = 1;
		int c = 0;
		for (a = 1; a < 11; a++) {
			if (a < 6) {
				b *= a;
			} else
				c += a;
		}
		if (b > c) {
			System.out.println("1~5���� ���� ���� �� Ů�ϴ�.");
		} else if (b<c) {
			System.out.println("6~10���� ���� ���� �� Ů�ϴ�.");
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
		// while��
		int p = 1;
		int q = 1;
		int o = 0;
		while (p < 11) {
			if (p < 6) {
				q *= p;
			} else
				o += p;
			p++;
		}
		if (q > o) {
			System.out.println("1~5���� ���� ���� �� Ů�ϴ�.");
		} else if(q<o){
			System.out.println("6~10���� ���� ���� �� Ů�ϴ�.");
		}else {
			System.out.println("�� ���� �����ϴ�.");
		}
// do while��
		int aa = 1;
		int bb = 1;
		int cc = 0;
		do {
			if (aa < 6) {
				bb *= aa;
			} else
				cc += aa;

			aa++;
		} while (aa < 11);
		if (bb > cc) {
			System.out.println("1~5���� ���� ���� �� Ů�ϴ�.");
		}  else if(bb<cc){
			System.out.println("6~10���� ���� ���� �� Ů�ϴ�.");
		}else {
			System.out.println("�� ���� �����ϴ�.");
		}
	}
}