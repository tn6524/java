
public class Double_plus {

	public static void main(String[] args) {
		/* ���빮�� do~while : 30~35���� �հ�ġ�� ����Ͻÿ� */
		int a = 30;
		int t = 0;
		do {
			t += a;
			a++;
		} while (a < 36);
		System.out.println("�հ�:" + t);

		/* ���빮�� �հ���� 189�� �ֽ��ϴ�. �� 1~10���� �հ�ġ�� 
		 * ���� 189�� �� ���հ踦 ����Ͻÿ�. 
		 */
		int w =1;
		int total = 189;
		do {
			total-=w;
			w++;
		} while(w<11);
		System.out.println(total);
		
	}

}
