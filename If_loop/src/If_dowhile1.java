
public class If_dowhile1 {

	public static void main(String[] args) {

		/*
		 * ���빮�� ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�
		 */
		int a = 1;
		int b = 6;
		int c= 0;
		do {
			c = 6 * a;
			if (c > 34)
				System.out.println(c);
				a++;
		} while (a < 10);
		
			

//���빮�� 14~27���� ������ ¦������ ��� ���Ͽ� ���� ������� ����Ͻÿ�
		/*
		 * int c = 14; 
		 * int d= 0;
		 * do { 
		 * if(c%2==0) {
		 *  d+=c;
		 * } c++;
		 *  }while(c<28); {
		 * 
		 * } System.out.println(d);
		 */
	}

}
