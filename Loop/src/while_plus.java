
public class while_plus {

	public static void main(String[] args) {
		
		/*5~10���� ���� �հ� ���� ��� */
		int w = 5; // �ʱⰪ
		int total = 0; // �հ�ġ�� ������Ű�� ���� ���� ��
		while(w<11) {
			total+=w;
			w++;
		}
		
		System.out.println("�հ�:"+total);
		/* ���빮�� 
		 * 3~8���� ���� �� �հ� ���� ����Ͻÿ�
		 * 
		 */
		int a = 3;
		int t = 1;
		while(a<9) {// ���ϱ� �հ踦 ������ 1 �⺻������ ����
			t*=a;
			a++;
		}
		System.out.println("�հ�:"+t);

	}

}
