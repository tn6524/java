
public class For1 {

	public static void main(String[] args) {
		//������ 2~3�� ���
		/*int f,ff;//�ݺ����� ����� ���� ������ �̸� �Ͽ���
		for(f=2;f<4;f++) {//ū �ݺ��� 2~3������ ȸ����
			for(ff=1;ff<10;ff++)//���� �ݺ��� 1~9������ ȸ����
				//�ش� ���� �ݺ����� �۵��� �� ���� ����� �����
				System.out.println(f+"X"+ff+"="+f*ff);
		}*/
	
		//���빮�� ������ 5~7�ܱ��� ����� �ϵ� 4������ ���������� ������ ���ı��� ����Ͻÿ� �ش� ������� �� �հ踦 ����ϼ���
int a,aa;
int b=0;
for(a=5;a<8;a++) {
	for(aa=1;aa<5;aa++) {
		System.out.println(a+"X"+aa+"="+a*aa);
	b+=a*aa;}
		
	System.out.println(b);
}

	}

}
