import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		/*�� 8���� ����ڰ� ���ڸ� �Է� �մϴ�. �ش� ���ڸ� �Է��ϴ� Scanner�� userinput�̶�� �޼ҵ� ���� ó���� �ؾ� �ϸ�
�ش� ��� ���� ���� ���� �����  result���� ���� ��� �ǵ��� �ϴ� ���α׷��� �����Ͻÿ�.
��Ʈ (�ܺ�Ŭ�������� �޼ҵ�2�� ����)*/
		aa n = new aa();
		n.useroutput();
		int result = n.userinput();
		System.out.println(result);
		 }
		 

}
class aa{
	int b;
	int total;
	public void useroutput() {
		for(int w =0;w<8;w++) {
		Scanner sc = new Scanner(System.in);
			this.b = sc.nextInt();
			this.total+=b;
		}
	}
	public int userinput() {
		return this.total;
	}
}