
public class for_plus {

	public static void main(String[] args) {
		/*
		 * 1~10���� ��� ���ڸ� ���� ������� ����Ͻÿ�.
		 */
		/*
		 * int f; int total = 0; for (f = 1; f < 11; f++) {//total�������� �ݺ����� ���������� ������Ŵ
		 * //total = total + f; total += f; } System.out.println("�� �հ�:" + total);
		 * //+=(���ϱ��Ҵ�)-=(�����Ҵ�)*=(���ϱ��Ҵ�)/=(�������Ҵ�) //b =b -f; -> b-=f;
		 * 
		 * /* ���빮�� ��ü���� 500�� �ֽ��ϴ�. �� 8ȸ ���� �ݺ��Ǹ鼭 �ѹ� �ݺ��Ҷ� ���� 12�� �����ϵ��� �Ͽ� ���� ���� ����Ͻÿ�
		 */
		/*int a;
		int total = 500;
		for (a = 1; a < 9; a++) {
			total -= 12;
		//	System.out.println("���� ��:" + total);
		}

		int b;
		int tota = 4200;
		for (b = 1; b < 20; b++) {
			tota -= 120;
			//System.out.println(tota);
		}
		/*
		 * ���빮��
		 * ������ 2�� 2*1~2*9���� �� �հ踦 ����Ͻÿ�
		 * �հ� 90 
		 * 
		 */
		int c;
		int t = 0;
		for (c=1; c<10; c++) {
			t+=c*2;
		}
		System.out.println(t);
	}
}