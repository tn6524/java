import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		/*�˻��� ����� �̸��� �˻��ϰ� �˴ϴ�. (���� �޼ҵ忡�� ����)

����� ����Ʈ�� ������ �����ϴ�.  (�ܺ� Ŭ���� �� �ܺ� �޼ҵ忡�� ����)
������, �ǿ�ȯ, �ݻ���, �赿��, �����, ������, ����ȣ, ����

�ش� ����Ʈ ������ ������ �޼ҵ� ���� �����ؾ� �մϴ�.
����ڰ� �Էµ� �̸��� ���� ��� "�ش� ����ڰ� �ֽ��ϴ�." ��� ����ϰ�
���� ��� "�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�." ��� ����մϴ�.

��Ʈ : ���θ޼ҵ忡�� Scanner �۵� �ϸ�, ������ �˻��� �ܺ� Class �� �ܺ� �޼ҵ忡�� ó��*/
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		aaa a = new aaa();
		a.name(user);
		sc.close(
			);
	}

}
class aaa{
	String list[] = {"������", "�ǿ�ȯ", "�ݻ���", "�赿��", "�����", "������", "����ȣ", "����"};
	String ac =null;
	public void name(String b) {
		this.ac=b;
		boolean c = false;
		for(int w =0; w<this.list.length;w++) {
			if(ac.equals(this.list[w])) {
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
				c=true;
			} 
		}	
				
			
		if(c==false) {
			
			System.out.println("�ش� ����ڴ� ���Ե��� �ʾҽ��ϴ�.");
		}
		
		
	}
}