import java.util.Scanner;
//import : java�� �ִ� ������ �ε��� �� ����ϴ� ���
//export : java�� �ִ� ������ ������ ������ �� �ִ� ���

//java.util ��Ű�� �ȿ� Scanner Ŭ���� �κ��� �ε� �ϰ� �˴ϴ�.
//java.util ��Ű���� �׳� ������� ���ϸ� new�� �Ҵ��Ͽ� �����ڸ� ����ؾ� �մϴ�.
//��, �ش��ڵ� ��ġ�� �ۼ��ڵ庸�� �Ʒ��� ������ �ȵ˴ϴ�.
public class If4 {

	public static void main(String[] args) {

		// new : ��ü�� �����ϴ� ���� ���մϴ�.
		Scanner a = new Scanner(System.in);
		// system.in != System.out(���)

		System.out.println("���̵� �Է��ϼ���");

		String mid = a.next();
		// next() : ����ڰ� �Է��ϴ� ���¸� ���մϴ�. (����, ���ڸ� �Է� �޴� ����)

		System.out.println(mid);

		a.close();
	}

}
