import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		// 1~100���� ��� ���ϴ� �ݺ����� ����ÿ�
		/*
		 * int a; int total=0; for(a=1;a<101;a++) { total+=a; }
		 * System.out.println(total); 1~100���� ���� �����
		 */
		int c;
		// BigInteger : java���� ��� ������ ���� ���� �� �� �ִ� ������ �ڷ���
		BigInteger f = new BigInteger("1");// �հ迡 ����� �ڷ��� ���� 1�� ���ʰ����� ���� ��, "�� ������ �����ؾ���
		for (c = 1; c < 101; c++) {
			/*multiply :��Ģ���� ���ϱ⸦ �����
			 * add : ��Ģ���� ���ϱ⸦ �����
			 * subtract : ��Ģ���� ���⸦ �����
			 * diyide : ��Ģ���� �����⸦ �����
			 */
			f = f.multiply(BigInteger.valueOf(c));
		}
		System.out.println(f);
	}

}
